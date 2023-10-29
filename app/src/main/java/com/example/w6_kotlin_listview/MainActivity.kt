package com.example.w6_kotlin_listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var customAdapter: CustomAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val inbox = findViewById<TextView>(R.id.inbox)
        inbox.text = "Inbox"
        //Khai bao danh sach item list
        var list = mutableListOf<ItemData>()
        list.add(ItemData("B","Boss.com","Are you free tonight?","10:00 PM"))
        list.add(ItemData("H","Udemy","Looking for some good course?","12:30 PM"))
        list.add(ItemData("U","Graph.com","Finding for good taxi?","11:99 PM"))
        list.add(ItemData("H","Hola Base","click to the link below to see all advantages of our service","12:34 PM"))
        list.add(ItemData("Y","Ylahi","$19 Only. You can check","1:90 PM"))

        customAdapter = CustomAdapter(this,list)

        //khai bao bien den listEmail
        val listEmail = findViewById<ListView>(R.id.listEmail)
        listEmail.adapter = customAdapter
    }
}