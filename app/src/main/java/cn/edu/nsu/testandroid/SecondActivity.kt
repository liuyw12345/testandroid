package cn.edu.nsu.testandroid

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.second_layout)
//        val userName = intent.getStringExtra("userName")
//        val userAge = intent.getIntExtra("userAge", 0)
        val bundle=intent.getBundleExtra("message")
        val userName = bundle?.getString("userName")
        val userAge = bundle?.getInt("userAge")
        val textview  = findViewById<TextView>(R.id.text2)

        textview.setText("userName is:$userName,userAge is:$userAge")
        }
    }