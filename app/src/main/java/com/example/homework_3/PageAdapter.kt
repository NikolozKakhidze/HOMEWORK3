package com.example.homework_3

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class PageAdapter (fm: FragmentManager) : FragmentPagerAdapter (fm) {
    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> {return Fragment1 ()}
            1 -> {return Fragment2 ()}
            2 -> {return Fragment3 ()}
            else -> (return Fragment1 () )
        }
    }

    override fun getItem(position: Int): Fragment {
        return 3
    }
}
