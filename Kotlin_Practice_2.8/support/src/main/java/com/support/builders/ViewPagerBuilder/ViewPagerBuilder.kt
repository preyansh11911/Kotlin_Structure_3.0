package com.support.builders.ViewPagerBuilder

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.view.ViewPager
import com.example.parth.kotlinpractice_2.support.BaseFragment
import com.support.POJOModel

fun <T : POJOModel> ViewPager.setUp(
        fManager: FragmentManager,
        mItems: ArrayList<T>,
        singleItemFrag: BaseFragment,
        builder: ViewPagerBuilder<T>.() -> Unit) = ViewPagerBuilder(fManager, this, mItems, singleItemFrag).apply(builder)

class ViewPagerBuilder<T : POJOModel>(
        fManager: FragmentManager,
        viewPager: ViewPager,
        val mItems: ArrayList<T>,
        val singleItemFrag: BaseFragment) : FragmentPagerAdapter(fManager) {

    override fun getItem(position: Int): Fragment {
//        val args = Bundle()
//        args.putParcelable("single_item", mItems[position])
//        singleItemFrag.setArguments(args)
//        return singleItemFrag

        return singleItemFrag.newInstance(mItems[position])
    }

    override fun getCount(): Int = mItems.size

    init {
        viewPager.adapter = this
    }
}