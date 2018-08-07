package com.example.parth.kotlin_practice_28.FragmentViewPager

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class SamplePagerAdapter(fm: FragmentManager, val mItems: ArrayList<Int>) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        val frag = BlankFragment()
        val args = Bundle()
        args.putInt("image_id", mItems[position])
        frag.arguments = args
        return frag
    }

    override fun getCount(): Int = mItems.size
}