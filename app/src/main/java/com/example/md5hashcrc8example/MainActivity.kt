package com.example.md5hashcrc8example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.md5hash_crc8.Md5HashCRC8

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val uniqueId = Md5HashCRC8()

        val editText: EditText = findViewById(R.id.edit_text)
        val textView: TextView = findViewById(R.id.text)
        val btn: Button = findViewById(R.id.btn)

        btn.setOnClickListener {
            if(editText.text.toString() != ""){
                textView.text = uniqueId.getUniqueId(editText.text.toString())
            }
        }
    }
}