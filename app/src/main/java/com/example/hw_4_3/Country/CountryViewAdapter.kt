package com.example.hw_4_3.Country

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.hw_4_3.databinding.ItemCountryBinding

class CountryViewAdapter(var countryList: ArrayList<Country>):
    Adapter<CountryViewAdapter.CountryHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryHolder {
        return CountryHolder(ItemCountryBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: CountryHolder, position: Int) {
        holder.bind(countryList[position])
    }

    override fun getItemCount() = countryList.size


    inner class CountryHolder(private val binding:ItemCountryBinding) : RecyclerView.ViewHolder(binding.root) {
fun bind(country: Country){
    binding.apply {
        tvCountry.text=country.name
        Glide.with(imgCountry).load(country.image).into(imgCountry)

    }
}
    }
}