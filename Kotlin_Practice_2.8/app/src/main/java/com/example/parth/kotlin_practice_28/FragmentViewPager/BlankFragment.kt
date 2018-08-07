package com.example.parth.kotlin_practice_28.FragmentViewPager

import com.example.parth.kotlin_practice_28.R
import com.example.parth.kotlin_practice_28.databinding.FragmentBlankBinding
import com.support.core_utils.CoreFragment_DataBinding

class BlankFragment : CoreFragment_DataBinding<BlankFragment, FragmentBlankBinding, BlankViewModel>() {

    override fun workArea() {
        vm?.setImages()
    }

    override fun getLayoutView(): Int = R.layout.fragment_blank

    override fun getFragmentContext(): BlankFragment = this

    override fun createViewModel(): BlankViewModel = BlankViewModel(this)

    override fun setVM(binding: FragmentBlankBinding) {
        binding.vm = vm
    }
}
