package com.example.roomtut.fragments.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.roomtut.R
import com.example.roomtut.model.Word
import kotlinx.android.synthetic.main.custom_row.view.*

class ListAdapter(
        private val onLastItemBound: (Int) -> Unit
): RecyclerView.Adapter<ListAdapter.MyViewHolder>(){

    private var wordList = emptyList<Word>()
    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.custom_row, parent, false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val customCurrentItem = wordList[position]
        holder.itemView.word.text = customCurrentItem.talysh
        holder.itemView.translation.text = customCurrentItem.russian
        if (position == wordList.size-1) onLastItemBound(wordList.size)
    }

    fun setData(words: List<Word>){
        this.wordList = words
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return wordList.size
    }


}