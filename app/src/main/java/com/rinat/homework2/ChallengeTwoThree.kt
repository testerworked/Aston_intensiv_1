package com.rinat.homework2

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class ChallengeTwoThree : Fragment(R.layout.fragment_challenge_two_three) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        try {
            throw java.lang.IllegalArgumentException()
        }
        catch (exceptionAbout : IllegalArgumentException){
            Log.e("Challenge 2.3", "Exception")
        }

        view.findViewById<Button>(R.id.buttonCh23Back).setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, MainFragment(), MainFragment::class.getTag())
                .addToBackStack(MainFragment::class.getTag())
                .commit()
        }

    }
}