package com.example.techtask1.data.mapper

interface Mapper<From, To> {
    fun map(from: From): To
}