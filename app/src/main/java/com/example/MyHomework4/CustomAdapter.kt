package com.example.MyHomework4

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.model.ItemsForRecycler

class CustomAdapder(val listOfItem:List<ItemsForRecycler>): RecyclerView.Adapter<CustomAdapder.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_view, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val someDataToViewHolder = listOfItem[position]
        holder.imageView.setImageResource(someDataToViewHolder.image)
        holder.textView.text = someDataToViewHolder.text
    }

    override fun getItemCount(): Int {
        return listOfItem.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val textView: TextView = itemView.findViewById(R.id.textView)
    }

}