package com.example.roomtut

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.roomtut.model.Phrase
import kotlinx.android.synthetic.main.rv_element.view.*

class SpeakingRVAdapter (private val listener: OnItemClickListener, ) : RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    private var items: List<Phrase> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return PhraseViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.rv_element, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is PhraseViewHolder -> {
                holder.bind(items[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun submitList(phraseList: List<Phrase>){
        items = phraseList
    }

    inner class PhraseViewHolder constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView), View.OnClickListener{

        val soundImage: ImageView = itemView.sound_image
        val nanayText: TextView = itemView.nanay_text
        val russianText: TextView = itemView.russian_text

        init {
            itemView.setOnClickListener(this)
        }

        fun bind(phrase: Phrase){
            soundImage.setImageResource(phrase.soundImage)
            nanayText.text = phrase.nanay
            russianText.text = phrase.russian
        }

        override fun onClick(p0: View?) {
            val position = adapterPosition
            if (position != RecyclerView.NO_POSITION) {
                listener.onItemClick(position)
            }
        }
    }

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }
}