package com.example.grocery

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    //
    private lateinit var editTextEmail: EditText
    private lateinit var editTextPassword: EditText
    private lateinit var buttonRegister: Button
    private lateinit var buttonCreateAccount: Button
    private lateinit var firebaseAuth: FirebaseAuth
//
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//
//        firebaseAuth = FirebaseAuth.getInstance()
//
//        editTextEmail = findViewById(R.id.editTextEmail)
//        editTextPassword = findViewById(R.id.editTextPassword)
//        buttonRegister = findViewById(R.id.buttonRegister)
//
//        buttonRegister.setOnClickListener {
//            val email = editTextEmail.text.toString()
//            val password = editTextPassword.text.toString()
//
//            if (email.isNotEmpty() && password.isNotEmpty()) {
//                firebaseAuth.createUserWithEmailAndPassword(email, password)
//                    .addOnCompleteListener(this) { task ->
//                        if (task.isSuccessful) {
//                            // Account creation success
//                            Toast.makeText(
//                                this,
//                                "Account created successfully.",
//                                Toast.LENGTH_SHORT
//                            ).show()
//                            // You can navigate back to the login activity or any other desired activity
//                            finish()
//                        } else {
//                            // Account creation failed
//                            Toast.makeText(
//                                this,
//                                "Account creation failed.",
//                                Toast.LENGTH_SHORT
//                            ).show()
//                        }
//                    }
//            } else {
//                Toast.makeText(this, "Please enter email and password", Toast.LENGTH_SHORT)
//                    .show()
//            }
//        }
//    }
//}
    editTextEmail = findViewById(R.id.editTextEmail)
    editTextPassword = findViewById(R.id.editTextPassword)
    buttonRegister = findViewById(R.id.buttonLogin)
    buttonCreateAccount = findViewById(R.id.buttonCreateAccount)
    firebaseAuth = firebaseAuth

    buttonRegister.setOnClickListener {
        val email = editTextEmail.text.toString()
        val password = editTextPassword.text.toString()
        //login take email,password

    }

    }
    private fun login(email:String,password:String){
        firebaseAuth.signInWithEmailAndPassword(email,password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                   startActivity(
                       Intent(this,homeactivity::class.java)
                   )
                    Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
                } else {
                    // If sign in fails, display a message to the user.
                    Toast.makeText(this, "Login failed", Toast.LENGTH_SHORT).show()
                }
            }
    }

    }


