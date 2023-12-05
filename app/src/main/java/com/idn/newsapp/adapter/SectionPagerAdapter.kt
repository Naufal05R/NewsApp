package com.idn.newsapp.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.idn.newsapp.ui.AljazeeraFragment
import com.idn.newsapp.ui.AlquranFragment
import com.idn.newsapp.ui.CommonFragment
import com.idn.newsapp.ui.WarningFragment

class SectionPagerAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {

    override fun getItemCount() = 4

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> CommonFragment()
            1 -> AlquranFragment()
            2 -> AljazeeraFragment()
            3 -> WarningFragment()
            else -> AljazeeraFragment()
        }
    }
}