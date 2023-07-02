package com.rinat.homework2

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import androidx.annotation.IdRes
import androidx.core.os.bundleOf
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.setFragmentResult

class
ChallengeTwoOne : Fragment(R.layout.fragment_challenge_two_one) {

    companion object {
        const val SEND_MESSAGE_TO_BLANK = "OUR_MAJOR_MESSAGE"
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        try {
            throw java.lang.IllegalArgumentException()
        }
        catch (exceptionAbout : IllegalArgumentException){
            Log.e("Challenge 2.1", "Exception")
        }


        view.findViewById<Button>(R.id.buttonTextOne).setOnClickListener {
            //"text_two_one", R.string.article_text
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, ChallengeTwoOneBlank(), ChallengeTwoOneBlank::class.getTag())
                .addToBackStack(ChallengeTwoOne::class.getTag())
                .commit()

            setFragmentResult(SEND_MESSAGE_TO_BLANK, bundleOf(SEND_MESSAGE_TO_BLANK to "new message text one"))
        }

        view.findViewById<Button>(R.id.buttonTextTwo).setOnClickListener {
            //("text_two_one", R.string.article_subtitle)
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, ChallengeTwoOneBlank(), ChallengeTwoOneBlank::class.getTag())
                .addToBackStack(ChallengeTwoOne::class.getTag())
                .commit()

            setFragmentResult(SEND_MESSAGE_TO_BLANK, bundleOf(SEND_MESSAGE_TO_BLANK to "new message text two"))
        }

        view.findViewById<Button>(R.id.buttonTextThree).setOnClickListener {
            //("text_two_one", R.string.hello_blank_fragment)

            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, ChallengeTwoOneBlank(), ChallengeTwoOneBlank::class.getTag())
                .addToBackStack(ChallengeTwoOne::class.getTag())
                .commit()

            setFragmentResult(SEND_MESSAGE_TO_BLANK, bundleOf(SEND_MESSAGE_TO_BLANK to "new message text three"))
        }

        view.findViewById<Button>(R.id.buttonCh21Back).setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, MainFragment(), MainFragment::class.getTag())
                .addToBackStack(MainFragment::class.getTag())
                .commit()
        }

    }



}