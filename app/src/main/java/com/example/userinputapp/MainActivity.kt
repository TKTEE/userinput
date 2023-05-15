package com.example.userinputapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var display_text:TextView
    lateinit var userinput_edt:EditText
    lateinit var submitdata:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        display_text = findViewById(R.id.txtdisplay)
        userinput_edt = findViewById(R.id.edtuserinput)
        submitdata = findViewById(R.id.btnsubmit)

        submitdata.setOnClickListener {
            //grab user input
            var userdata = userinput_edt.text.toString().trim()
            display_text.setText(userdata)
        }

    }
}