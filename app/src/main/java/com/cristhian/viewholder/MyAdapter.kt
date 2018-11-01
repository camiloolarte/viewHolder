package com.cristhian.viewholder

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class MyAdapter (val publicacionList:ArrayList<Publicacion>) : RecyclerView.Adapter<MyAdapter.ViewHolder>(){


    override fun onCreateViewHolder(parent:ViewGroup, ViewType:Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.items,parent,false)
        return  ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(publicacionList[position])
    }

    override fun getItemCount(): Int {
        return publicacionList.size
    }

    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {

        fun bindItems(publicacion:Publicacion){
            val id = itemView.findViewById<TextView>(R.id.id)
            val nombre = itemView.findViewById<TextView>(R.id.nombre)
            val usuario = itemView.findViewById<TextView>(R.id.usuario)
            val hora = itemView.findViewById<TextView>(R.id.hora)
            val texto = itemView.findViewById<TextView>(R.id.texto)

            id.text=publicacion.id.toString()
            nombre.text=publicacion.nombre.toString()
            usuario.text=publicacion.usuario.toString()
            hora.text=publicacion.hora.toString()+"hrs"
            texto.text=publicacion.texto.toString()

        }

    }
}