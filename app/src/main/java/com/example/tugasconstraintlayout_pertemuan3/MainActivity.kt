package com.example.tugasconstraintlayout_pertemuan3

import android.graphics.Color
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import android.widget.EditText
import android.widget.Button



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val txtLogin: TextView = findViewById(R.id.txt_login)
        val text = "Do you have an acoount? Login"

        val spannableString = SpannableString(text)

        val blue = Color.parseColor("#007CFF")

        spannableString.setSpan(
            ForegroundColorSpan(blue),
            text.indexOf("Login"),
            text.indexOf("Login") + 5,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )

        txtLogin.text = spannableString

        val inputEmail: EditText = findViewById(R.id.input_email)
        val inputFullname: EditText = findViewById(R.id.input_fullname)
        val inputUsername: EditText = findViewById(R.id.input_username)
        val inputPassword: EditText = findViewById(R.id.input_password)
        val buttonSignUp: Button = findViewById(R.id.button_signup)

        buttonSignUp.setOnClickListener {
            val email = inputEmail.text.toString()
            val fullname = inputFullname.text.toString()
            val username = inputUsername.text.toString()
            val password = inputPassword.text.toString()
            Toast.makeText(this,"Email: $email", Toast.LENGTH_LONG).show()
            Toast.makeText(this,"Fullname: $fullname", Toast.LENGTH_LONG).show()
            Toast.makeText(this,"Username: $username", Toast.LENGTH_LONG).show()
            Toast.makeText(this,"Password: $password", Toast.LENGTH_LONG).show()
        }
    }
}