package cn.edu.nsu.testandroid

import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SimpleAdapterActivity : AppCompatActivity() {
    //初始化变量
    private val names = arrayOf("甄嬛", "皇后", "安嫔")
    private val says = arrayOf("终究是错付了啊", "臣妾做不到啊", "宝娟，我的嗓子~")
    private val imgIds = arrayOf(R.drawable.huan, R.drawable.queen, R.drawable.an)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.listview_simple_layout)

        //创建可变列表，其中每个元素都是一个字符串到任意类型（any）的映射
        val listitem = mutableListOf<Map<String, Any>>()
        //定义被添加到Map映射上的键名
        val from = arrayOf("touxiang", "name", "says")
        //将绑定数据的视图的id和form参数对应
        val to = intArrayOf(R.id.imgtou, R.id.name, R.id.says)

        for (i in 0 until names.size) {
            val showitem =
                mutableMapOf<String, Any>(
                    "touxiang" to imgIds[i],
                    "name" to names[i],
                    "says" to says[i]
                )
            listitem.add(showitem)
        }
        //设置adapter
        val adapter2 = SimpleAdapter(this, listitem,
            R.layout.simple_adapter_layout, from, to)

        //适配器与控件绑定
        val listview = findViewById<ListView>(R.id.listview)
        listview.adapter = adapter2
    }

}