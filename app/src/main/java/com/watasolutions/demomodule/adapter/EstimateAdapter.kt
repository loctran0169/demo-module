package com.watasolutions.demomodule.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.watasolutions.demomodule.R
import com.watasolutions.demomodule.model.Estimate

class EstimateAdapter(val context: Context, var list: List<Estimate>) :
    RecyclerView.Adapter<EstimateAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.item_estimate, parent, false)
        return ViewHolder(view)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val estimate = list[position]
//        println("### bind position: $position")
        holder.run {
            id.text = "#${estimate.id}"
            name.text = "#${estimate.name}"
            vehicle.text = "#${estimate.vehicle}"
            date.text = "#${estimate.date}"
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun updateData(items: List<Estimate>) {
        list = items
        notifyDataSetChanged()
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val name: TextView = view.findViewById(R.id.tvName)
        val vehicle: TextView = view.findViewById(R.id.tvVehicle)
        val date: TextView = view.findViewById(R.id.tvDate)
        val id: TextView = view.findViewById(R.id.tvID)
    }
}