package com.rinat.aston_intensiv_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.annotation.IdRes

class MainActivity : AppCompatActivity() {

    private val buttonFirst by bind<Button>(R.id.button1)
    private val buttonSecond by bind<Button>(R.id.button2)

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