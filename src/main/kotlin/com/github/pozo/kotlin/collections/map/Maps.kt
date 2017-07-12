package com.github.pozo.kotlin.collections.map

fun main(args: Array<String>) {
    lazyMap()
}

fun mapOf_withDefault_getOrElse() {
    val map = mapOf("aaa" to 32, "bbb" to 44)//.withDefault { "asd" to 2 }

    val value = map.getOrElse("ccc", foo("a"))

    println(value)
}

fun mapOf_withDefault_getOrElse_WithType() {
    val map = mapOf("aaa" to 32, "bbb" to 44)//.withDefault { "asd" to 2 }

    // invalid
    // val value: Int = map.getOrElse("ccc", foo("a"))
    val value: Int = map.getOrElse("ccc", { 2 })

    println(value)
}

fun foo(x: String): () -> String = { x + "!" }

fun mapOf_withDefault_OnEach() {
    val map = mapOf("aaa" to 32, "bbb" to 44).withDefault { "asd" to 2 }

    map.onEach { println(it) }
}

fun mapOf_withDefault() {
    val map = mapOf("aaa" to 32, "bbb" to 44).withDefault { "asd" to 2 }

    val value = map.getValue("a")

    println(value)
}

fun mapOf_withDefault_ExpectedAsd_ButReturnNull() {
    val map = mapOf("aaa" to 32, "bbb" to 44).withDefault { "asd" to 2 }

    val value = map["a"]

    println(value)
}

fun mapOf_getOrDefault() {
    val map = mapOf("aaa" to 32, "bbb" to 44)

    val value = map.getOrDefault("asd", 23)

    println(value)
}

fun mutableMapOf() {
    val map = mutableMapOf("aaa" to 32, "bbb" to 44)

    val value = map.getOrPut("ccc", { 23 })

    println(value)
}

fun lazyMap() {
    val map = mutableMapOf("aaa" to mutableListOf(32))

    map.putIfAbsent("aaa", mutableListOf(2))?.add(2)

    println(map)
}