@file:Suppress("unused")

package com.github.doomsdayrs.lib.javacordktx.embedBuilder

import org.javacord.api.entity.Icon
import org.javacord.api.entity.message.MessageAuthor
import org.javacord.api.entity.message.embed.EmbedBuilder
import org.javacord.api.entity.user.User
import java.awt.Color
import java.awt.image.BufferedImage
import java.io.File
import java.io.InputStream
import java.time.Instant

/* 
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 * javacord-ktx
 * 20 / 05 / 2020
 */

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
 * DSL way to use [EmbedBuilder.setDescription]
 * Throws exception on attempts to access value
 */
var EmbedBuilder.description: String
	get() = throw Exception("Stud")
	set(value) {
		setDescription(value)
	}

/**
 * DSL way to use [EmbedBuilder.setThumbnail]
 * Throws exception on attempts to access value
 */
var EmbedBuilder.url: String
	get() = throw Exception("Stud")
	set(value) {
		setUrl(value)
	}

/**
 * DSL way to use [EmbedBuilder.setThumbnail]
 * Throws exception on attempts to access value
 */
var EmbedBuilder.timeStamp: Instant
	get() = throw Exception("Stud")
	set(value) {
		setTimestamp(value)
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
 * DSL way to use [EmbedBuilder.setFooter]
 * Throws exception on attempts to access value
 */
var EmbedBuilder.footer: String
	get() = throw Exception("Stud")
	set(value) {
		setFooter(value)
	}

/**
 * DSL way to use [EmbedBuilder.setFooter]
 * Throws exception on attempts to access value
 */
var EmbedBuilder.footerWithIconURL: Pair<String, String>
	get() = throw Exception("Stud")
	set(value) {
		setFooter(value.first, value.second)
	}

/**
 * DSL way to use [EmbedBuilder.setFooter]
 * Throws exception on attempts to access value
 */
var EmbedBuilder.footerWithIcon: Pair<String, Icon>
	get() = throw Exception("Stud")
	set(value) {
		setFooter(value.first, value.second)
	}

/**
 * DSL way to use [EmbedBuilder.setFooter]
 * Throws exception on attempts to access value
 */
var EmbedBuilder.footerWithIconFile: Pair<String, File>
	get() = throw Exception("Stud")
	set(value) {
		setFooter(value.first, value.second)
	}

/**
 * DSL way to use [EmbedBuilder.setFooter]
 * Throws exception on attempts to access value
 */
var EmbedBuilder.footerWithIconInput: Pair<String, InputStream>
	get() = throw Exception("Stud")
	set(value) {
		setFooter(value.first, value.second)
	}

/**
 * DSL way to use [EmbedBuilder.setFooter]
 * Throws exception on attempts to access value
 */
var EmbedBuilder.footerWithIconBytes: Pair<String, ByteArray>
	get() = throw Exception("Stud")
	set(value) {
		setFooter(value.first, value.second)
	}

/**
 * DSL way to use [EmbedBuilder.setFooter]
 * Throws exception on attempts to access value
 */
var EmbedBuilder.footerWithIconBuffered: Pair<String, BufferedImage>
	get() = throw Exception("Stud")
	set(value) {
		setFooter(value.first, value.second)
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
var EmbedBuilder.imageInput: InputStream
	get() = throw Exception("Stud")
	set(value) {
		setImage(value)
	}

/**
 * DSL way to use [EmbedBuilder.setImage]
 * Throws exception on attempts to access value
 */
var EmbedBuilder.imageInputTyped: Pair<InputStream, String>
	get() = throw Exception("Stud")
	set(value) {
		setImage(value.first, value.second)
	}

/**
 * DSL way to use [EmbedBuilder.setImage]
 * Throws exception on attempts to access value
 */
var EmbedBuilder.imageBytes: ByteArray
	get() = throw Exception("Stud")
	set(value) {
		setImage(value)
	}

/**
 * DSL way to use [EmbedBuilder.setImage]
 * Throws exception on attempts to access value
 */
var EmbedBuilder.imageBytesType: Pair<ByteArray, String>
	get() = throw Exception("Stud")
	set(value) {
		setImage(value.first, value.second)
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
 * DSL way to use [EmbedBuilder.setImage]
 * Throws exception on attempts to access value
 */
var EmbedBuilder.imageBufferedType: Pair<BufferedImage, String>
	get() = throw Exception("Stud")
	set(value) {
		setImage(value.first, value.second)
	}

/**
 * DSL way to use [EmbedBuilder.setAuthor]
 * Throws exception on attempts to access value
 */
var EmbedBuilder.authorByMessage: MessageAuthor
	get() = throw Exception("Stud")
	set(value) {
		setAuthor(value)
	}


/**
 * DSL way to use [EmbedBuilder.setAuthor]
 * Throws exception on attempts to access value
 */
var EmbedBuilder.authorByUser: User
	get() = throw Exception("Stud")
	set(value) {
		setAuthor(value)
	}


/**
 * DSL way to use [EmbedBuilder.setAuthor]
 * Throws exception on attempts to access value
 */
var EmbedBuilder.author: String
	get() = throw Exception("Stud")
	set(value) {
		setAuthor(value)
	}


/**
 * DSL way to use [EmbedBuilder.setThumbnail]
 * Throws exception on attempts to access value
 */
var EmbedBuilder.thumbnailURL: String
	get() = throw Exception("Stud")
	set(value) {
		setThumbnail(value)
	}

/**
 * DSL way to use [EmbedBuilder.setThumbnail]
 * Throws exception on attempts to access value
 */
var EmbedBuilder.thumbnailIcon: Icon
	get() = throw Exception("Stud")
	set(value) {
		setThumbnail(value)
	}

/**
 * DSL way to use [EmbedBuilder.setThumbnail]
 * Throws exception on attempts to access value
 */
var EmbedBuilder.thumbnailFile: File
	get() = throw Exception("Stud")
	set(value) {
		setThumbnail(value)
	}

/**
 * DSL way to use [EmbedBuilder.setThumbnail]
 * Throws exception on attempts to access value
 */
var EmbedBuilder.thumbnailInput: InputStream
	get() = throw Exception("Stud")
	set(value) {
		setThumbnail(value)
	}

/**
 * DSL way to use [EmbedBuilder.setThumbnail]
 * Throws exception on attempts to access value
 */
var EmbedBuilder.thumbnailInputTyped: Pair<InputStream, String>
	get() = throw Exception("Stud")
	set(value) {
		setThumbnail(value.first, value.second)
	}

/**
 * DSL way to use [EmbedBuilder.setThumbnail]
 * Throws exception on attempts to access value
 */
var EmbedBuilder.thumbnailBytes: ByteArray
	get() = throw Exception("Stud")
	set(value) {
		setThumbnail(value)
	}

/**
 * DSL way to use [EmbedBuilder.setThumbnail]
 * Throws exception on attempts to access value
 */
var EmbedBuilder.thumbnailBytesType: Pair<ByteArray, String>
	get() = throw Exception("Stud")
	set(value) {
		setThumbnail(value.first, value.second)
	}

/**
 * DSL way to use [EmbedBuilder.setThumbnail]
 * Throws exception on attempts to access value
 */
var EmbedBuilder.thumbnailBuffered: BufferedImage
	get() = throw Exception("Stud")
	set(value) {
		setThumbnail(value)
	}

/**
 * DSL way to use [EmbedBuilder.setThumbnail]
 * Throws exception on attempts to access value
 */
var EmbedBuilder.thumbnailBufferedType: Pair<BufferedImage, String>
	get() = throw Exception("Stud")
	set(value) {
		setThumbnail(value.first, value.second)
	}