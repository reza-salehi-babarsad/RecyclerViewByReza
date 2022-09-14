package com.rezoo.recyclerviewtest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TodoAdapter (var todos:List<Todo>):RecyclerView.Adapter<TodoAdapter.TodoViewHolder>(){
    inner class TodoViewHolder (itemview: View): RecyclerView.ViewHolder(itemview){
        var textViewTitle = itemView.findViewById<TextView>(R.id.tvtitle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        val view= LayoutInflater.from(parent.context
        ).inflate(R.layout.item_todo,parent,false)
        return TodoViewHolder(view)
    }

    override fun getItemCount(): Int {
        return todos.size
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        holder.itemView.apply {
            findViewById<TextView>(R.id.tvtitle).text = todos[position].title
            findViewById<CheckBox>(R.id.chdone).text= todos[position].ischecked.toString()

        }


    }



    }

