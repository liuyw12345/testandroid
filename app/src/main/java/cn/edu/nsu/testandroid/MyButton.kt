package cn.edu.nsu.testandroid

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton

class MyButton(context: Context, attrs: AttributeSet) : AppCompatButton(context, attrs) {
    //重写onTouchEvent触碰事件的回调方法
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        super.onTouchEvent(event)
        //消息提示
        Toast.makeText(getContext(), "myButton回调onTouchEvent方法", Toast.LENGTH_SHORT).show()
        //返回false，表示事件会向外层（父容器）扩散
        return true
    }
}

