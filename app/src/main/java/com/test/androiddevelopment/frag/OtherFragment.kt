package com.test.androiddevelopment.frag

import android.R
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.ArrayAdapter
import androidx.core.view.MenuHost
import androidx.core.view.MenuProvider
import androidx.fragment.app.ListFragment

class OtherFragment : ListFragment() {

    private val items = arrayOf("A", "B", "C", "D", "E")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val menuHost: MenuHost = requireActivity()
        menuHost.addMenuProvider(object : MenuProvider {
            override fun onCreateMenu(menu: Menu, menuInflater: MenuInflater) {
                menuInflater.inflate(com.test.androiddevelopment.R.menu.options, menu)
            }

            override fun onMenuItemSelected(menuItem: MenuItem): Boolean {
                return when (menuItem.itemId) {

                    com.test.androiddevelopment.R.id.help -> {
                        true
                    }

                    com.test.androiddevelopment.R.id.about -> {
                        true
                    }

                    else -> {
                        false
                    }

                }
            }
        })

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        listAdapter = ArrayAdapter(requireContext(), R.layout.simple_list_item_1, items)
    }


}