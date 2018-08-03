package com.example.parth.kotlin_practice_28.RecyclerView

import com.support.POJOModel

data class SampleModel(var name: String, val desc: String) : POJOModel() {
    init {
        Companion.id++
        this.id = Companion.id
        name+=this.id
    }
    companion object {
        var id: Long = 0
    }
}