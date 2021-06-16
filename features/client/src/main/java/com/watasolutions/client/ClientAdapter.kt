package com.watasolutions.client

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ClientAdapter(
    val context: Context,
    var list: List<Client>,
    val clientAdapterListener: ClientAdapterListener?
) : RecyclerView.Adapter<ClientAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_client, parent, false)
        return ViewHolder(view).apply {
            if (itemCount == 0) return@apply

            name.setOnClickListener {
                val client = list[adapterPosition]
                clientAdapterListener?.onClientItemClicked(client)
            }
        }
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val client = list[position]
        holder.name.text = "Client name: ${client.name}"
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val name: TextView = view.findViewById(R.id.tvClientName)
    }

    fun updateDate(items: List<Client>) {
        list = items
        notifyDataSetChanged()
    }

    interface ClientAdapterListener {
        fun onClientItemClicked(client: Client)
    }
}