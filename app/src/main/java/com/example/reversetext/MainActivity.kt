package com.example.reversetext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ссылки на элементы интерфейса
        val inputText: EditText = findViewById(R.id.inputText)
        val convertButton: Button = findViewById(R.id.convertButton)
        val resultText: TextView = findViewById(R.id.resultText)
        val charCountText: TextView = findViewById(R.id.charCountText)

        // посчитать символы, перевернуть текст
        convertButton.setOnClickListener {
            val input = inputText.text.toString()
            val reversedText = input.reversed() //
            val charCount = input.replace(" ", "").length // пробелы удалить

            // Вывод
            resultText.text = "Результат: $reversedText"
            charCountText.text = "Количество символов: $charCount"
        }
    }
}
