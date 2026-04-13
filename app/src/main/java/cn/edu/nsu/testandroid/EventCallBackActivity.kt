package cn.edu.nsu.testandroid

import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class EventCallBackActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_event_call_back)
        val btn=findViewById<Button>(R.id.btn)
        btn.setOnTouchListener(object:View.OnTouchListener{
            override fun onTouch(p0: View?, p1: MotionEvent?): Boolean {
                //消息提示
                Toast.makeText(this@EventCallBackActivity,
                    "activity收到onTouch事件监听",Toast.LENGTH_SHORT).show()
                //返回true，表示事件不会向外扩散
                return false
            }
        })
    }
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        super.onTouchEvent(event)
        //消息提示
        Toast.makeText(this, "activity回调onTouchEvent方法", Toast.LENGTH_SHORT).show()
        //返回false，表示事件会向外层（父容器）扩散
        return true
    }
}