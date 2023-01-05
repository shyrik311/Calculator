package com.example.calculator

import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import org.mariuszgromada.math.mxparser.Expression
import java.text.DecimalFormat

class Result(private val mainActivity: MainActivity) {

    private fun getInputOperation(): String {
        var operation = mainActivity.work_space.text.replace(Regex("÷"), "/")
        operation = operation.replace(Regex("×"), "*")
        return operation
    }

    fun showResult(resultShow: TextView) {
        try {
            val expression = getInputOperation()
            val result = Expression(expression).calculate()
            if (result.isNaN()) {
                resultShow.setText(R.string.error)
            } else {
                resultShow.text = DecimalFormat("0.######").format(result).toString()
            }
        } catch (e: Exception) {
            resultShow.setText(R.string.error)
        }
    }
}