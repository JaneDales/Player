package com.janedales.player

import com.google.android.exoplayer2.MediaItem

data class Song(
    val title: String,
    val avatar: String,
    val media: MediaItem
)