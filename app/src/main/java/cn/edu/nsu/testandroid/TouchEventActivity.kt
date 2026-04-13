package cn.edu.nsu.testandroid

import android.os.Bundle
import android.view.MotionEvent
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TouchEventActivity : AppCompatActivity() {
    private var mAction: TextView? = null
    private var mPosition: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.touch_event_activity)

        mAction = findViewById<TextView>(R.id.action)
        mPosition = findViewById<TextView>(R.id.position)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        val action = event?.action   // 获得事件动作
        when (action) {
            MotionEvent.ACTION_UP -> mAction?.text = "手指抬起"
            MotionEvent.ACTION_DOWN -> mAction?.text = "手指按下"
            else -> mAction?.text = "手指移动"
        }
        val X = event?.getX() // 获得当前位置坐标
        val Y = event?.getY()
        mPosition?.text = "位置 = ( $X  ,  $Y  )"

        //调用父类onTouchEvent方法
        return super.onTouchEvent(event)
    }

}