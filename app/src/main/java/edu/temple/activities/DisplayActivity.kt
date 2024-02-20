package edu.temple.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        with (findViewById<TextView>(R.id.lyricsDisplayTextView)) {
            val textSize = intent.getIntExtra(SIZE_KEY, 22)
            this.textSize = textSize.toFloat()
        }


    }
}