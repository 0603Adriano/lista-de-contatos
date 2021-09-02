package com.adrianomartins.listadecontatos

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter : RecyclerView.Adapter<ContactAdapter.ContactAdapaterViewHolder>() {

    private val list: MutableList<Contact> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactAdapaterViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ContactAdapaterViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    class ContactAdapaterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

}