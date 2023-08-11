package com.example.colourchanger
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var clrchngrbtn:Button

    private lateinit var colorView: View
    private val colors = listOf(

       // Color.GREEN,
        //Color.BLUE,
       // Color.MAGENTA,
        //Color.GRAY,
       // Color.DKGRAY,
        Color.parseColor("#FFEA80FC"),
        Color.parseColor("#FF012514"),
        Color.parseColor("#07166D"),
        Color.parseColor("#FFFF8F00"),
        Color.parseColor("#FFAFB42B"),
        Color.parseColor("#FF02172E"),
        Color.parseColor("#FF705E87"),
        Color.parseColor("#F1B784"),
        Color.parseColor("#FFEA80FC"),
        Color.parseColor("#FF03DAC5") ,
        Color.parseColor("#E91E63"),
        Color.parseColor("#136417"),
        Color.parseColor("#FC0E4758"),
        Color.parseColor("#FFC36B75"),
        Color.parseColor("#FF3B0E43"),
        Color.parseColor("#FF5A011F"),
        Color.parseColor("#07166D")






    )
    private var currentColorIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        clrchngrbtn = findViewById<Button>(R.id.colorchangerbtn)

        colorView = findViewById(R.id.colorView)
        colorView.setBackgroundColor(colors[currentColorIndex])

        clrchngrbtn.setOnClickListener {
            currentColorIndex = (currentColorIndex + 1) % colors.size
            colorView.setBackgroundColor(colors[currentColorIndex])
        }
    }
}
