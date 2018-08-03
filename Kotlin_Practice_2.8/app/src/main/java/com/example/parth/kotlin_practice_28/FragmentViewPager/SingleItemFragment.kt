package com.example.parth.kotlin_practice_28.FragmentViewPager

import com.example.parth.kotlin_practice_28.R
import com.example.parth.kotlin_practice_28.databinding.FragmentSingleItemBinding
import com.support.core_utils.CoreFragment_DataBinding

class SingleItemFragment : CoreFragment_DataBinding<SingleItemFragment, FragmentSingleItemBinding, SingleItemViweModel, ViewPagerItemModel>() {

    override fun workArea() {
        vm?.setImage()
    }

    override fun getLayoutView(): Int = R.layout.fragment_single_item

    override fun getFragmentContext(): SingleItemFragment = this

    override fun createViewModel(): SingleItemViweModel = SingleItemViweModel(getFragmentContext())

    override fun setVM(binding: FragmentSingleItemBinding) {
        binding.vm = vm
    }

    override fun setItem(vm: SingleItemViweModel, item: ViewPagerItemModel) {
        vm.mItem = item
    }
}
