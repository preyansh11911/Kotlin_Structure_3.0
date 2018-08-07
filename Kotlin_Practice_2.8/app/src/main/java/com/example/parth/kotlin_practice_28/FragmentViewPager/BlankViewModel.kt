package com.example.parth.kotlin_practice_28.FragmentViewPager

import com.support.core_utils.FragmentViewModel

class BlankViewModel(val mFragment: BlankFragment) : FragmentViewModel() {

    fun setImages() {
        mFragment.binding.blankImgView.setImageResource((mFragment.arguments?.get("single_item") as PagerSingleItemModel).image)
    }
}