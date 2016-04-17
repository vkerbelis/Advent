package com.vkerbelis.adventofcode

import java.util.*

/**
 * @author Vidmantas Kerbelis (vkerbelis@yahoo.com) on 2016-04-16.
 */
inline fun <R> Scanner.fold(initial: R, operation: (R, String) -> R): R {
    var accumulator = initial
    for (element in this) accumulator = operation(accumulator, element)
    this.close()
    return accumulator
}

fun String.scanner(): Scanner = Scanner(this)

fun String.scanner(delimiter: String): Scanner = Scanner(this).useDelimiter(delimiter)

fun Scanner.toIntList(): List<Int> {
    val list = ArrayList<Int>()
    forEach { list.add(it.toInt()) }
    return list
}