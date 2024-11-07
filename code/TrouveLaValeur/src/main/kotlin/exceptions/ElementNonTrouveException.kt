package org.ye.exceptions

class ElementNonTrouveException: Exception() {
    override val message: String?
        get() = "L'élément n'existe pas dans le tableau"
}