package com.alex.primerproyecto

import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class PlcAdaptador (private val cards: List<card_class>) : RecyclerView.Adapter<PlcAdaptador.ClassHolder>() {
    class ClassHolder(private val view: View) : RecyclerView.ViewHolder(view){

        fun OnBind(card: card_class) {
            val image= view.findViewById<ImageView>(R.id.image)
            val name=view.findViewById<TextView>(R.id.nombre)

          image.setImageResource(card.image)
          name.text=card.nombre

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClassHolder {
        val layoutInflater= LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.card_movie, parent, false )
        return  ClassHolder(view)
    }

    override fun getItemCount(): Int {
        return cards.size
    }

    override fun onBindViewHolder(cardHolder: ClassHolder, position: Int) {
       val card = cards [position]
        cardHolder.OnBind(card)
    }

}