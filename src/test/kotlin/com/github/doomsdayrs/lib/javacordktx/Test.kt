package com.github.doomsdayrs.lib.javacordktx

import com.github.doomsdayrs.lib.javacordktx.embedBuilder.*
import kotlinx.coroutines.future.await
import org.javacord.api.entity.message.Messageable
import java.awt.Color
import java.util.concurrent.CompletableFuture

/**
 * javacord-ktx
 * 21 / 05 / 2020
 *
 * @author github.com/doomsdayrs
 */

suspend fun embedDSLTest() {
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

	val messageable = object : Messageable {
	}

	messageable.sendEmbed {
		title = "Blah"
		field { "" to "" }
		CompletableFuture<String>().await()

	}

}