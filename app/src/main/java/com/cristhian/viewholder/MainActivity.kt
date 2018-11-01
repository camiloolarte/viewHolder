package com.cristhian.viewholder

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerview:RecyclerView = findViewById(R.id.recyclerview)
        recyclerview.layoutManager = LinearLayoutManager(this,LinearLayout.VERTICAL,false)

        val publicaciones = ArrayList<Publicacion>()
        publicaciones.add(Publicacion(1,"cristhian camilo","@camiloolarte",12,"Es un hecho establecido hace mucho tiempo que un lector se distraerá con el contenido legible de una página al mirar su diseño. El punto de usar Lorem Ipsum es "))
        publicaciones.add(Publicacion(2,"alejando sanchez","@ale124",16,"Es un hecho establecido hace mucho tiempo que un lector se distraerá con el contenido legible de una página al mirar su diseño. El punto de usar Lorem Ipsum es "))
        publicaciones.add(Publicacion(3,"maria agudelo","@mari46",23,"Es un hecho establecido hace mucho tiempo que un lector se distraerá con el contenido legible de una página al mirar su diseño. El punto de usar Lorem Ipsum es "))
        publicaciones.add(Publicacion(4,"sandra liscano","@sandra233",9,"Es un hecho establecido hace mucho tiempo que un lector se distraerá con el contenido legible de una página al mirar su diseño. El punto de usar Lorem Ipsum es"))
        publicaciones.add(Publicacion(5,"juanito perez","@prez1267",6,"Es un hecho establecido hace mucho tiempo que un lector se distraerá con el contenido legible de una página al mirar su diseño. El punto de usar Lorem Ipsum es "))
        publicaciones.add(Publicacion(6,"cristhian solarte","@solarte85",13,"Es un hecho establecido hace mucho tiempo que un lector se distraerá con el contenido legible de una página al mirar su diseño. El punto de usar Lorem Ipsum es"))
        publicaciones.add(Publicacion(7,"jesica quintero","@jesica567",15,"Es un hecho establecido hace mucho tiempo que un lector se distraerá con el contenido legible de una página al mirar su diseño. El punto de usar Lorem Ipsum es"))
        publicaciones.add(Publicacion(8,"alverto carvajal","@alv4673",17,"Es un hecho establecido hace mucho tiempo que un lector se distraerá con el contenido legible de una página al mirar su diseño. El punto de usar Lorem Ipsum es "))
        publicaciones.add(Publicacion(9,"tiono asprilla","@tino6734",8,"Es un hecho establecido hace mucho tiempo que un lector se distraerá con el contenido legible de una página al mirar su diseño. El punto de usar Lorem Ipsum es "))
        publicaciones.add(Publicacion(10,"rene higuita","@rene305",6,"Es un hecho establecido hace mucho tiempo que un lector se distraerá con el contenido legible de una página al mirar su diseño. El punto de usar Lorem Ipsum es "))
        publicaciones.add(Publicacion(11,"camilo duarte","@duarte344",19,"Es un hecho establecido hace mucho tiempo que un lector se distraerá con el contenido legible de una página al mirar su diseño. El punto de usar Lorem Ipsum"))
        publicaciones.add(Publicacion(12,"alejandro salsedo","@salsedo235",22,"Es un hecho establecido hace mucho tiempo que un lector se distraerá con el contenido legible de una página al mirar su diseño. El punto de usar Lorem Ipsum"))
        publicaciones.add(Publicacion(13,"rubes bariquelo","@rubes234",20,"Es un hecho establecido hace mucho tiempo que un lector se distraerá con el contenido legible de una página al mirar su diseño. El punto de usar Lorem Ipsum es "))


        val adapter=MyAdapter(publicaciones)
        recyclerview.adapter = adapter
    }
}
