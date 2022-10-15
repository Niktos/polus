package com.example.hahaton

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_adapter.view.*

class ViewHolder(val v: View) : RecyclerView.ViewHolder(v) {
    val folder = v.folder
    val vehicleType = v.vehicleType
    val kindofWork = v.kindofwork
    val justOneButton = v.justOneButton

}