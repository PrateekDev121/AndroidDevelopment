package com.test.androiddevelopment.frag

import android.R
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import androidx.fragment.app.ListFragment

class OtherFragment : ListFragment() {

    private val items = arrayOf("A","B","C","D","E")

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
      listAdapter = ArrayAdapter(requireContext(),R.layout.simple_list_item_1,items)
    }
}