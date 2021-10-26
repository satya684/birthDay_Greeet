package com.example.birthday_greet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn.setOnClickListener(View.OnClickListener {

            val name = input.editableText.toString()

            Intent(this, BirthDayGiftActivity::class.java).also {
                it.putExtra(BirthDayGiftActivity.NAME_EXTRA, name)
                startActivity(it)
            }

           /* val  name = input.editableText.toString()*/
            Toast.makeText(this, "You are going! And you entered $name", Toast.LENGTH_SHORT).show()
        })

    }
}