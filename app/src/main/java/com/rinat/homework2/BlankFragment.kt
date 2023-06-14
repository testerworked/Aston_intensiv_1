package com.rinat.homework2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.os.bundleOf

private const val MAIN_FRAGMENT_KEY = "MAIN_FRAGMENT_KEY"
private var mulCount = 0
class BlankFragment : Fragment(R.layout.fragment_blank) {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.button_toast).setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, BlankFragment(), BlankFragment::class.getTag())
                .addToBackStack(BlankFragment::class.getTag())
                .commit()

            Toast.makeText(
                this.context, R.string.toast_message,
                Toast.LENGTH_SHORT
            ).show()
        }

        if(savedInstanceState != null){
            mulCount = savedInstanceState.getInt(Constants.COUNT.name)
            view.findViewById<TextView>(R.id.show_count).text = mulCount.toString()
            if(mulCount != 0){

            }
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