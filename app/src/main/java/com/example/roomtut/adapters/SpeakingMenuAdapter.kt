package com.example.roomtut.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.roomtut.R
import com.example.roomtut.model.SpeakingMenu
import kotlinx.android.synthetic.main.menu_speaking.view.*

class SpeakingMenuAdapter(private val listener: OnItemClickListener):
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var items: List<SpeakingMenu> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return SpeakingMenuViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.menu_speaking, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        when(holder){
            is SpeakingMenuViewHolder -> {
                holder.bind(items[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun submitList(menuList: List<SpeakingMenu>){
        items = menuList
    }

    inner class SpeakingMenuViewHolder constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView), View.OnClickListener {

        val image: ImageView = itemView.image
        val nanay_menu: TextView = itemView.nanay_menu
        val russian_menu: TextView = itemView.russian_menu

        init {
            itemView.setOnClickListener(this)
        }



        fun bind(speakingMenu: SpeakingMenu){
            image.setImageResource(speakingMenu.image)
            nanay_menu.text = speakingMenu.nanay
            russian_menu.text = speakingMenu.russian


        }

        override fun onClick(p0: View?) {
            val position= adapterPosition
            if (position != RecyclerView.NO_POSITION) {
                listener.onItemClick(position)
            }
        }
    }

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }
}