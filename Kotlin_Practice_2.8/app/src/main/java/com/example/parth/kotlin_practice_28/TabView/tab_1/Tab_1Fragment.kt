package com.example.parth.kotlin_practice_28.TabView.tab_1


import com.example.parth.kotlin_practice_28.R
import com.example.parth.kotlin_practice_28.databinding.FragmentTab1Binding
import com.support.core_utils.CoreFragment_DataBinding

class Tab_1Fragment : CoreFragment_DataBinding<Tab_1Fragment, FragmentTab1Binding, Tab1ViewModel>() {
    override fun workArea() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getLayoutView(): Int = R.layout.fragment_tab_1

    override fun getFragmentContext(): Tab_1Fragment = this

    override fun createViewModel(): Tab1ViewModel = Tab1ViewModel(getFragmentContext())

    override fun setVM(binding: FragmentTab1Binding) {
        binding.vm = vm
    }


}
