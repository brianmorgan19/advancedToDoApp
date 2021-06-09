package com.example.app2022

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class ToDoAdapter(
    val todos: MutableList<ToDo>
) : RecyclerView.Adapter<ToDoAdapter.ToDoViewHolder>(){

    class ToDoViewHolder(ItemView:View) : RecyclerView.ViewHolder(ItemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ToDoViewHolder {

    }

    override fun onBindViewHolder(holder: ToDoViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        
    }

}