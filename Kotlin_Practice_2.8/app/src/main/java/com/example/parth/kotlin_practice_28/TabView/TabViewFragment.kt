package com.example.parth.kotlin_practice_28.TabView

import com.example.parth.kotlin_practice_28.R
import com.example.parth.kotlin_practice_28.databinding.FragmentTabViewBinding
import com.support.core_utils.CoreFragment_DataBinding

class TabViewFragment : CoreFragment_DataBinding<TabViewFragment, FragmentTabViewBinding, TabViewModel>() {
    override fun workArea() {
        vm?.setUpTabs()
    }

    override fun getLayoutView(): Int = R.layout.fragment_tab_view

    override fun getFragmentContext(): TabViewFragment = this

    override fun createViewModel(): TabViewModel = TabViewModel(getFragmentContext())

    override fun setVM(binding: FragmentTabViewBinding) {
        binding.vm = vm
    }
}
