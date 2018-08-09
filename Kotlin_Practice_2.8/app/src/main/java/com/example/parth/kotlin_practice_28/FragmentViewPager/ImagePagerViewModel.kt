package com.example.parth.kotlin_practice_28.FragmentViewPager

import com.example.parth.kotlin_practice_28.R
import com.support.animations.DepthPageTransformer
import com.support.animations.ZoomOutPageTransformer
import com.support.builders.ViewPagerBuilder.setUp
import com.support.core_utils.FragmentViewModel

class ImagePagerViewModel(val mFragment: ImagePagerFragment) : FragmentViewModel() {
    fun setViewPager() {
//        mFragment.binding.viewPager.adapter = SamplePagerAdapter(mFragment.childFragmentManager, createImageList())

        mFragment.binding.viewPager1
                .setUp(mFragment.childFragmentManager,
                        createImageList(0)) {
                    getFragmentInstance { BlankFragment.newInstance(it) }
                    animation = ZoomOutPageTransformer()
                }
        mFragment.binding.tabLayout1.setupWithViewPager(mFragment.binding.viewPager1)

        mFragment.binding.viewPager2
                .setUp(mFragment.childFragmentManager,
                        createImageList(1)) {
                    getFragmentInstance { BlankFragment.newInstance(it) }
                    animation = DepthPageTransformer()
                }
        mFragment.binding.tabLayout2.setupWithViewPager(mFragment.binding.viewPager2)
    }

    fun createImageList(flag: Int): ArrayList<PagerSingleItemModel> {
        val arrList = ArrayList<PagerSingleItemModel>()
        for (i in 1..10) {
            if (flag == 0)
                arrList.add(PagerSingleItemModel(R.drawable.sample))
            else
                arrList.add(PagerSingleItemModel(R.drawable.sample_2))
        }
        return arrList
    }
}