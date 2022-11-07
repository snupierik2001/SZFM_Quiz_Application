package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.quizapp.databinding.ActivityLoginBinding
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {

    // FireBase-hez szükséges változók deklarálása.
    private lateinit var binding: ActivityLoginBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

        // "Nincs fiókja?.." gomb megnyomására áttér a regisztrációs menüre.
        binding.gotoRegistration.setOnClickListener {
            startActivity(Intent(this, RegistrationActivity::class.java))
        }
        
        // Email és jelszó lekérése adatbázisból és bejelentkeztetés ha egyik mező se üres és létezik a fiók.
        binding.loginBtn.setOnClickListener {
            val email = binding.emailEt.text.toString()
            val pass = binding.passwordEt.text.toString()

            if (email.isNotEmpty() && pass.isNotEmpty()) {
                firebaseAuth.signInWithEmailAndPassword(email, pass).addOnCompleteListener {
                    if (it.isSuccessful) {
                        startActivity(Intent(this, SelectQuizActivity::class.java))
                    } else {
                        Toast.makeText(this, "Nincs ilyen fiók regisztrálva!", Toast.LENGTH_SHORT).show()
                    }
                }
            } else {
                Toast.makeText(this, "Nem maradhat üresen mező!", Toast.LENGTH_SHORT).show()
            }
        }

        binding.gotoForgotPassword.setOnClickListener{
            startActivity(Intent(this, ForgotPasswordActivity::class.java))
        }
    }

}