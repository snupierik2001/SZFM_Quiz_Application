package com.example.quizapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import com.example.quizapp.databinding.ActivityRegistrationBinding
import com.google.firebase.auth.FirebaseAuth

class RegistrationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegistrationBinding
    private lateinit var firebaseAuth: FirebaseAuth

    private var progressBar: ProgressBar? = null
    private var i = 0

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

        progressBar = findViewById(R.id.progress_Bar)

        binding.alreadyUser.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        binding.regButton.setOnClickListener {
            val email = binding.emailEt.text.toString()
            val pass = binding.passwordEt.text.toString()
            val confirmPass = binding.confirmPasswordEt.text.toString()

            if (email.isNotEmpty() && pass.isNotEmpty() && confirmPass.isNotEmpty()) {
                if (pass == confirmPass) {
                    progressBar!!.visibility = View.VISIBLE

                    i = progressBar!!.progress

                    Thread {
                        while (i < 100) {
                            i += 1
                            Handler(Looper.getMainLooper()).postDelayed({
                                progressBar!!.progress = i
                            }, 6000)
                            try {
                                Thread.sleep(1000)
                            } catch (e: InterruptedException) {
                                e.printStackTrace()
                            }
                        }
                        progressBar!!.visibility = View.INVISIBLE
                    }.start()
                    firebaseAuth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener {
                        if (it.isSuccessful) {
                            startActivity(Intent(this, LoginActivity::class.java))
                            Toast.makeText(
                                this,
                                "A fiók regisztrációja sikerült!",
                                Toast.LENGTH_LONG
                            ).show()
                            finish()
                        } else {
                            Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()
                        }
                    }
                } else {
                    Toast.makeText(this, "Nem egyeznek meg a jelszavak!", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Nem maradhat üresen mező!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}