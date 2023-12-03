package com.example.fliccsy

sealed interface UserInfoEvent{
    data class onFullNameChanged(val value: String): UserInfoEvent
    data class onPasswordChanged(val value: String): UserInfoEvent
    data class OnEmailChanged(val value: String): UserInfoEvent
}