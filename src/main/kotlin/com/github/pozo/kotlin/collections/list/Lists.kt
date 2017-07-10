package com.github.pozo.kotlin.collections.list

fun main(args: Array<String>) {
    listOf_withIndex_onEach_filter()
}

fun listOf_withIndex_forEach() {
    val list = mutableListOf("aaa", "bbb").withIndex()
    list.forEach({ v ->
        println(v)
    })/*.filter {
        entry ->
        entry.value.length < 3
    }*/
}

fun listOf_withIndex_onEach_filter() {
    val list = mutableListOf("aaa", "bbb").withIndex()

    list.map { it ->
        it.value.substring(2)
    }.filter { it ->
        it.startsWith("a")
    }.forEach({ it ->
        println(it)
    })
}
