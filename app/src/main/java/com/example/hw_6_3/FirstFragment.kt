package com.example.hw_6_3

import android.graphics.Insets.add
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class FirstFragment : Fragment() {


    private lateinit var binding: FragmentSongBinding

    private lateinit var playlist: ArrayList<Song>

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSongBinding.inflate(layoutInflater)
        return binding.root
    }

override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    loadData()
    val adapter = PlaylistAdapter(playlist, this::onClick)
    binding.recyclerView.adapter = adapter
}

private fun loadData() {

    playlist = ArrayList<Song>()

    playlist.apply {
        add(Song("1","Blank Space", "Taylor Swift","3:22"))
        add(Song("2","Watch Me", "Silento","5:36"))
        add(Song("3","Earned It", "The Weekend","4:51"))
        add(Song("4","The Hills", "The Weekend","3:41"))
        add(Song("5","Burn It All Down", "League of Legends,
    }
                private fun onClick(tittle: String){
            val bundle = Bundle()
            bundle.putString("di", tittle)
            val songInfoFragment = SongInfoFragment()
            songInfoFragment.arguments = bundle
            requireActivity().supportFragmentManager.beginTransaction().replace(R.id.container, songInfoFragment)
                .addToBackStack(null).commit()
        }