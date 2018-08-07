package com.example.parth.kotlin_practice_28

import android.os.Bundle
import com.example.parth.kotlin_practice_28.databinding.ActivitySampleBinding
import com.example.parth.kotlinpractice_2.support.CoreActivity
import com.support.kotlin.startFragment

class SampleActivity : CoreActivity<SampleActivity, ActivitySampleBinding, SampleViewModel>() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setDefaults(this@SampleActivity, R.layout.activity_sample)
    }

    override fun setVM(binding: ActivitySampleBinding) {
        binding.vm = vm
    }

    override fun createViewModel(activity: SampleActivity): SampleViewModel = SampleViewModel(this@SampleActivity)

    override fun getActionBarTitle(): String = "Sample Activity"

    override fun workArea(viewModel: SampleViewModel) {
//        vm?.setViewPager()
        startFragment(SampleFragment(), "Sample Fragment", false, R.id.sample_box)
    }
}
