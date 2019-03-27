package com.faz.widgets

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.floor

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rangeSeek.thumbTextGenerator = { value ->
            val selectedMonth = floor(11 * value).toInt()
            monthNames[selectedMonth]
        }
        rangeSeek.rangeSeekBarChangeListener = { minValue, maxValue ->
            Log.d("TAG", "min: $minValue, max: $maxValue")
        }
    }

    private val monthNames = arrayOf(
            "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"
    )
}