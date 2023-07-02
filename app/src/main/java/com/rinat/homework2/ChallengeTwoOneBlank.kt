package com.rinat.homework2

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.setFragmentResultListener
import com.rinat.homework2.ChallengeTwoOne.Companion.SEND_MESSAGE_TO_BLANK


class ChallengeTwoOneBlank : Fragment(R.layout.fragment_challenge_two_one_blank) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        try {
            throw java.lang.IllegalArgumentException()
        }
        catch (exceptionAbout : IllegalArgumentException){
            Log.e("Challenge 2.1 Blank", "Exception")
        }

        setFragmentResultListener(SEND_MESSAGE_TO_BLANK){
            requestKey, bundle ->
            val valueMessage = bundle.getString(SEND_MESSAGE_TO_BLANK).orEmpty()
            view.findViewById<TextView>(R.id.textViewMessageFrom).text = valueMessage
        }


        view.findViewById<Button>(R.id.buttonCh21BlankBack).setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, ChallengeTwoOne(), ChallengeTwoOne::class.getTag())
                .addToBackStack(MainFragment::class.getTag())
                .commit()
        }

    }

    companion object {

    }
}