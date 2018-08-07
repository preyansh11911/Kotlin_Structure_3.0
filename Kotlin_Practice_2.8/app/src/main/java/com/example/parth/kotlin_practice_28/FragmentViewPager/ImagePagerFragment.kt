package com.example.parth.kotlin_practice_28.FragmentViewPager

import com.example.parth.kotlin_practice_28.R
import com.example.parth.kotlin_practice_28.databinding.FragmentImagePagerBinding
import com.support.core_utils.CoreFragment_DataBinding

class ImagePagerFragment : CoreFragment_DataBinding<ImagePagerFragment, FragmentImagePagerBinding, ImagePagerViewModel>() {
    override fun workArea() {
        vm?.setViewPager()
    }

    override fun getLayoutView(): Int = R.layout.fragment_image_pager

    override fun getFragmentContext(): ImagePagerFragment = this

    override fun createViewModel(): ImagePagerViewModel = ImagePagerViewModel(this)

    override fun setVM(binding: FragmentImagePagerBinding) {
        binding.vm = vm
    }

}
