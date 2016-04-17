package com.vkerbelis.adventofcode.santasElvesCanOrder

import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 * @author Vidmantas Kerbelis (vkerbelis@yahoo.com) on 2016-04-16.
 */
class ElvenDimensionalCombobulator5000TurboMAXTest {

    private val EXPECTED_FEET_OF_WRAPPING_PAPER = 1586300
    private lateinit var dimensionalCombobulator: ElvenDimensionalCombobulator5000TurboMAX

    @Before
    fun setUp() {
        dimensionalCombobulator = ElvenDimensionalCombobulator5000TurboMAX()
    }

    @Test
    fun testIfShowingLoadsOfPresentsAtTheCombobulatorReturnsSomeNumbers() {
        val allDemUnwrappedPresents = SantasChallenge_TheWrapping().input
        Assert.assertEquals("Just try showing some presents at it and see what happens",
                EXPECTED_FEET_OF_WRAPPING_PAPER,
                dimensionalCombobulator.combobulateSomething(allDemUnwrappedPresents))
    }

    @Test
    fun testCombobulatorAddsDimensionsCorrectly() {
        Assert.assertEquals("Inputting some random numbers didn't work",
                58, dimensionalCombobulator.combobulateSomething("2x3x4"))
    }

    @Test
    fun testCombobulatorAddsDimensionsCorrectly2() {
        Assert.assertEquals("Inputting some random numbers didn't work",
                43, dimensionalCombobulator.combobulateSomething("1x1x10"))
    }
}