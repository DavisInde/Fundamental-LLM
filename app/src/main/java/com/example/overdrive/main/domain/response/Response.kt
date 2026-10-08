package com.example.overdrive.main.domain.response

sealed interface Response<out data> {

    data class Success<out data>(
        val result: data
    ): Response<data>

    data class Failure(val error: Throwable): Response<Nothing>
}