package cn.edu.nsu.testandroid

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

val strs = arrayOf(
    "苹果",
    "香蕉",
    "柠檬",
    "橘子",
    "西瓜",
    "榴莲",
    "樱桃",
    "百香果",
    "水蜜桃",
    "芒果",
    "奇异果",
    "梨",
    "草莓",
    "猕猴桃",
    "西梅",
    "杨梅",
    "芭乐",
    "火龙果",
    "山竹",
    "释迦果"
)

class ListViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.listview_layout)
        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1, strs
        )
        val listView = findViewById<ListView>(R.id.listview)
        listView.adapter = adapter


    }
}