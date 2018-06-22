package com.example.macstudio.submissionappalison.ui

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.macstudio.submissionappalison.R
import kotlinx.android.synthetic.main.photo_list_item.view.*

//todo: can be replaced with: import android.support.v7.recyclerview.extensions.ListAdapter
class MyListAdapter(val dataArray: Array<String>): RecyclerView.Adapter<MyListAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyListAdapter.MyViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.photo_list_item, parent, false)
        val photoItemViewHolder = MyViewHolder(view)
        return photoItemViewHolder
    }

    override fun getItemCount(): Int {
        return dataArray.size
    }

    override fun onBindViewHolder(holder: MyListAdapter.MyViewHolder, position: Int) {
        holder.textItem.text = dataArray.get(position)
    }

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val textItem: TextView = itemView.photo_likes
    }
}