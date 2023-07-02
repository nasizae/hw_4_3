package com.example.hw_4_3.Continent

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.*
import com.bumptech.glide.Glide
import com.example.hw_4_3.Country.onItemClick
import com.example.hw_4_3.databinding.ItemContinentBinding
import kotlin.reflect.KFunction1

class ContinentViewAdapter(var continents: ArrayList<Continent>, var onItemClick: onItemClick) :
    Adapter<ContinentViewAdapter.ContinentHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContinentHolder {
        return ContinentHolder(ItemContinentBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }
    override fun onBindViewHolder(holder: ContinentHolder, position: Int) {
        holder.bind(continents[position])
        holder.itemView.setOnClickListener {
               onItemClick.onClickItem(position)
        }
    }

    override fun getItemCount(): Int {
        return continents.size
    }

   inner class ContinentHolder(val binding: ItemContinentBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(continent: Continent) {
            binding.apply {
                tvContinent.text = continent.name
                Glide.with(imageContinent).load(continent.photo).into(imageContinent)
            }
        }
   }

}
