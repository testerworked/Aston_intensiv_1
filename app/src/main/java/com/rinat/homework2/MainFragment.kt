package com.rinat.homework2

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment


private const val FRAGMENT_TAG = "MAIN_FRAGMENT_KEY"
private var mulCount = 0



class MainFragment : Fragment(R.layout.fragment_main) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.codingChallenge1).setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, ChallengeFirst(), ChallengeFirst::class.getTag())
                .addToBackStack(MainFragment::class.getTag())
                .commit()
        }

        view.findViewById<Button>(R.id.buttonHW11).setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, HWFragmentOneOne(), HWFragmentOneOne::class.getTag())
                .addToBackStack(MainFragment::class.getTag())
                .commit()
        }

        view.findViewById<Button>(R.id.buttonHW12).setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, HWFragmentOneTwo(), HWFragmentOneTwo::class.getTag())
                .addToBackStack(MainFragment::class.getTag())
                .commit()
        }

        view.findViewById<Button>(R.id.buttonHW13).setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, HWFragmentOneThree(), HWFragmentOneThree::class.getTag())
                .addToBackStack(MainFragment::class.getTag())
                .commit()
        }

        view.findViewById<Button>(R.id.buttonCh21).setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, ChallengeTwoOne(), ChallengeTwoOne::class.getTag())
                .addToBackStack(MainFragment::class.getTag())
                .commit()
        }

        view.findViewById<Button>(R.id.buttonHW21).setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, HWFragmentTwoOne(), HWFragmentTwoOne::class.getTag())
                .addToBackStack(MainFragment::class.getTag())
                .commit()
        }

        view.findViewById<Button>(R.id.buttonCh22).setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, ChallengeTwoTwo(), ChallengeTwoTwo::class.getTag())
                .addToBackStack(MainFragment::class.getTag())
                .commit()
        }

        view.findViewById<Button>(R.id.buttonHW22).setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, HWFragmentTwoTwo(), HWFragmentTwoTwo::class.getTag())
                .addToBackStack(MainFragment::class.getTag())
                .commit()
        }

        view.findViewById<Button>(R.id.buttonCh23).setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, ChallengeTwoThree(), ChallengeTwoThree::class.getTag())
                .addToBackStack(MainFragment::class.getTag())
                .commit()
        }

        view.findViewById<Button>(R.id.buttonHW23).setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, HWFragmentTwoThree(), HWFragmentTwoThree::class.getTag())
                .addToBackStack(MainFragment::class.getTag())
                .commit()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(MyBuffer.COUNT.name, mulCount)
    }




    companion object {

        const val FRAGMENT_TAG = "MAIN_FRAGMENT_TAG"

        fun getInstance(): MainFragment {
            return MainFragment().apply {
                arguments = bundleOf(FRAGMENT_TAG to "value")
            }
        }
    }
}