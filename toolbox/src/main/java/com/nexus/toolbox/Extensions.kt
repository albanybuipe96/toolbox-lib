package com.nexus.toolbox

import java.math.RoundingMode
import java.text.DecimalFormat
import java.text.SimpleDateFormat
import java.util.*

fun Long.fromUnix(): String {
    val sdf = SimpleDateFormat("dd/MM/yy HH:mm", Locale.getDefault())
    sdf.timeZone = TimeZone.getTimeZone("GMT-8:00")
    val netDate = Date(this * 1000)
    return sdf.format(netDate)
}

fun Double.round(): String {
    val df = DecimalFormat("#.#")
    df.roundingMode = RoundingMode.DOWN
    return df.format(this)
}