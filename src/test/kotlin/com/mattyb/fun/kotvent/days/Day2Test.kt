package com.mattyb.`fun`.kotvent.days

import io.kotlintest.matchers.shouldBe
import io.kotlintest.specs.StringSpec

/**
 * @author mberteaux
 */
class Day2Test : StringSpec() {
    init {
        val day2 = Day2()
        "day 2 should produce correct checksum" {
            day2.part1("""
                5 1 9 5
                7 5 3
                2 4 6 8
            """.trimIndent()) shouldBe 18
        }

        "day 2 part 2 should produce correct checksum" {
            day2.part2("""
                5 9 2 8
                9 4 7 3
                3 8 6 5
            """.trimIndent()) shouldBe 9
        }
    }
}