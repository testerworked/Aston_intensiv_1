package com.rinat.homework2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

import com.rinat.homework2.R
import com.rinat.homework2.getTag

class HWFragmentOneOne : Fragment(R.layout.fragment_h_w_one_one) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.buttonHW11back).setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, MainFragment(), MainFragment::class.getTag())
                .addToBackStack(MainFragment::class.getTag())
                .commit()
        }
    }
}