package cn.edu.nsu.testandroid

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.second_layout)
        Log.d("SecondActivity","Task id id $taskId")
//        val userName = intent.getStringExtra("userName")
//        val userAge = intent.getIntExtra("userAge", 0)
        val bundle = intent.getBundleExtra("message")
        val userName = bundle?.getString("userName")
        val userAge = bundle?.getInt("userAge")
        val textview = findViewById<TextView>(R.id.text2)
        textview.text = "userName is:$userName,userAge is:$userAge"
        val backFirstActivity = findViewById<Button>(R.id.button2)
        backFirstActivity.setOnClickListener {
//            val intent = Intent()
//            intent.putExtra("data", "返回FirstActivity")
//            setResult(RESULT_OK, intent)
//            finish()
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)




        }
    }
    override  fun onDestroy(){
        super.onDestroy()
        Log.d("SecondActivity","onDestroy")
    }


}