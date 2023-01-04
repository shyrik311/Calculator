package com.example.calculator

import kotlinx.android.synthetic.main.activity_main.*

class WorkSpace(private val mainActivity: MainActivity) {

    fun addToWorkSpace(buttonValue: String): String {
        val workSpaceText = mainActivity.work_space.text
        return "${workSpaceText}$buttonValue"
    }
}