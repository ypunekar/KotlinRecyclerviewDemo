package com.example.mydemo1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.mydemo1.R
import kotlinx.android.synthetic.main.animal_list_item.view.*

class AnimalAdapter(val items : ArrayList<String>, val context: Context) : RecyclerView.Adapter<ViewHolder>() {

    // Gets the number of animals in the list
    override fun getItemCount(): Int {
        return items.size
    }

   /* override fun onCellClickListener() {
        TODO("Not yet implemented")
        Toast.makeText(context,"hello",Toast.LENGTH_SHORT).show();
    }*/

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.animal_list_item, parent, false))

    }
    // Binds each animal in the ArrayList to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder?.tvAnimalType?.text = items.get(position)
        holder?.itemView?.setOnClickListener{
            Toast.makeText(context,"Item Clicked",Toast.LENGTH_SHORT).show();

        }
    }
}

class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
        // Holds the TextView that will add each animal to
        val tvAnimalType = view.tv_animal_type
}
/*

interface CellClickListener {
    fun onCellClickListener()
}*/
