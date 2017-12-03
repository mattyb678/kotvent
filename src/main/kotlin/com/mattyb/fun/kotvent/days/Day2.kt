package com.mattyb.`fun`.kotvent.days

import com.mattyb.`fun`.kotvent.runner.Adventable

/**
 * @author mberteaux
 */
class Day2 : Adventable {
    override fun part1(input: String): Int {
        return input.lines()
                .map { it.trim().split("\\s".toRegex()).map { it.toInt() } }
                .map { it.fold(Int.MIN_VALUE, { x, y -> maxOf(x, y)}) -
                        it.fold(Int.MAX_VALUE, { x, y -> minOf(x, y) })
                }
                .sum()
    }

    override fun part1InputResource(): String? {
        return "inputs/day2/input"
    }

    override fun part2(input: String): Int {
        return input.lines()
                .map { it.trim().split("\\s".toRegex()).map { it.toInt() } }
                .map { row -> row.map { value -> row.map {
                    if (it != value && it % value == 0) {
                        it.div(value)
                    } else {
                        0
                    } }.sum() }.sum()
                }
                .sum()
    }

    override fun part2InputResource(): String? {
        return "inputs/day2/input"
    }

}