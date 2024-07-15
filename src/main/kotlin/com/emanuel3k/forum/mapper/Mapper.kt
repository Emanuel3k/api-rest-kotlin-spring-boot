package com.emanuel3k.forum.mapper

interface Mapper<T, U> {

    fun map(t: T): U
}
