package com.example.parth.kotlin_practice_28.FragmentViewPager

import com.support.core_utils.FragmentViewModel
import kotlinx.android.synthetic.main.fragment_single_item.view.*

class SingleItemViweModel(mFragment: SingleItemFragment) : FragmentViewModel() {

    val binding = mFragment.binding
    val view = binding.root

    var mItem: ViewPagerItemModel? = null

    fun setImage() {
        view.img_pager_single_item.setImageResource(mItem!!.imageID)
    }
}