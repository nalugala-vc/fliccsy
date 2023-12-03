package com.example.fliccsy

object UserInputValidator {

    fun validateContact(user: User): ValidationResult{
        var result = ValidationResult()

        if (user.fullName.isBlank()){
            result = result.copy(fullNameError = "The full name cannot be empty")
        }
        if (user.password.isBlank()){
            result = result.copy(passwordError = "The password cannot be empty")
        }
        val emailRegex = Regex("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}\$")
        if(!emailRegex.matches(user.email)) {
            result = result.copy(emailError = "This is not a valid email.")
        }


        return result

    }
    data class ValidationResult(
        val fullNameError: String? = null,
        val passwordError: String? = null,
        val emailError: String? = null,
    )
}