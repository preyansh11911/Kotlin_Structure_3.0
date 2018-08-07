package com.example.parth.kotlin_practice_28.RecyclerView

import com.example.parth.kotlin_practice_28.R
import com.example.parth.kotlin_practice_28.databinding.FragmentListBinding
import com.support.builders.RecyckerViewBuilder.RecyclerViewLayoutManager.GRID
import com.support.builders.RecyckerViewBuilder.RecyclerViewLayoutManager.LINEAR
import com.support.builders.RecyckerViewBuilder.RecyclerViewLinearLayout.HORIZONTAL
import com.support.builders.RecyckerViewBuilder.RecyclerViewLinearLayout.VERTICAL
import com.support.core_utils.CoreFragment_DataBinding
import kotlinx.android.synthetic.main.fragment_list.view.*

class RecyclerListFragment : CoreFragment_DataBinding<RecyclerListFragment, FragmentListBinding, RecyclerListViewModel>() {

    override fun workArea() {

        vm?.let {
            it.createListView(it.view.rec_vertical, R.layout.item_row_main, LINEAR, VERTICAL)
            it.createListView(it.view.rec_horizontal, R.layout.item_row_horizontal, LINEAR, HORIZONTAL)
            it.createListView(it.view.rec_grid, R.layout.item_row_grid, GRID, VERTICAL)
        }
    }

    override fun getLayoutView(): Int = R.layout.fragment_list

    override fun getFragmentContext(): RecyclerListFragment = this

    override fun createViewModel(): RecyclerListViewModel = RecyclerListViewModel(this)

    override fun setVM(binding: FragmentListBinding) {
        binding.vm = vm
    }

}
