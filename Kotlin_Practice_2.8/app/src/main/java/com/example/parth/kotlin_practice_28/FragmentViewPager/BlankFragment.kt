package com.example.parth.kotlin_practice_28.FragmentViewPager

import android.os.Bundle
import com.example.parth.kotlin_practice_28.R
import com.example.parth.kotlin_practice_28.databinding.FragmentBlankBinding
import com.support.POJOModel
import com.support.core_utils.CoreFragment_DataBinding

class BlankFragment : CoreFragment_DataBinding<BlankFragment, FragmentBlankBinding, BlankViewModel>() {

    companion object {
        fun newInstance(mItem: POJOModel): BlankFragment {
            val frag = BlankFragment()
            val args = Bundle()
            args.putParcelable("single_item", mItem)
            frag.arguments = args
            return frag
        }
    }

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
