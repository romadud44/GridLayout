package com.example.gridlayout


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

    fun calc(inputString: String): Double {
        var result = 0.0
        val numbers = inputString.split('+', '-', '*', '/')
        var opersnds: MutableList<Char> = mutableListOf()
        for (char in inputString.indices) {
            if (inputString[char] == '/' || inputString[char] == '*' || inputString[char] == '-' || inputString[char] == '+') {
                opersnds.add(inputString[char])
            }
        }
        when (opersnds[0]) {
            '+' -> result = numbers[0].toDouble() + (numbers[1].toDouble())
            '-' -> result = numbers[0].toDouble() - (numbers[1].toDouble())
            '*' -> result = numbers[0].toDouble() * (numbers[1].toDouble())
            '/' -> result = numbers[0].toDouble() / (numbers[1].toDouble())
        }
        return result
    }
}