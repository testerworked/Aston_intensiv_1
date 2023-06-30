package com.rinat.homework2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.annotation.IdRes

class ChallengeTwoOneActivity : AppCompatActivity() {

    private val buttonFirstTask by bind<TextView>(R.id.m_ac_two_one)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_challenge_two_one)

        val message = intent.getStringExtra("text_two_one")
        buttonFirstTask.text = message
    }

    fun <T: Any?> bind(@IdRes idRes: Int): Lazy<T>{
        return  lazy(LazyThreadSafetyMode.NONE) { findViewById<View>(idRes) as T }
    }

}