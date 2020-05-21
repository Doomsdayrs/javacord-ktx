package com.github.doomsdayrs.lib.javacordktx.embedBuilder

import org.javacord.api.entity.message.embed.EmbedBuilder

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
 * DSL on the current embed
 */
@DslMarker
annotation class EmbedBuilderDSL

@EmbedBuilderDSL
inline fun EmbedBuilder.builder(action: EmbedBuilder.() -> Unit): EmbedBuilder = this.also(action)

/**
 * DSL on a cloned embed
 */
@EmbedBuilderDSL
inline fun EmbedBuilder.copyBuilder(action: EmbedBuilder.() -> Unit): EmbedBuilder =
		let { val i = it;i.action();i }

/**
 * @param inline Whether the field should be inline or not.
 * @param value [Pair] of ([String] name) TO ([String] value)
 */
@EmbedBuilderDSL
inline fun EmbedBuilder.field(
		inline: Boolean = false,
		value: EmbedBuilder.() -> Pair<@ParameterName("name") String, @ParameterName("value") String>
): EmbedBuilder =
		value().let { addField(it.first, it.second, inline) }


/**
 * DSL to build an embed
 */
@EmbedBuilderDSL
inline fun embedBuilder(action: EmbedBuilder.() -> Unit): EmbedBuilder = EmbedBuilder().also(action)