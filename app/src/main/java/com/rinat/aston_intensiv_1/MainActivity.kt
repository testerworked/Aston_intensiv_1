package com.rinat.aston_intensiv_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.annotation.IdRes

class MainActivity : AppCompatActivity() {

    private val buttonFirst_1_1 by bind<Button>(R.id.button1)
    private val buttonFirst_1_2A by bind<Button>(R.id.button2)
    private val buttonFirst_1_2B by bind<Button>(R.id.button3)
    private val buttonFirst_1_3 by bind<Button>(R.id.button4)
    private val buttonFirst_1_4 by bind<Button>(R.id.button5)
    private val buttonSecond_2_1 by bind<Button>(R.id.button6)
    private val buttonSecond_2_2 by bind<Button>(R.id.button7)
    private val buttonSecond_2_3 by bind<Button>(R.id.button8)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.v("MainActivity", "Hello World");
        Log.d("MainActivity", "Hello World");
        Log.i("MainActivity", "Hello World");
        Log.w("MainActivity", "Hello World");
        Log.e("MainActivity", "Hello World");


    }

    fun <T: Any?> bind(@IdRes idRes: Int): Lazy<T>{
        return  lazy(LazyThreadSafetyMode.NONE) { findViewById<View>(idRes) as T }
    }

}