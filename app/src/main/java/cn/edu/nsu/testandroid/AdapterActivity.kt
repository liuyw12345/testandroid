package cn.edu.nsu.testandroid

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AdapterActivity : AppCompatActivity() {
    val CONTENT = arrayOf(
        "China",
        "China1",
        "china2",
        "USA",
        "USA1",
        "USA2",
        "唱歌",
        "china",
        "cd",
        "ch",
        "chi",
        "chin"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.adapter_layout)
         val adapter =
             ArrayAdapter(this, android.R.layout.simple_list_item_1, CONTENT)
        val autoTextView = findViewById<AutoCompleteTextView>(R.id.autoTextView)
        autoTextView.setAdapter(adapter)
        autoTextView.setThreshold(1)//输入一个字母就开始提示
    }
}