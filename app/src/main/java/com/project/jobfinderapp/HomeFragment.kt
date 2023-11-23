package com.project.jobfinderapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        // RecyclerView untuk list horizontal
        val recyclerViewHorizontal: RecyclerView = view.findViewById(R.id.recyclerViewHorizontal)
        val horizontalAdapter = RecyclerViewHomeHorizontalAdapter(listOf(R.drawable.ic_home,R.drawable.edit_txt_bg))  // Ganti dengan adapter yang sesuai
        recyclerViewHorizontal.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        recyclerViewHorizontal.adapter = horizontalAdapter

        // RecyclerView untuk list vertical
//        val recyclerViewVertical: RecyclerView = view.findViewById(R.id.recyclerViewVertical)
//        val verticalAdapter = VerticalAdapter()  // Ganti dengan adapter yang sesuai
//        recyclerViewVertical.layoutManager = LinearLayoutManager(context)
//        recyclerViewVertical.adapter = verticalAdapter

        return view
    }
}