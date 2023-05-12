package com.example.coil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import coil.load
import com.example.coil.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        var imageUrls = listOf(
            "https://images.pexels.com/photos/7841717/pexels-photo-7841717.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
            "https://images.pexels.com/photos/15052339/pexels-photo-15052339.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
            "https://images.pexels.com/photos/15974265/pexels-photo-15974265.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
            "https://images.pexels.com/photos/14823052/pexels-photo-14823052.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
            "https://images.pexels.com/photos/16107388/pexels-photo-16107388.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
            "https://images.pexels.com/photos/14941160/pexels-photo-14941160.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"

        )

        val adapter = ViewPagerAdapter(imageUrls)
        binding.viewPager2.adapter = adapter


    }
}