package com.example.parth.kotlin_practice_28.FragmentViewPager

import com.example.parth.kotlin_practice_28.R
import com.example.parth.kotlin_practice_28.databinding.FragmentViewPagerBinding
import com.support.core_utils.CoreFragment_DataBinding


class ViewPagerFragment : CoreFragment_DataBinding<ViewPagerFragment, FragmentViewPagerBinding, ViewPagerViewModel>() {

    override fun workArea() {

    }

    override fun getLayoutView(): Int = R.layout.fragment_view_pager

    override fun getFragmentContext(): ViewPagerFragment = this

    override fun createViewModel(): ViewPagerViewModel = ViewPagerViewModel(getFragmentContext())

    override fun setVM(binding: FragmentViewPagerBinding) {
        binding.vm = vm
    }

}
