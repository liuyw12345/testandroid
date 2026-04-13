package cn.edu.nsu.testandroid

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.snapshots.SnapshotContextElement
import com.google.android.material.snackbar.Snackbar

class FirstActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(p0: View?) {
        val textview = findViewById<TextView>(R.id.userName)
        textview.text = "名字:"
    }

    val tag = "FirstActivity"
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


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first_layout)
        val button = findViewById<Button>(R.id.login)
        val text = findViewById<TextView>(R.id.userName)
        button.setOnClickListener (
            object : View.OnClickListener {
                override fun onClick(p0: View?) {

                    text.text = "名字:"
                }
            }
        )
        }
//        Log.d
//        Log.d(tag, "Task id id $taskId")
//
//
//        val radioGroup = findViewById<RadioGroup>(R.id.radio_group)
//        radioGroup.setOnCheckedChangeListener { group, i ->
//            if (i == R.id.man) {
//                Toast.makeText(this, "性别为男", Toast.LENGTH_SHORT).show()
//            } else {
//                Toast.makeText(this, "性别为女", Toast.LENGTH_SHORT).show()
//            }
//
//        }
//        val sing = findViewById<CheckBox>(R.id.sing)
//        sing.setChecked(true)
//        sing.setOnCheckedChangeListener { c, b ->
//            if (b) {
//                Toast.makeText(this, c.text.toString(), Toast.LENGTH_SHORT).show()
//                Snackbar.make(
//                    sing, c.text.toString(),
//                    Snackbar.LENGTH_SHORT
//                ).setAction("确定") {
//                    Toast.makeText(
//                        this, "信息以确定",
//                        Toast.LENGTH_SHORT
//                    ).show();
//                }.show()
//            }
//        }
//        val image = findViewById<ImageView>(R.id.image)
//        image.setOnClickListener {
//            image.setImageResource(R.drawable.i3)
//            image.setScaleType(ImageView.ScaleType.CENTER)
//        }
//
//
//        val requestDataLauncher =
//            registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
//                if (result.resultCode == RESULT_OK) {
//                    val returnedData = result.data?.getStringExtra("data")
//                    Log.d(tag, "$returnedData")
//                }
//
//            }
//        val startSecondActivity = findViewById<Button>(R.id.button)
//        startSecondActivity.setOnClickListener {
//            val intent = Intent(this, SecondActivity::class.java)
//            Toast.makeText(this, "跳转到SecondActivity", Toast.LENGTH_SHORT).show()
//            startActivity(intent)
//            intent.putExtra("userName","Jack")
//            intent.putExtra("userAge",20)
//            val bundle = Bundle()
//            bundle.putString("userName", "Jack")
//            bundle.putInt("userAge", 20)
//            intent.putExtra("message", bundle)
        // startActivityForResult(intent, 1)
        // requestDataLauncher.launch(intent)
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



//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//        when (requestCode) {
//            1 -> if (resultCode == RESULT_OK) {
//                val returnData = data?.getStringExtra("data")
//                Log.d(tag, "$returnData")
//            }
//        }
//    }
