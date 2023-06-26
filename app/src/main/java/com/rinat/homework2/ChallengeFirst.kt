package com.rinat.homework2

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.rinat.homework2.R
import com.rinat.homework2.getTag

class ChallengeFirst : Fragment(R.layout.fragment_challenge_first) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        try {
            throw java.lang.IllegalArgumentException()
        }
        catch (exceptionAbout : IllegalArgumentException){
            Log.e("Challenge 1", "Exception")
        }

        view.findViewById<Button>(R.id.buttonCh1Back).setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, MainFragment(), MainFragment::class.getTag())
                .addToBackStack(MainFragment::class.getTag())
                .commit()
        }

    }
}