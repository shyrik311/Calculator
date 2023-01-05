package com.example.calculator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private val result = Result(this)
    private val workSpace = WorkSpace(this)
    private var leftBracketCount = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        clear_all.setOnClickListener {
            work_space.text = ""
            result_show.text = ""
        }
        one.setOnClickListener {
            work_space.text = workSpace.addToWorkSpace("1")
        }
        two.setOnClickListener {
            work_space.text = workSpace.addToWorkSpace("2")
        }
        three.setOnClickListener {
            work_space.text = workSpace.addToWorkSpace("3")
        }
        four.setOnClickListener {
            work_space.text = workSpace.addToWorkSpace("4")
        }
        five.setOnClickListener {
            work_space.text = workSpace.addToWorkSpace("5")
        }
        six.setOnClickListener {
            work_space.text = workSpace.addToWorkSpace("6")
        }
        seven.setOnClickListener {
            work_space.text = workSpace.addToWorkSpace("7")
        }
        eight.setOnClickListener {
            work_space.text = workSpace.addToWorkSpace("8")
        }
        nine.setOnClickListener {
            work_space.text = workSpace.addToWorkSpace("9")
        }
        zero.setOnClickListener {
            work_space.text = workSpace.addToWorkSpace("0")
        }
        dot.setOnClickListener {
            work_space.text = workSpace.addToWorkSpace(".")
        }
        plus.setOnClickListener {
            work_space.text = workSpace.addToWorkSpace("+")
        }
        minus.setOnClickListener {
            work_space.text = workSpace.addToWorkSpace("-")
        }
        div.setOnClickListener {
            work_space.text = workSpace.addToWorkSpace("÷")
        }
        multiply.setOnClickListener {
            work_space.text = workSpace.addToWorkSpace("×")
        }
        parentheses.setOnClickListener {
            if (leftBracketCount > 0) {
                work_space.text = workSpace.addToWorkSpace(")")
                leftBracketCount--
            } else {
                work_space.append("(")
                leftBracketCount++
            }
        }
        back_space.setOnClickListener {
            val length = work_space.length()
            if (length > 0)
                work_space.text = work_space.text.subSequence(0, length - 1)
        }
        equals.setOnClickListener {
            result.showResult(result_show)
        }
    }
}
