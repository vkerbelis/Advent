package com.vkerbelis.adventofcode

val SLIP_UPS = arrayOf("Oops!", "Oh dear!", "My goodness!")
val OOPS = 0
val OH_DEAR = 1
val MY_GOODNESS = 2

/**
 * @author Vidmantas Kerbelis (vkerbelis@yahoo.com) on 2016-04-09.
 */
class SantasSlipUp : Exception {
    constructor(slipUp: Int, message: String) : super("${SLIP_UPS[slipUp]} $message")
}