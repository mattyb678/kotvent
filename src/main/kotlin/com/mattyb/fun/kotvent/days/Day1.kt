package com.mattyb.`fun`.kotvent.days

import com.mattyb.`fun`.kotvent.runner.Adventable

/**
 * @author mberteaux
 */
class Day1 : Adventable {
    override fun part1InputResource(): String? {
        return "inputs/day1/input"
    }

    override fun part1(input: String): Int {
        val values = input.map { it.toString().toInt() }
        return calculateSum(values, input, 1)
    }

    private fun calculateSum(values: List<Int>, input: String, lookahead: Int): Int {
        return input
                .map { it.toString().toInt() }
                .filterIndexed { idx, it -> it == values[(idx + lookahead) % values.size] }
                .sum()
    }

    override fun part2InputResource(): String? {
        return "inputs/day1/input"
    }

    override fun part2(input: String): Int {
        val values = input.map { it.toString().toInt() }
        return calculateSum(values, input, values.size / 2)
    }
}