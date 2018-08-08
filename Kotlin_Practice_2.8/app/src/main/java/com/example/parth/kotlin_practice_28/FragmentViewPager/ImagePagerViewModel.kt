package com.example.parth.kotlin_practice_28.FragmentViewPager

import com.example.parth.kotlin_practice_28.R
import com.support.builders.ViewPagerBuilder.setUp
import com.support.core_utils.FragmentViewModel

class ImagePagerViewModel(val mFragment: ImagePagerFragment) : FragmentViewModel() {
    fun setViewPager() {
//        mFragment.binding.viewPager.adapter = SamplePagerAdapter(mFragment.childFragmentManager, createImageList())

        mFragment.binding.viewPager
                .setUp(mFragment.childFragmentManager,
                        createImageList()) { getFragmentInstance { BlankFragment.newInstance(it) } }
        mFragment.binding.tabLayout.setupWithViewPager(mFragment.binding.viewPager)
    }

    fun createImageList(): ArrayList<PagerSingleItemModel> {
        val arrList = ArrayList<PagerSingleItemModel>()
        for (i in 1..10)
            arrList.add(PagerSingleItemModel(R.drawable.sample))
        return arrList
    }
}