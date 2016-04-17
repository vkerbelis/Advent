package com.vkerbelis.adventofcode.santaCanClimb

import com.vkerbelis.adventofcode.OH_DEAR
import com.vkerbelis.adventofcode.SantasSlipUp

/**
 * --- Day 1: Not Quite Lisp --- http://adventofcode.com/day/1
 *
 * @author Vidmantas Kerbelis (vkerbelis@yahoo.com) on 2016-04-09.
 */
class SantasClimbingBoots {

    private val SANTAS_GOING_UP = '('
    val santasJourney = SantasChallenge_TheStairs().input

    fun makeSantaMoveToTheRightFloor(): Int {
        val (santaBravingOn, santaTrippingDown) = santasJourney.partition { it == SANTAS_GOING_UP }
        return santaBravingOn.length - santaTrippingDown.length
    }

    fun findWhenSantaFirstCameToTheBasement(): Int {
        var santasCurrentFloor: Int = 0
        for (santasStep in 0..santasJourney.length - 1) {
            if (santasJourney[santasStep] == SANTAS_GOING_UP) {
                santasCurrentFloor++
            } else {
                santasCurrentFloor--
            }
            if (santasCurrentFloor < 0) {
                return santasStep + 1 // +1, because Santa did take the first step
            }
        }
        throw SantasSlipUp(OH_DEAR, "Santa didn't reach the basement. :(")
    }

}
