package com.support.builders.ViewPagerBuilder

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.view.ViewPager
import com.support.builders.ViewPagerBuilder.ViewPagerTypes.ViewPagerType

fun <T> ViewPager.setUp(fManager: FragmentManager, @ViewPagerType type: Int, mItems: ArrayList<T>, builder: ViewPagerBuilder<T>.() -> Unit) = ViewPagerBuilder<T>(fManager, this, type, mItems).apply(builder)

class ViewPagerBuilder<T>(fManager: FragmentManager, viewPager: ViewPager, @ViewPagerType type: Int, mItems: ArrayList<T>) : FragmentPagerAdapter(fManager) {

    override fun getItem(position: Int): Fragment {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    init {

    }

}