package com.example.hw_6_3

import android.view.ViewGroup

class PlaylistAdapter {
    private val playlist: ArrayList<Song>

    val onClick: (tittle: String) -> Unit): Adapter<PlaylistAdapter.PlaylistViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaylistViewHolder {
            return PlaylistViewHolder(ItemPlaylistBinding.inflate(LayoutInflater.from(parent.context),parent,false))
        }

        override fun onBindViewHolder(holder: PlaylistViewHolder, position: Int) {
            holder.bind()
        }

        override fun getItemCount() = playlist.size

        inner class PlaylistViewHolder(private val binding: ItemPlaylistBinding) : ViewHolder(binding.root){
            fun bind(){

                val item = playlist[adapterPosition]

                itemView.setOnClickListener {
                    onClick(playlist[adapterPosition].name)
                }

                binding.apply {

                    tvNumber.text = item.number
                    tvSongName.text = item.name
                    tvSinger.text = item.singer
                    tvTime.text = item.time
                }
            }

        }


    }
}