package com.example.parth.kotlin_practice_28.TabView

import com.support.builders.ViewPagerBuilder.setUp
import com.support.core_utils.FragmentViewModel
import kotlinx.android.synthetic.main.fragment_tab_view.view.*

class TabViewModel(val mFragment: TabViewFragment) : FragmentViewModel() {
    val binding = mFragment.binding
    val view = binding.root
    fun setUpTabs() {
        view.tab_view_pager.setUp(mFragment.childFragmentManager, createTabList()) {}
    }

    fun createTabList(): {

    }
}