package com.example.parth.kotlin_practice_28

import com.example.parth.kotlin_practice_28.FragmentViewPager.SamplePagerAdapter
import com.support.core_utils.FragmentViewModel

class SampleFragViewModel(val mFrag: SampleFragment) : FragmentViewModel() {
    fun setViewPager() {
        mFrag.binding.sampleFragViewPgaer.adapter = SamplePagerAdapter(mFrag.childFragmentManager, createImageList())
        mFrag.binding.sampleTabLayout.setupWithViewPager(mFrag.binding.sampleFragViewPgaer)
    }

    fun createImageList(): ArrayList<Int> {
        val arrList = ArrayList<Int>()
        for (i in 1..20) {
            arrList.add(R.drawable.sample)
        }
        return arrList
    }
}