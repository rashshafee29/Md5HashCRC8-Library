package com.example.md5hash_crc8

class CRC8 {
    private var table = IntArray(256)
    private var poly = 7
    init {
        generateTable(poly)
    }

    fun getCheckSum(data: ByteArray): Int {
        var chksum = 0
        for(i in data.indices) {
            chksum = table[(chksum xor data[i].toInt()) % 256]
        }
        return chksum
    }

    private fun generateTable(poly: Int) {
        for(t in 0 until 256) {
            var currVal = t
            for(n in 0 until 8) {
                val bit = 0 != (128 and currVal)
                currVal = if(bit) {
                    (currVal shl 1) xor poly
                } else {
                    currVal shl 1
                }
            }
            table[t] = currVal % 256
        }
    }
}