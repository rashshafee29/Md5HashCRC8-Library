# Md5HashCRC8-Library [![](https://jitpack.io/v/rashshafee29/Md5HashCRC8-Library.svg)](https://jitpack.io/#rashshafee29/Md5HashCRC8-Library)

A simple library to get unique id for any string using md5 hashing and crc8 checksum

## How to include in you project?

Step 1. Add the JitPack repository to your build file for gradle
Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.rashshafee29:Md5HashCRC8-Library:VERSION'
	}


## How to use?

In kotlin

	var md5HashCrc8 = Md5HashCRC8()
	var uniqueId = md5HashCrc8.getUniqueId("cheers")
