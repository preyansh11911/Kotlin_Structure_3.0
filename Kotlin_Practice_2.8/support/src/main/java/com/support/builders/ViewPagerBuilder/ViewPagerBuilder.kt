package com.support.builders.ViewPagerBuilder

import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.view.ViewPager
import android.view.Gravity
import com.support.POJOModel

inline fun <T : POJOModel> ViewPager.setUp(
        fManager: FragmentManager,
        mItems: ArrayList<T>,
        builder: ViewPagerBuilder<T>.() -> Unit) = ViewPagerBuilder(fManager, this, mItems).apply(builder)

class ViewPagerBuilder<T : POJOModel>(
        fManager: FragmentManager,
        val viewPager: ViewPager,
        val mItems: ArrayList<T>) : FragmentPagerAdapter(fManager) {

    var fragmentInstanceListener: ((T) -> Fragment)? = null

    override fun getItem(position: Int): Fragment {
        return fragmentInstanceListener?.invoke(mItems[position])!!
    }

    override fun getCount(): Int = mItems.size

    init {
        viewPager.adapter = this
    }

    fun getFragmentInstance(l: (T) -> Fragment) {
        fragmentInstanceListener = l
    }

    fun setTabLayout(tabLayout: TabLayout) {
        tabLayout.tabGravity = Gravity.CENTER
        tabLayout.setupWithViewPager(viewPager)
    }
}