package com.kotlin.main

import java.lang.StringBuilder

public class Order constructor(applecount: Int = 0, orangecount: Int = 0) {
    var apples: Int = applecount
    var oranges: Int = orangecount

    override fun toString(): String {
        return "${this.apples} apples and ${this.oranges} oranges"
    }

    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Order || other.apples != this.apples || other.oranges != this.oranges) {
            return false
        }
        return true
    }
}