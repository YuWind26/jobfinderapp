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
        val horizontalAdapter = RecyclerViewHomeHorizontalAdapter(listOf("Teknik","Marketing","Teknologi","Farmasi","Mandarin","English"))
        horizontalAdapter.setOnItemClickListener(object : RecyclerViewHomeHorizontalAdapter.OnItemClickListener {
            override fun onItemClick(position: Int) {
            }
        })
        recyclerViewHorizontal.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        recyclerViewHorizontal.adapter = horizontalAdapter

        val recyclerViewVertical: RecyclerView = view.findViewById(R.id.recyclerViewVertical)
        val verticalAdapter = RecyclerViewHomeVertical(listOf("Teknik","Marketing","Teknologi","Farmasi","Mandarin","English"))
        recyclerViewVertical.layoutManager = LinearLayoutManager(context)
        recyclerViewVertical.adapter = verticalAdapter



        return view
    }
}