package com.example.colegioscreser

import android.app.Activity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.view.View.OnTouchListener
import android.widget.TextView
import com.example.colegioscreser.databinding.ActivityFullscreenBinding

class MainActivity: AppCompatActivity (){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        private val int tareas = ArrayList <Tareas> ()
        tareas.add(Tarea(nombre: "ACTIVIDADES DE CLASE", terminada true))
        tareas.add(Tarea(nombre: "Recursos de aprendizaje", terminada false))

        recycler_view.adapter = TareaAdapter(tareas)
        recycler_view.layoutManager = LinearLayoutManager(context: this)
        recycler_view.addItemDecoration(DividerItemDecoration (context: this, LinearLayoutManager.VERTICAL)
    }



