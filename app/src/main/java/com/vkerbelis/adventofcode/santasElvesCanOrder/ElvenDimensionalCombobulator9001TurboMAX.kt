package com.vkerbelis.adventofcode.santasElvesCanOrder

import com.vkerbelis.adventofcode.fold
import com.vkerbelis.adventofcode.scanner
import com.vkerbelis.adventofcode.toIntList

/**
 * --- Day 2: I Was Told There Would Be No Math --- http://adventofcode.com/day/2
 *
 * @author Vidmantas Kerbelis (vkerbelis@yahoo.com) on 2016-04-16.
 */
class ElvenDimensionalCombobulator9001TurboMAX {

    fun combobulateSomething(something: String): Int = decombobulateCombubulations(something,
            { combobulateSomethingInner(it) })

    fun combobulateOther(other: String): Int = decombobulateCombubulations(other,
            { combobulateOtherInner(it) })

    private fun combobulateSomethingInner(something: String): Int {
        val (length, width, height) = something.scanner("x").toIntList()
        val array = arrayOf(length * width, width * height, height * length)
        return array.min()!! + 2 * array.fold(0, { combo, dimension -> dimension + combo })
    }

    private fun combobulateOtherInner(other: String): Int {
        val list = other.scanner("x").toIntList()
        val (length, width, height) = list
        val (smallestSide, secondSmallestSide) = list.sorted()
        return length * width * height + 2 * (smallestSide + secondSmallestSide)
    }

    fun decombobulateCombubulations(something: String, combobulation: (String) -> Int): Int {
        return something.scanner().fold(0, { combo, combobulatedOther ->
            combobulation(combobulatedOther) + combo
        })
    }
}

