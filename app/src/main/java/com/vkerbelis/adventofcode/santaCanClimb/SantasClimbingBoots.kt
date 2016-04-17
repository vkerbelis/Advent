package com.vkerbelis.adventofcode.santaCanClimb

import com.vkerbelis.adventofcode.OH_DEAR
import com.vkerbelis.adventofcode.SantasSlipUp

/**
 * Advent of Code Day 1: http://adventofcode.com/day/1
 *
 * Santa is trying to deliver presents in a large apartment building, but he can't find the
 * right floor - the directions he got are a little confusing. He starts on the ground floor
 * (floor 0) and then follows the instructions one character at a time.
 *
 * An opening parenthesis, (, means he should go up one floor, and a closing parenthesis, ),
 * means he should go down one floor.
 *
 * The apartment building is very tall, and the basement is very deep; he will never find
 * the top or bottom floors.
 *
 * For example:
 *
 * - (()) and ()() both result in floor 0.
 * - ((( and (()(()( both result in floor 3.
 * - ))((((( also results in floor 3.
 * - ()) and ))( both result in floor -1 (the first basement level).
 * - ))) and )())()) both result in floor -3.
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
