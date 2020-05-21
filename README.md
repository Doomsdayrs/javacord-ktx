# javacord-ktx [![Release](https://jitpack.io/v/doomsdayrs/javacord-ktx.svg)](https://jitpack.io/#doomsdayrs/javacord-ktx)

Compilation of kotlin extensions for javacord

# Use Cases

## EmbedBuilder DSL
There are lots of variables you can use, but that takes time so just check this out. The DSL does __not__ cover any functions that require more then 2 parameters currently. So you can just call the functions inside the block 

```kotlin
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
```
This returns an Embed with all those values
