package com.rinat.homework2

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationCompat.getColor
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import com.rinat.homework2.databinding.FragmentMainBinding


private const val FRAGMENT_TAG = "MAIN_FRAGMENT_KEY"
private var mulCount = 0
enum class Constants {
    TEXT,
    COUNT,
    SHOPPING_CONSTANTS,
    SHOPPING_ITEMS,

}


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

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(Constants.COUNT.name, mulCount)
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