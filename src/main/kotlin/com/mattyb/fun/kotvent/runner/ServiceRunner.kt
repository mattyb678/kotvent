package com.mattyb.`fun`.kotvent.runner

import org.reflections.Reflections

/**
 * @author mberteaux
 */
class ServiceRunner

fun main(args: Array<String>) {
    val toRun = args[0]
    val reflections = Reflections("com.mattyb.fun.kotvent.days")
    val clz = reflections.getSubTypesOf(Adventable::class.java)
            .find { it.simpleName.equals(toRun, true) }
    val inst = clz?.newInstance()

    val part1Resource = clz?.getMethod("part1InputResource")?.invoke(inst) as String
    val part1Input = part1Resource?.slurp()
    val part1Resp = clz?.getMethod("part1", String::class.java)?.invoke(inst, part1Input)
    println("Part 1: $part1Resp")

    val part2Resource = clz?.getMethod("part2InputResource")?.invoke(inst) as String
    val part2Input = part2Resource?.slurp()
    val part2Resp = clz?.getMethod("part2", String::class.java)?.invoke(inst, part2Input)
    println("Part 2: $part2Resp")
}