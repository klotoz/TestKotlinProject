package com.example.testkotlinproject

import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.google.android.material.textview.MaterialTextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val note1 = Note("Тест", "Все очень непонятно пока")
        val anyText = findViewById<EditText>(R.id.et_anything)
        val repeatText = findViewById<MaterialTextView>(R.id.tv_repeat_anything)
        val tvNote = findViewById<MaterialTextView>(R.id.tv_note)
        val button = findViewById<MaterialButton>(R.id.btn_repeat)


        val list = ArrayList<String>()
        for (i in 1..10) {
            list.add("Hello Kotlin!$i")


            button.setOnClickListener {
                repeatText.text = anyText.text
            }
            val buttonNote = findViewById<MaterialButton>(R.id.btn_note)
            buttonNote.setOnClickListener {
                tvNote.text = note1.title + "\n" + note1.note
            }
            buttonNote.setOnLongClickListener(View.OnLongClickListener {
                tvNote.text = list.toString()
                true
            }


            )


        }
    }


}