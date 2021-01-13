package com.github.doomsdayrs.lib.javacordktx.embedBuilder

import kotlinx.coroutines.future.await
import org.javacord.api.entity.message.Message
import org.javacord.api.entity.message.Messageable
import org.javacord.api.entity.message.embed.EmbedBuilder


/**
 * Convenience function that lets you build an embed without specifying one as a parameter
 * This is suspended to conform to proper kotlin async using [await]
 *
 * @author Doomsdayrs
 * @see await
 * @param builder Builder for the embed
 * @return Message after [await] completes
 */
suspend inline fun Messageable.sendEmbed(builder: EmbedBuilder.() -> Unit): Message =
	sendMessage(embedBuilder(builder)).await()
