package com.example.macstudio.submissionappalison.ui

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.macstudio.submissionappalison.R

class PhotoListFragment: Fragment() {

    private lateinit var mRecyclerView: RecyclerView
    private val columnCount = 2;

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {

        val view = inflater.inflate(R.layout.photo_list_fragment, container, false)
        mRecyclerView = view.findViewById(R.id.photo_list)
        val gridLayoutManager = GridLayoutManager(activity, columnCount)
//        todo: replace dummy data with real data
        val dummyData = arrayOf("string1", "string2", "string3", "string4", "string5", "string6", "string7")
        mRecyclerView.adapter = MyListAdapter(dummyData)
        mRecyclerView.layoutManager = gridLayoutManager
        return view;
    }

}