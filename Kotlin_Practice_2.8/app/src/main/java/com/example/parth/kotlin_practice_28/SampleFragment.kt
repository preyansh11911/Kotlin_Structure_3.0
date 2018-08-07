package com.example.parth.kotlin_practice_28

import com.example.parth.kotlin_practice_28.databinding.FragmentSampleBinding
import com.support.core_utils.CoreFragment_DataBinding

class SampleFragment : CoreFragment_DataBinding<SampleFragment, FragmentSampleBinding, SampleFragViewModel>() {
    override fun workArea() {
        vm?.setViewPager()
    }

    override fun getLayoutView(): Int = R.layout.fragment_sample


    override fun getFragmentContext(): SampleFragment = this

    override fun createViewModel(): SampleFragViewModel = SampleFragViewModel(this)

    override fun setVM(binding: FragmentSampleBinding) {
        binding.vm = vm
    }

}
