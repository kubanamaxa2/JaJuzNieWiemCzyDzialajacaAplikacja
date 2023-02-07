package com.ft.jajuzniewiemczydzialajacaaplikacja

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.SeekBar
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var seekBar1: SeekBar? = null
    var seekBar2: SeekBar? = null
    var seekBar3: SeekBar? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        seekBar1 = findViewById(R.id.seekBar)
        seekBar2 = findViewById(R.id.seekBar2)
        seekBar3 = findViewById(R.id.seekBar3)
        val btn = findViewById<Button>(R.id.button)
        val obraz1 = findViewById<ImageView>(R.id.imageView)
        val obraz2 = findViewById<ImageView>(R.id.imageView2)
        val obraz3 = findViewById<ImageView>(R.id.imageView3)
        var pomocnicza : Float = "0.0".toFloat()

        seekBar1?.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(
                seekBar: SeekBar, progress: Int,
                fromUser: Boolean
            ) {
                pomocnicza = progress.toFloat() / 100;
                pomocnicza.toFloat()
                obraz1.scaleX = pomocnicza.toFloat() + 0.1.toFloat()
                obraz1.scaleY = pomocnicza.toFloat() + 0.1.toFloat()
            }
            override fun onStartTrackingTouch(seekBar: SeekBar) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
            }
        })
        seekBar2?.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(
                seekBar: SeekBar, progress: Int,
                fromUser: Boolean
            ) {
                pomocnicza = progress.toFloat() / 100;
                pomocnicza.toFloat()
                obraz2.scaleX = pomocnicza.toFloat() + 0.1.toFloat()
                obraz2.scaleY = pomocnicza.toFloat() + 0.1.toFloat()

            }
            override fun onStartTrackingTouch(seekBar: SeekBar) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
            }
        })
        seekBar3?.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(
                seekBar: SeekBar, progress: Int,
                fromUser: Boolean
            ) {
                pomocnicza = progress.toFloat() / 100;
                pomocnicza.toFloat()
                obraz3.scaleX = pomocnicza.toFloat() + 0.1.toFloat()
                obraz3.scaleY = pomocnicza.toFloat() + 0.1.toFloat()

            }
            override fun onStartTrackingTouch(seekBar: SeekBar) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
            }
        })

    btn.setOnClickListener{
        seekBar1?.progress = 0
        seekBar2?.progress = 0
        seekBar3?.progress = 0
        obraz1.scaleX = 1.toFloat()
        obraz1.scaleY = 1.toFloat()
        obraz2.scaleX = 1.toFloat()
        obraz2.scaleY = 1.toFloat()
        obraz3.scaleX = 1.toFloat()
        obraz3.scaleY = 1.toFloat()
        }
    }

}