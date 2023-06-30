package com.rinat.homework2

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import androidx.annotation.IdRes

class
ChallengeTwoOne : Fragment(R.layout.fragment_challenge_two_one) {



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        try {
            throw java.lang.IllegalArgumentException()
        }
        catch (exceptionAbout : IllegalArgumentException){
            Log.e("Challenge 2.1", "Exception")
        }
        val checkIntent_21 = Intent(view.context, ChallengeTwoOneActivity::class.java)

        view.findViewById<Button>(R.id.buttonTextOne).setOnClickListener {
            checkIntent_21.putExtra("text_two_one", R.string.article_text)
            startActivity(checkIntent_21)
        }

        view.findViewById<Button>(R.id.buttonTextTwo).setOnClickListener {
            checkIntent_21.putExtra("text_two_one", R.string.article_subtitle)
            startActivity(checkIntent_21)
        }

        view.findViewById<Button>(R.id.buttonTextThree).setOnClickListener {
            checkIntent_21.putExtra("text_two_one", R.string.hello_blank_fragment)
            startActivity(checkIntent_21)
        }

        view.findViewById<Button>(R.id.buttonCh21Back).setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, MainFragment(), MainFragment::class.getTag())
                .addToBackStack(MainFragment::class.getTag())
                .commit()
        }

    }



}