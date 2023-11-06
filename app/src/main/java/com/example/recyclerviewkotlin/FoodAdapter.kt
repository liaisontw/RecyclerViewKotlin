package com.example.recyclerviewkotlin

import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class FoodAdapter(private val foodList: ArrayList<Food>)
    : RecyclerView.Adapter<FoodAdapter.FoodViewHolder>(){

    var onItemClick : ((Food) -> Unit)? = null
    class FoodViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView : ImageView = itemView.findViewById(R.id.imageView)
        val textView : TextView = itemView.findViewById(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.each_item, parent, false)
        return FoodViewHolder(view)
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        val food = foodList[position]
        holder.imageView.setImageResource(food.image)
        holder.textView.text = food.name

        holder.itemView.setOnClickListener {
            onItemClick?.invoke(food)
        }
    }

    override fun getItemCount(): Int {
        return foodList.size
    }
}