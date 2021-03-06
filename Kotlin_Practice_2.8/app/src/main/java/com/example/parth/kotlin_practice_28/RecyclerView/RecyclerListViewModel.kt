package com.example.parth.kotlin_practice_28.RecyclerView

import android.support.annotation.LayoutRes
import android.support.v7.widget.RecyclerView
import android.view.View
import com.support.builders.RecyckerViewBuilder.RecyclerViewLayoutManager.GRID
import com.support.builders.RecyckerViewBuilder.RecyclerViewLayoutManager.LayoutManager
import com.support.builders.RecyckerViewBuilder.RecyclerViewLinearLayout.Orientation
import com.support.builders.RecyckerViewBuilder.setUp
import com.support.core_utils.FragmentViewModel
import kotlinx.android.synthetic.main.item_row_main.view.*

class RecyclerListViewModel(val mFragment: RecyclerListFragment) : FragmentViewModel() {

    lateinit var arrList: ArrayList<SampleModel>

    val binding = mFragment.binding
    val view: View = binding.root

    fun createListView(recyclerView: RecyclerView, @LayoutRes layoutResID: Int, @LayoutManager layoutManager: Int, @Orientation orientation: Int) {
        recyclerView.setUp(layoutResID, createList(), layoutManager, orientation) {
            if (layoutManager == GRID)
                spanCount = { 3 }
            contentBinder { item, view ->
                view.tv_name.text = item.name
                view.tv_desc.text = item.desc

                view.setOnClickListener {
                    removeItem(item)
//                    mFragment.startActivity(Intent(mFragment.activity, SampleActivity::class.java))
                }
            }
            isNestedScrollingEnabled = { false }
        }
    }

    private fun createList(): ArrayList<SampleModel> {
        arrList = ArrayList()
        for (i in 1..10) {
            arrList.add(SampleModel("Name : ", "Age : 25"))
        }
        return arrList
    }

}