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
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import com.rinat.homework2.databinding.FragmentMainBinding


private const val MAIN_FRAGMENT_KEY = "MAIN_FRAGMENT_KEY"
private var mulCount = 0



class MainFragment : Fragment(R.layout.fragment_main) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button_toast).setOnClickListener {
            Toast.makeText(
                this.context, R.string.toast_message,
                Toast.LENGTH_SHORT
            ).show()
        }

        view.findViewById<Button>(R.id.button_count).setOnClickListener {
            mulCount++
            view.findViewById<TextView>(R.id.show_count).text = Integer.toString(mulCount)
        }

    }






    companion object {

        const val MAIN_FRAGMENT_TAG = "MAIN_FRAGMENT_TAG"

        fun getInstance(): MainFragment {
            return MainFragment().apply {
                arguments = bundleOf(MAIN_FRAGMENT_KEY to "value")
            }
        }
    }
}