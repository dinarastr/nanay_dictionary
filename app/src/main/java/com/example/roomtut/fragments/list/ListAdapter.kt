package com.example.roomtut.fragments.list

import android.graphics.Color
import android.text.Spannable
import android.text.style.ForegroundColorSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.roomtut.R
import com.example.roomtut.model.RussianWord
import com.example.roomtut.model.Word
import kotlinx.android.synthetic.main.custom_row.view.*

class ListAdapter(
        private val onLastItemBound: (Int) -> Unit
): RecyclerView.Adapter<ListAdapter.MyViewHolder>(){

    private var wordList = emptyList<Word>()
    //private var russianwordlist = emptyList<RussianWord>()
    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.custom_row, parent, false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val customCurrentItem = wordList[position]
        holder.itemView.word.text = customCurrentItem.talysh
        if (customCurrentItem.russian.contains("ример")) {
            setColor(holder.itemView.translation, customCurrentItem.russian, "Пример", Color.BLUE)
        } else {
            holder.itemView.translation.text = customCurrentItem.russian
        }
        if (position == wordList.size-1) onLastItemBound(wordList.size)
    }

    fun setData(words: List<Word>){
        this.wordList = words
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return wordList.size
    }

    private fun setColor(view: TextView, fulltext: String, subtext: String, color: Int){
        view.setText(fulltext, TextView.BufferType.SPANNABLE)
        val str = view.text as Spannable
        val i = fulltext.indexOf(subtext)
        str.setSpan(ForegroundColorSpan(color), i, i + subtext.length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
    }


}