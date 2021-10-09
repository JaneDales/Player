package com.janedales.player

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import com.google.android.exoplayer2.SimpleExoPlayer
import com.google.android.exoplayer2.source.ProgressiveMediaSource
import com.google.android.exoplayer2.ui.PlayerView
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory
import com.google.android.exoplayer2.util.Util


class MainActivity : AppCompatActivity() {

    private var player: SimpleExoPlayer? = null

    private val adapter: PlayerAdapter = PlayerAdapter {
        playSong(it)
    }

    private var recyclerView: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        recyclerView = findViewById(R.id.recyclerView)
        recyclerView?.adapter = adapter
        val dividerItemDecoration = DividerItemDecoration(
            this,
            RecyclerView.VERTICAL
        )
        recyclerView?.addItemDecoration(dividerItemDecoration)

        initPlayer()

        val list = SongList.songList()
        adapter.setItems(list)
    }

    private fun initPlayer(){
        val playerView: PlayerView = findViewById(R.id.exoplayer)
        playerView.controllerShowTimeoutMs = 0
        playerView.cameraDistance = 30F

        player = SimpleExoPlayer.Builder(this).build()
        playerView.player = player
    }

    private fun playSong(song: Song){
        val dataSourceFactory = DefaultDataSourceFactory(
            this,
            Util.getUserAgent(this, "app")
        )
        val audiSource = ProgressiveMediaSource.Factory(dataSourceFactory).createMediaSource(song.media)
        player?.setMediaSource(audiSource)
        player?.playWhenReady = true
    }
}