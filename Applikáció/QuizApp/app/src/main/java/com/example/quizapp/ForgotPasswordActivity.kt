package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.quizapp.databinding.ActivityForgotPasswordBinding
import com.google.firebase.auth.FirebaseAuth

class ForgotPasswordActivity : AppCompatActivity() {

    private lateinit var binding: ActivityForgotPasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForgotPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.forgotPasswordBtn.setOnClickListener {
            val email: String = binding.forgotEmailEt.text.toString().trim { it <= ' ' }
            if (email.isNotEmpty()) {
                FirebaseAuth.getInstance().sendPasswordResetEmail(email)
                    .addOnCompleteListener { task ->
                        if (task.isSuccessful) {
                            Toast.makeText(
                                this@ForgotPasswordActivity,
                                "A jelszó visszaállító email elküldésre került!",
                                Toast.LENGTH_SHORT
                            ).show()
                            finish()
                        }else{
                            Toast.makeText(
                                this@ForgotPasswordActivity,
                                "Nem sikerült elérni ezt az email címet!",
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    }
            } else {
                Toast.makeText(
                    this@ForgotPasswordActivity,
                    "Kérem adjon meg egy email címet!",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}