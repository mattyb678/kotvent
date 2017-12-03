package com.mattyb.`fun`.kotvent.runner

/**
 * @author mberteaux
 */
fun String?.slurp(): String {
    return ServiceRunner::class.java.classLoader.getResource(this).readText()
}