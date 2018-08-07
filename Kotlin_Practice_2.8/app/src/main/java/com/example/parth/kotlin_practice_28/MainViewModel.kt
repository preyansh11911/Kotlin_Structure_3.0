package com.example.parth.kotlin_practice_28

import android.view.MenuItem
import com.example.parth.kotlin_practice_28.FragmentViewPager.ImagePagerFragment
import com.example.parth.kotlin_practice_28.RecyclerView.RecyclerListFragment
import com.example.parth.kotlinpractice_2.support.ActivityViewModel
import com.support.kotlin.startFragment

class MainViewModel(val mActivity: MainActivity) : ActivityViewModel(mActivity) {

    fun onItemSelectedListener(menuItem: MenuItem) {
        when (menuItem.itemId) {
            R.id.menu_btm_nav_recycler_view ->
                mActivity.startFragment(RecyclerListFragment(),"RecyclerList", false, R.id.main_activity_box)
            R.id.menu_btm_nav_view_pager ->
                mActivity.startFragment(ImagePagerFragment(), "ViewPager", false, R.id.main_activity_box)
        }
    }
}