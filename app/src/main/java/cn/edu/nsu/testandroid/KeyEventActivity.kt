package cn.edu.nsu.testandroid

import android.os.Bundle
import android.view.KeyEvent
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

private const val STEP = 20   //编译期常量
class KeyEventActivity : AppCompatActivity() {
    //声明成员变量
    private var mAlphavalueText: TextView? = null
    private var mImage: ImageView? = null

    private var mAlphavalue = 100  //透明度初始值为100
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.key_event_layout)

        mImage = findViewById<ImageView>(R.id.image)
        mAlphavalueText = findViewById<TextView>(R.id.alphavalue)
        mImage?.imageAlpha = mAlphavalue  //设置图片透明度，imageAlpha是图片视图透明度属性
        mAlphavalueText?.text = "Alpha=${mAlphavalue * 100 / 255}%"//计算透明度百分比
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        when (event?.action) {
            KeyEvent.ACTION_DOWN ->
                Toast.makeText(this, "键盘按下", Toast.LENGTH_SHORT).show()
        }

        when (keyCode) {
            //增大声音键
            KeyEvent.KEYCODE_VOLUME_UP ->
                mAlphavalue += STEP

            //减小声音键
            KeyEvent.KEYCODE_VOLUME_DOWN ->
                mAlphavalue -= STEP
        }
        if (mAlphavalue >= 255) {
            mAlphavalue = 255
        }
        if (mAlphavalue <= 0) {
            mAlphavalue = 0
        }
        mImage?.imageAlpha = mAlphavalue
        mAlphavalueText?.text = "Alpha=${mAlphavalue * 100 / 255}%"
        return super.onKeyDown(keyCode, event)
    }

}