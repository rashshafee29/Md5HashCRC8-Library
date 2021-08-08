package com.example.md5hash_crc8

import java.security.MessageDigest

object Md5HashCRC8 {

    private fun ByteArray.toHex(): String {
        return joinToString("") { "%02x".format(it) }
    }

    fun getUniqueId(str: String): String {
        //hashing md5
        val bytes = MessageDigest.getInstance("MD5").digest(str.toByteArray())
        var hash = bytes.toHex()
        hash = hash.substring(0, 15)

        //CRC8
        val crc = CRC8()
        val checksum = crc.getCheckSum(hash.toByteArray())
        val hexString = checksum.toString(16)
        return hash.substring(0, 4) + '-' + hash.substring(4, 8) + '-' + hash.substring(8, 12) + '-' + hash.substring(12, 15) + hexString.substring(0, 1);
    }
}