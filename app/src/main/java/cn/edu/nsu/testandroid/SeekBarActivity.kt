package cn.edu.nsu.testandroid

import android.os.Bundle
import android.util.Log
import android.widget.SeekBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SeekBarActivity : AppCompatActivity(), SeekBar.OnSeekBarChangeListener {
    var mProgressText: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.seek_bar_layout)

        mProgressText = findViewById(R.id.progress)

        val seekBar1 = findViewById<SeekBar>(R.id.seekBar1)
        seekBar1.setOnSeekBarChangeListener(this)

        val seekBar2 = findViewById<SeekBar>(R.id.seekBar2)
        seekBar2.setOnSeekBarChangeListener(this)

    }

    override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
        mProgressText?.text = "当前进度:${progress}%"
    }

    override fun onStartTrackingTouch(seekBar: SeekBar?) {
        Log.d("SeekBarActivity", "开始拖动")
    }

    override fun onStopTrackingTouch(seekBar: SeekBar?) {
        Log.d("SeekBarActivity", "停止拖动")
    }
}