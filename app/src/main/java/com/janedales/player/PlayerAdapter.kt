package com.janedales.player

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions

class PlayerAdapter(
    private val onSonClicked: (Song) -> Unit
) :
RecyclerView.Adapter<PlayerAdapter.ViewHolder>() {

    private var list: List<Song> = arrayListOf()

    fun setItems(list: List<Song>){
        this.list = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_music_list, parent, false)
        return ViewHolder(itemView).apply {
            itemView.setOnClickListener {
                onSonClicked(list[absoluteAdapterPosition])
            }
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])
    }

    class ViewHolder(parent: View) : RecyclerView.ViewHolder(parent) {

        var tvTitle: TextView = itemView.findViewById(R.id.tvTitle)
        var ivAvatar: ImageView = itemView.findViewById(R.id.ivAvatar)

        fun bind(song: Song) {
            tvTitle.text = song.title

            var requestOptions = RequestOptions()
            requestOptions = requestOptions.transforms(CenterCrop(), RoundedCorners(12))
            Glide.with(itemView.context)
                .load(song.avatar)
                .apply(requestOptions)
                .into(ivAvatar)
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}