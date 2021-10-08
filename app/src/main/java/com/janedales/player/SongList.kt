package com.janedales.player

import com.google.android.exoplayer2.MediaItem

object SongList {
    fun songList(): List<Song>{

        val list = arrayListOf<Song>()
        list.add(
            Song(
                "Song 1",
                "https://deti-online.com/usr/templates/images/zagadki-pro-noty.jpg",
                MediaItem.fromUri("https://www.soundhelix.com/examples/mp3/SoundHelix-Song-1.mp3")
            )
        )
        list.add(
            Song(
                "Song 2",
                "https://deti-online.com/usr/templates/images/zagadki-pro-noty.jpg",
                MediaItem.fromUri("hhttps://www.soundhelix.com/examples/mp3/SoundHelix-Song-2.mp3")
            )
        )
        list.add(
            Song(
                "Song 3",
                "https://deti-online.com/usr/templates/images/zagadki-pro-noty.jpg",
                MediaItem.fromUri("https://www.soundhelix.com/examples/mp3/SoundHelix-Song-3.mp3")
            )
        )
        list.add(
            Song(
                "Song 4",
                "https://deti-online.com/usr/templates/images/zagadki-pro-noty.jpg",
                MediaItem.fromUri("hhttps://www.soundhelix.com/examples/mp3/SoundHelix-Song-4.mp3")
            )
        )
        list.add(
            Song(
                "Song 5",
                "https://deti-online.com/usr/templates/images/zagadki-pro-noty.jpg",
                MediaItem.fromUri("https://www.soundhelix.com/examples/mp3/SoundHelix-Song-5.mp3")
            )
        )
        list.add(
            Song(
                "Song 6",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRcZv0ZwsEYAtRbsunNPF7373BCYwGBtD-FUMbhZUPJ9jFw8oO2u2y0kbOAGqnyMPINhys&usqp=CAU",
                MediaItem.fromUri("https://www.soundhelix.com/examples/mp3/SoundHelix-Song-6.mp3")
            )
        )
        list.add(
            Song(
                "Song 7",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRcZv0ZwsEYAtRbsunNPF7373BCYwGBtD-FUMbhZUPJ9jFw8oO2u2y0kbOAGqnyMPINhys&usqp=CAU",
                MediaItem.fromUri("https://www.soundhelix.com/examples/mp3/SoundHelix-Song-7.mp3")
            )
        )
        list.add(
            Song(
                "Song 8",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRcZv0ZwsEYAtRbsunNPF7373BCYwGBtD-FUMbhZUPJ9jFw8oO2u2y0kbOAGqnyMPINhys&usqp=CAU",
                MediaItem.fromUri("https://www.soundhelix.com/examples/mp3/SoundHelix-Song-8.mp3")
            )
        )
        list.add(
            Song(
                "Song 9",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRcZv0ZwsEYAtRbsunNPF7373BCYwGBtD-FUMbhZUPJ9jFw8oO2u2y0kbOAGqnyMPINhys&usqp=CAU",
                MediaItem.fromUri("https://www.soundhelix.com/examples/mp3/SoundHelix-Song-9.mp3")
            )
        )
        list.add(
            Song(
                "Song 10",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRcZv0ZwsEYAtRbsunNPF7373BCYwGBtD-FUMbhZUPJ9jFw8oO2u2y0kbOAGqnyMPINhys&usqp=CAU",
                MediaItem.fromUri("https://www.soundhelix.com/examples/mp3/SoundHelix-Song-10.mp3")
            )
        )
        list.add(
            Song(
                "Song 11",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRcZv0ZwsEYAtRbsunNPF7373BCYwGBtD-FUMbhZUPJ9jFw8oO2u2y0kbOAGqnyMPINhys&usqp=CAU",
                MediaItem.fromUri("https://www.soundhelix.com/examples/mp3/SoundHelix-Song-11.mp3")
            )
        )
        list.add(
            Song(
                "Song 12",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRcZv0ZwsEYAtRbsunNPF7373BCYwGBtD-FUMbhZUPJ9jFw8oO2u2y0kbOAGqnyMPINhys&usqp=CAU",
                MediaItem.fromUri("https://www.soundhelix.com/examples/mp3/SoundHelix-Song-12.mp3")
            )
        )
        list.add(
            Song(
                "Song 13",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRcZv0ZwsEYAtRbsunNPF7373BCYwGBtD-FUMbhZUPJ9jFw8oO2u2y0kbOAGqnyMPINhys&usqp=CAU",
                MediaItem.fromUri("https://www.soundhelix.com/examples/mp3/SoundHelix-Song-13.mp3")
            )
        )
        list.add(
            Song(
                "Song 14",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRcZv0ZwsEYAtRbsunNPF7373BCYwGBtD-FUMbhZUPJ9jFw8oO2u2y0kbOAGqnyMPINhys&usqp=CAU",
                MediaItem.fromUri("https://www.soundhelix.com/examples/mp3/SoundHelix-Song-14.mp3")
            )
        )
        list.add(
            Song(
                "Song 15",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRcZv0ZwsEYAtRbsunNPF7373BCYwGBtD-FUMbhZUPJ9jFw8oO2u2y0kbOAGqnyMPINhys&usqp=CAU",
                MediaItem.fromUri("https://www.soundhelix.com/examples/mp3/SoundHelix-Song-15.mp3")
            )
        )

        return list
    }
}