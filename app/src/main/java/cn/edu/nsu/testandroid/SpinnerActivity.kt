package cn.edu.nsu.testandroid

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

// 建议将常量放在类外面或 companion object 中
val COLORS = arrayOf("红色", "橙色", "黄色", "绿色", "蓝色", "紫色")

class SpinnerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.spinner_layout)

        val adapter = ArrayAdapter<String>( // 改为 String 更明确
            this,
            android.R.layout.simple_spinner_item,
            COLORS
        )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        val spinner = findViewById<Spinner>(R.id.spinner)
        spinner.adapter = adapter

        // 核心修复点：将两个 override 方法都放在 object 内部
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                Toast.makeText(
                    this@SpinnerActivity, "选择了选项：${COLORS[p2]}",
                    Toast.LENGTH_SHORT
                ).show()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                Toast.makeText(this@SpinnerActivity, "没有选中", Toast.LENGTH_SHORT).show()
            }
        }
    } // onCreate 结束
} // Activity 类结束