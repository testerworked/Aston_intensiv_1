package com.rinat.homework2

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.rinat.homework2.BlankFragment.Companion.MAIN_FRAGMENT_TAG



class MainActivity : AppCompatActivity() {


    private val TAG_HW2 = "MainActivity"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment = supportFragmentManager.findFragmentByTag(MAIN_FRAGMENT_TAG)

        if (fragment == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, BlankFragment.getInstance(), MAIN_FRAGMENT_TAG)
                .commit()
        }

        Log.d(TAG_HW2, "onCreate")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG_HW2, "onDestroy")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG_HW2, "onStop")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG_HW2, "onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG_HW2, "onPause")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG_HW2, "onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG_HW2, "onRestart")
    }


}