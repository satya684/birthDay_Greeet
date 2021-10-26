package com.example.birthday_greet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birth_day_gift.*
import java.lang.NullPointerException

class BirthDayGiftActivity : AppCompatActivity() {
    companion object{
        const val  NAME_EXTRA = "name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout. activity_birth_day_gift)

    val name = intent.getStringExtra(NAME_EXTRA)
        birthdayGreeting.text = "Happy BirthDay  $name"
//    birthdayGreeting.text = "Happy birthday $name"
    }
}