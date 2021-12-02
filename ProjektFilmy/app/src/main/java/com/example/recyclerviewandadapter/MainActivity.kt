package com.example.recyclerviewandadapter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewandadapter.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding//to daje binding!!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)//to daje binding!!!
        setContentView(binding.root)//to daje binding!!!

        binding.recyclerView.layoutManager =//
            LinearLayoutManager(this)//ustawianie naszych widokow w formie listy,elementy są pod sobą
//        binding.recyclerView.layoutManager=GridLayoutManager(this,2)//z dwiema kolumnami(siatka zmiast listy)
        //adapter-połaczenie miedzy baza danych a naszym widokiem
        binding.recyclerView.adapter = MyAdapter()//wlaczenie adaptera//stworzenie obiektu z klasy MyAdapter
        //mozna dodac aktywnosc
//        fun cos(){
//            var nowaAktywnosc: Intent = Intent(applicationContext,MainActivity2::class.java)
//            startActivity(nowaAktywnosc)
//        }
//        cos()


    }
}