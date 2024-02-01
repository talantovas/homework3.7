package com.geeks.homework37

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.geeks.homework37.databinding.FragmentMusicListBinding

class MusicListFragment : Fragment() {

    private lateinit var binding: FragmentMusicListBinding
    private val musicList = arrayListOf(
        MusicModel("1", "Blank Space", "Taylor Swift", "3:22"),
        MusicModel("2", "Watch Me", "Silento", "5:36"),
        MusicModel("3", "Earned It", "The Weekend", "4:51"),
        MusicModel("4", "The Hills", "The Weekend", "3:41"),
        MusicModel("5", "Danza Kuduro", "Don Omar", "3:46"),
        MusicModel("6", "Ayo Technology", "50 Cent ft Justin Timberlake", "4:09"),
        MusicModel("7", "Кечки Бишкек", "Mirbek Atabekov", "4:19"),
        MusicModel("8", "Про любовь", "Xcho", "2:21"),
        MusicModel("9", "Поэт", "Xcho", "2:40"),
        MusicModel("10", "Красивая история", "Алан Черкасов", "3:52"),
        MusicModel("11", "Ne-Yo", "Miss Independent", "4:01"),
        MusicModel("12", "Твои сонные глаза", "Jah Khalib", "3:04"),
        MusicModel("13", "Ne-Yo", "So Sick", "3:30"),
        MusicModel("14", "Empire-State-Of-Mind", "JAY-Z,Alicia Keys", "4:36"),
        MusicModel("15", "Perfect", "Ed-Sheeran", "4:23"),
        MusicModel("16", "Divo", "Ulukmanapo", "2:45"),
        MusicModel("17", "Dancin", "Aaron Smith", "3:22"),
        MusicModel("18", "Привет", "Bakr", "2:35"),
        MusicModel("19", "One Kiss", "Dua Lipa", "3:44"),
        MusicModel("20", "Die For You", "The Weekend", "4:18"),
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMusicListBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val musicAdapter = MusicAdapter(musicList,this::onClick)
        binding.rvMusicList.adapter = musicAdapter
    }

    fun onClick(pos:Int){
        val intent = Intent(activity, SecondActivity::class.java)
        intent.putExtra("key",pos)
        startActivity(intent)
    }
}