package com.rezoo.recyclerviewtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var rvtodo:RecyclerView=findViewById(R.id.rvtodo)
        var btnAddTodo:Button=findViewById(R.id.button2)
        var etTodo:EditText=findViewById(R.id.edtodo)
        var todoList= mutableListOf(
            Todo("meet rezasalehi",false),
            Todo("read book",false),
            Todo("go out",false),
            Todo("do the dishes",false),
            Todo("make a dinner",false),
        )
        val adapter=TodoAdapter(todoList)
        rvtodo.adapter=adapter
        rvtodo.layoutManager=LinearLayoutManager(this)
        btnAddTodo.setOnClickListener {
            val title=etTodo.text.toString()
            val todo=Todo(title,false)
            todoList.add(todo)
            adapter.notifyItemInserted(todoList.size-1)
        }
        Toast.makeText(this,"hiii",Toast.LENGTH_LONG).show()


    }
}