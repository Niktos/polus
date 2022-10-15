package com.example.hahaton

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.yandex.mapkit.MapKitFactory
import com.yandex.mapkit.geometry.Point
import com.yandex.mapkit.map.CameraListener
import com.yandex.mapkit.map.CameraPosition
import com.yandex.mapkit.map.CameraUpdateReason
import com.yandex.mapkit.map.Map
import com.yandex.mapkit.user_location.UserLocationLayer
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_map.*

class MainActivity : AppCompatActivity() {

//    private lateinit var binding: ActivityMainBinding

    private lateinit var userLocationLayer: UserLocationLayer

    private var routeStartLocation = Point(0.0, 0.0)

    private var permissionLocation = false
    private var followUserLocation = false

    override fun onCreate(savedInstanceState: Bundle?) {

//        MapKitFactory.setApiKey(About.mapKitApiKey)
//        MapKitFactory.initialize(this)
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)





        // Set Home selected

        // Set Home selected
        bottomNavigationView.selectedItemId = R.id.home

        // Perform item selected listener

        // Perform item selected listener
        bottomNavigationView.setOnNavigationItemSelectedListener(BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.dashboard -> {
                    startActivity(Intent(applicationContext, DashBoard::class.java))
                    overridePendingTransition(0, 0)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.home -> return@OnNavigationItemSelectedListener true
                R.id.about -> {
                    startActivity(Intent(applicationContext, About::class.java))
                    overridePendingTransition(0, 0)
                    return@OnNavigationItemSelectedListener true
                }
            }
            false
        })



        class SecondViewPagerAdapter(fragment: FragmentManager) : FragmentPagerAdapter(fragment){
            private var fragmentList: MutableList<Fragment> = ArrayList()
            private var titleList : MutableList<String> = ArrayList()

            override fun getCount(): Int {
                return fragmentList.size
            }

            override fun getItem(position: Int): Fragment {
                return fragmentList[position]
            }

            fun addFragment(fragment: Fragment, title: String){
                fragmentList.add(fragment)
                titleList.add(title)
            }

            override fun getPageTitle(position: Int): CharSequence? {
                return titleList[position]
            }
        }



    }

//    private fun onMapReady() {
//        val mapKit = MapKitFactory.getInstance()
//        userLocationLayer = mapKit.createUserLocationLayer(map_b.mapWindow)
//        userLocationLayer.isVisible = true
//        userLocationLayer.isHeadingEnabled = true
//
//
//        map_b.map.addCameraListener(this)
//
//
//        permissionLocation = true
//    }

//    override fun onCameraPositionChanged(
//        p0: Map,
//        p1: CameraPosition,
//        p2: CameraUpdateReason,
//        p3: Boolean
//    ) {
//        TODO("Not yet implemented")
//    }

    override fun onStop() {
//        map_b.onStop()
//        MapKitFactory.getInstance().onStop()
        super.onStop()
    }

    override fun onStart() {
        super.onStart()
//        MapKitFactory.getInstance().onStart()
//        map_b.onStart()
    }

//    companion object {
//        /**
//         * Replace "your_api_key" with a valid developer key.
//         * You can get it at the https://developer.tech.yandex.ru/ website.
//         */
//        const val mapKitApiKey = "2c717632-b4fa-41e3-acbb-3b5ef8996809"
//        const val requestPermissionLocation = 1
//    }
}