package com.example.hahaton

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.hahaton.model.TicketType
import kotlinx.android.synthetic.main.item_adapter.view.*

class Adapter(var ticketTypes: List<TicketType>) : RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_adapter, parent, false)
        return com.example.hahaton.ViewHolder(v)
    }


    fun setData(data: List<TicketType>) {
        ticketTypes = data
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val ticketType = ticketTypes[position]
        holder.itemView.vehicleType.text = ticketType.type
        holder.itemView.kindofwork.text = ticketType.title
        holder.itemView.numberid.text = ticketType.id.toString()

    }

    override fun getItemCount(): Int = ticketTypes.size
}