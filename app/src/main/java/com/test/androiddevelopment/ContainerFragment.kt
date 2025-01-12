package com.test.androiddevelopment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class ContainerFragment : Fragment(), OnClickListener {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val result = inflater.inflate(R.layout.mainfrag, container, false)
        result.findViewById<Button>(R.id.showOther).setOnClickListener(this)

        return result
    }


    override fun onClick(p0: View?) {
       (activity as MainActivity).showOther()
    }
}