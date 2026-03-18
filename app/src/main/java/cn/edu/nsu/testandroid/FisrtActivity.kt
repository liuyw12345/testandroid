package cn.edu.nsu.testandroid

import android.content.ComponentName
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material3.SecondaryTabRow
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class FirstActivity : AppCompatActivity() {
    val tag = "FirstActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first_layout)
        Log.d(tag, "onCreate")
        val startSecondActivity = findViewById<Button>(R.id.button)
        startSecondActivity.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
//            intent.putExtra("userName","Jack")
//            intent.putExtra("userAge",20)
            val bundle = Bundle()
            bundle.putString("userName", "Jack")
            bundle.putInt("userAge", 20)
            intent.putExtra("message", bundle)
            startActivityForResult(intent, 1)
//            val it = Intent() //创建一个Intent对象

            //使用setComponent方法设置组件名称

//            it.setComponent(ComponentName("cn.edu.nsu.testandroid",
//                "cn.edu.nsu.testandroid.SecondActivity"))
//            //使用属性设置组件
//
//
//            startActivity(it)//启动Intent
//            val intent = Intent("com.example.testandroid.MyACTION")
//            intent.addCategory("com.example.testandroid.MY_CATEGORY")
//           startActivity(intent)

//            val intent = Intent(Intent.ACTION_VIEW)
//               intent.data = Uri.parse("https://www.baidu.com")
//           // intent.data = Uri.parse("tel:10086")
//            intent.setPackage("cn.edu.nsu.testandroid")
//            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(tag, "onStart")
    }

    //恢复
    override fun onResume() {
        super.onResume()
        Log.d(tag, "onResume")
    }

    //暂停
    override fun onPause() {
        super.onPause()
        Log.d(tag, "onPause")
    }

    //停止
    override fun onStop() {
        super.onStop()
        Log.d(tag, "onStop")
    }

    //销毁
    override fun onDestroy() {
        super.onDestroy()
        Log.d(tag, "onDestroy")
    }

    //重启
    override fun onRestart() {
        super.onRestart()
        Log.d(tag, "onRestart")
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (requestCode) {
            1 -> if (resultCode == RESULT_OK) {
                val returnData = data?.getStringExtra("data")
                Log.d(tag, "$returnData")
            }
        }
    }

}
