package com.vkerbelis.adventofcode.santaCanClimb

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

/**
 * Tests Santas climbing boots
 */
class SantasClimbingBootsTest {

    private val EXPECTED_SANTA_FLOOR = 280
    private val EXPECTED_FIRST_BASEMENT_POSITION = 1797
    private lateinit var santasBoots: SantasClimbingBoots

    @Before
    fun setUp() {
        santasBoots = SantasClimbingBoots()
    }

    @Test
    fun testIfSantasBootsCanCarrySantaUpOrDownSomeStairs() {
        assertEquals("Let Santa climb to the expected number, please. :)",
                EXPECTED_SANTA_FLOOR, santasBoots.makeSantaMoveToTheRightFloor())
    }

    @Test
    fun testIfSantasBootsCanTrackWhatHeWasDoing() {
        assertEquals("Trust in the boots and let them say when he first stepped into the basement",
                EXPECTED_FIRST_BASEMENT_POSITION, santasBoots.findWhenSantaFirstCameToTheBasement())
    }
}