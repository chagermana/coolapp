package com.example.simplecustom_manvin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listView=findViewById<ListView>(R.id.listview)
        var list= mutableListOf<Models>()

        list.add(Models("Penguins", description = "This is a penguin car",R.drawable.penguins))
        list.add(Models("Alvin",description="This is Alvin",R.drawable.alvin))
        list.add(Models("Ben10", description = "This is Ben10",R.drawable.ben10))
        list.add(Models("Madagascar", description = "This is Madagascar",R.drawable.madagascar))
        list.add(Models("Mobile", description = "This is a mobile icon",R.drawable.mobile))
        list.add(Models("Toystory", description = "This is toystory",R.drawable.toystory))


        listView.adapter=MyAdapter(this,R.layout.row,list)
    }
}