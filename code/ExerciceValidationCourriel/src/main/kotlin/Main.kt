package org.ye

import jakarta.validation.constraints.Email
import org.hibernate.validator.internal.constraintvalidators.bv.EmailValidator


fun main(args: Array<String>) {
    var validator = EmailValidator()
    for(courriel in args){
        var email = courriel
        if (validator.isValid(email,null))
        {
            println("Ok : $email")
        }
        else
        {
            println("Ko : $email")
        }
    }
}
