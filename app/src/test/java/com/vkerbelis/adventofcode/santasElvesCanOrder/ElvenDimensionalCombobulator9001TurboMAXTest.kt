package com.vkerbelis.adventofcode.santasElvesCanOrder

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

/**
 * @author Vidmantas Kerbelis (vkerbelis@yahoo.com) on 2016-04-16.
 */
class ElvenDimensionalCombobulator9001TurboMAXTest {

    companion object {
        private val EXPECTED_FEET_OF_WRAPPING_PAPER = 1586300
        private val EXPECTED_FEET_OF_RIBBON = 3737498
    }

    private lateinit var dimensionalCombobulator: ElvenDimensionalCombobulator9001TurboMAX

    @Before
    fun setUp() {
        dimensionalCombobulator = ElvenDimensionalCombobulator9001TurboMAX()
    }

    @Test
    fun testIfShowingLoadsOfPresentsAtTheCombobulatorReturnsSomeNumbers() {
        val allDemUnwrappedPresents = SantasChallenge_TheWrapping().input
        assertEquals("Just try showing some presents at it and see what happens",
                EXPECTED_FEET_OF_WRAPPING_PAPER,
                dimensionalCombobulator.combobulateSomething(allDemUnwrappedPresents))
    }

    @Test
    fun testIfShowingLoadsOfRibbonsAtTheCombobulatorReturnsSomeNumbers() {
        val allDemRibbons = SantasChallenge_TheWrapping().input
        assertEquals("Just try showing some ribbons at it and see what happens",
                EXPECTED_FEET_OF_RIBBON,
                dimensionalCombobulator.combobulateOther(allDemRibbons))
    }

    @Test
    fun testCombobulatorAddsDimensionsCorrectly() {
        assertEquals("Inputting some random numbers didn't work",
                58, dimensionalCombobulator.combobulateSomething("2x3x4"))
    }

    @Test
    fun testCombobulatorAddsDimensionsCorrectly2() {
        assertEquals("Inputting some random numbers didn't work",
                43, dimensionalCombobulator.combobulateSomething("1x1x10"))
    }

    @Test
    fun testCombobulatorCombubulatesOtherDimensions() {
        assertEquals("Inputting some random otherworldly dimensions didn't work",
                34, dimensionalCombobulator.combobulateOther("2x3x4"))
    }

    @Test
    fun testCombobulatorCombubulatesOtherDimensions2() {
        assertEquals("Inputting some random otherworldly dimensions didn't work",
                14, dimensionalCombobulator.combobulateOther("1x1x10"))
    }
}