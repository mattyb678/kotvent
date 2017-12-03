package com.mattyb.`fun`.kotvent.days

import io.kotlintest.matchers.shouldBe
import io.kotlintest.specs.StringSpec

/**
 * @author mberteaux
 */
class Day1Test : StringSpec() {
    init {
        val day1 = Day1()
        "part 1 should produce correct sum" {
            day1.part1("1122") shouldBe 3
            day1.part1("1111") shouldBe 4
            day1.part1("1234") shouldBe 0
            day1.part1("91212129") shouldBe 9
        }
        "part 2 should produce correct sum" {
            day1.part2("1212") shouldBe 6
            day1.part2("1221") shouldBe 0
            day1.part2("123425") shouldBe 4
            day1.part2("123123") shouldBe 12
            day1.part2("12131415") shouldBe 4
        }
    }
}