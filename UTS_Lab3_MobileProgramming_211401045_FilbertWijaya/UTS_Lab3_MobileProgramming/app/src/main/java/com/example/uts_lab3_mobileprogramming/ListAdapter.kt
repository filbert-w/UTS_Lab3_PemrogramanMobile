package com.example.uts_lab3_mobileprogramming

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListAdapter(private val contentList:ArrayList<String>):RecyclerView.Adapter<ListAdapter.ViewHolder>() {

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val itemTitle:TextView = itemView.findViewById(R.id.item_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder{
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int{
        return contentList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int){
        val position = holder.position
        val data = contentList[position]
        holder.itemTitle.text = data
    }

}