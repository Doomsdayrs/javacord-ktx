package com.github.doomsdayrs.lib.javacordktx

import com.github.doomsdayrs.lib.javacordktx.embedBuilder.*
import java.awt.Color

/**
 * javacord-ktx
 * 21 / 05 / 2020
 *
 * @author github.com/doomsdayrs
 */

fun embedDSLTest() {
	embedBuilder {
		title = "Blah"
		color = Color.RED
		description = "brr"
		footer = "no u"
		author = "me"
		imageURL = "image"
		thumbnailURL = "bleh"
		field { "Field1" to "Not inline" }
		field { "Field2" to "inline" }
	}
}