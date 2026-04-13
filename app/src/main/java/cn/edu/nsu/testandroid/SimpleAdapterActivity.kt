package cn.edu.nsu.testandroid

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

private val names = arrayOf("甄嬛", "皇后", "安嫔")
private val says = arrayOf("终究是错付了啊", "臣妾做不到啊", "宝娟，我的嗓子~")
private val imgIds = arrayOf(R.drawable.huan, R.drawable.queen, R.drawable.an)
class SimpleAdapterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.simple_adapter_layout)

    }
}