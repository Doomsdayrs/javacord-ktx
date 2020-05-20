package com.github.doomsdayrs.lib.javacordktx

import org.javacord.api.entity.Icon
import org.javacord.api.entity.message.embed.EmbedBuilder
import java.awt.Color
import java.awt.image.BufferedImage
import java.io.File

/**
 * DSL way to use [EmbedBuilder.setTitle]
 * Throws exception on attempts to access value
 */
@get:Throws(Exception::class)
var EmbedBuilder.title: String
	get() = throw Exception("Stud")
	set(value) {
		setTitle(value)
	}

/**
 * DSL way to use [EmbedBuilder.setFooter]
 * Throws exception on attempts to access value
 */
var EmbedBuilder.footer: String
	get() = throw Exception("Stud")
	set(value) {
		setTitle(value)
	}

/**
 * DSL way to use [EmbedBuilder.setDescription]
 * Throws exception on attempts to access value
 */
var EmbedBuilder.description: String
	get() = throw Exception("Stud")
	set(value) {
		setDescription(value)
	}

/**
 * DSL way to use [EmbedBuilder.setColor]
 * Throws exception on attempts to access value
 */
var EmbedBuilder.color: Color
	get() = throw Exception("Stud")
	set(value) {
		setColor(value)
	}

/**
 * DSL way to use [EmbedBuilder.setImage]
 * Throws exception on attempts to access value
 */
var EmbedBuilder.imageURL: String
	get() = throw Exception("Stud")
	set(value) {
		setImage(value)
	}

/**
 * DSL way to use [EmbedBuilder.setImage]
 * Throws exception on attempts to access value
 */
var EmbedBuilder.imageIcon: Icon
	get() = throw Exception("Stud")
	set(value) {
		setImage(value)
	}

/**
 * DSL way to use [EmbedBuilder.setImage]
 * Throws exception on attempts to access value
 */
var EmbedBuilder.imageFile: File
	get() = throw Exception("Stud")
	set(value) {
		setImage(value)
	}

/**
 * DSL way to use [EmbedBuilder.setImage]
 * Throws exception on attempts to access value
 */
var EmbedBuilder.imageBuffered: BufferedImage
	get() = throw Exception("Stud")
	set(value) {
		setImage(value)
	}

/**
 * DSL on the current embed
 */
inline fun EmbedBuilder.builder(action: EmbedBuilder.() -> Unit): EmbedBuilder {
	this.action()
	return this
}

/**
 * DSL on a cloned embed
 */
inline fun EmbedBuilder.copyBuilder(action: EmbedBuilder.() -> Unit): EmbedBuilder {
	val embed = this
	embed.builder(action)
	return embed
}

/**
 * DSL to build an embed
 */
inline fun embedBuilder(action: EmbedBuilder.() -> Unit): EmbedBuilder = EmbedBuilder().also(action)