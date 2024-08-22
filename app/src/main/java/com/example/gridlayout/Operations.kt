package com.example.gridlayout

import android.content.Context
import android.widget.Toast


class Operations() {
    val keys = mapOf(
        1 to "1",
        2 to "2",
        3 to "3",
        4 to "4",
        5 to "5",
        6 to "6",
        7 to "7",
        8 to "8",
        9 to "9",
        0 to "0",
        "/" to "/",
        "*" to "*",
        "-" to "-",
        "+" to "+"
    )

    fun calc(context: Context, inputString: String): Double {
        var result = 0.0
        val numbers = inputString.split('+', '-', '*', '/')
        var operands: MutableList<Char> = mutableListOf()
        for (char in inputString.indices) {
            if (inputString[char] == '/' || inputString[char] == '*' || inputString[char] == '-' || inputString[char] == '+') {
                operands.add(inputString[char])
            }
        }
        if (numbers.size == 2 && operands.size == 1) {
            when (operands[0]) {
                '+' -> result = numbers[0].toDouble() + (numbers[1].toDouble())
                '-' -> result = numbers[0].toDouble() - (numbers[1].toDouble())
                '*' -> result = numbers[0].toDouble() * (numbers[1].toDouble())
                '/' -> result = numbers[0].toDouble() / (numbers[1].toDouble())
            }
            Toast.makeText(
                context,
                "Готово",
                Toast.LENGTH_LONG
            ).show()
        } else {
            Toast.makeText(
                context,
                "Калькулятор работает только с двумя операндами :(",
                Toast.LENGTH_LONG
            ).show()
            return result

        }
        return result
    }
}