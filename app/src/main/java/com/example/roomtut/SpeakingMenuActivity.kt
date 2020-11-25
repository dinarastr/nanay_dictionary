package com.example.roomtut

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.roomtut.SpeakingActivity.Companion.POSITION
import kotlinx.android.synthetic.main.activity_speaking_menu.*

class SpeakingMenuActivity : AppCompatActivity(), SpeakingMenuAdapter.OnItemClickListener {
    private lateinit var menuAdapter: SpeakingMenuAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_speaking_menu)
        initRecyclerView()
        addDataSet()
    }

    private fun addDataSet(){
        val data = SpeakingMenuSource.createDataSet()
        menuAdapter.submitList(data)
    }


    private fun initRecyclerView(){
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.apply {
            val topSpacing  = TopSpacingItemClass(50)
            addItemDecoration(topSpacing)
        }
        menuAdapter = SpeakingMenuAdapter(this)
        recycler.adapter = menuAdapter
    }

    override fun onItemClick(position: Int) {
        val intent = Intent(this, SpeakingActivity::class.java)
        intent.putExtra(POSITION, position.toString())
        startActivity(intent)
    }
}