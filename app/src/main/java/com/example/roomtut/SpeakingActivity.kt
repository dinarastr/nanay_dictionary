package com.example.roomtut

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.roomtut.sourcefactory.SpeakingFactory
import kotlinx.android.synthetic.main.activity_speaking.*
import java.lang.IllegalArgumentException

class SpeakingActivity : AppCompatActivity(), SpeakingRVAdapter.OnItemClickListener {

    private lateinit var phraseAdapter: SpeakingRVAdapter
    private var mMediaPlayer: MediaPlayer? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_speaking_menu)
        initRecyclerView()
        addDataSet()
    }

    private fun addDataSet(){
        val category = intent.getStringExtra(POSITION) ?: throw IllegalArgumentException()
        var vmFactory = SpeakingFactory.getWordsVmFactory(category)
        val data = vmFactory.createDataSet()
        phraseAdapter.submitList(data)
    }


    private fun initRecyclerView(){
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.apply {
            val topSpacing  = TopSpacingItemClass(50)
            addItemDecoration(topSpacing)
        }
        phraseAdapter = SpeakingRVAdapter(this)
        recycler.adapter = phraseAdapter
    }

    companion object{
        const val POSITION = "number"
    }

    override fun onItemClick(position: Int) {
        val category = intent.getStringExtra(POSITION) ?: throw IllegalArgumentException()
        var vmFactory = SpeakingFactory.getWordsVmFactory(category)
        val data = vmFactory.createDataSet()
        val clickedItem = data[position]
        playSound(clickedItem.sound)

    }

    fun playSound(soundResId: Int) {
        mMediaPlayer?.stop()
        mMediaPlayer = MediaPlayer.create(this, soundResId).apply {
            isLooping = false
            start()
        }
    }
}