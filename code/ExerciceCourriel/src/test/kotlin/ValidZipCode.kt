package org.ye

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class MainTest {

    @Test
    fun ZipCodeValid1Espace() {
        assertTrue(IsValidZipCode("K1A 0B1"))
    }
    @Test
    fun ZipCodeValid2Espace() {
        assertTrue(IsValidZipCode("K1A  0B1"))
    }
    @Test
    fun ZipCodeValid0Espace() {
        assertTrue(IsValidZipCode("K1A0B1"))
    }
    @Test
    fun ZipCodeValidTiret() {
        assertTrue(IsValidZipCode("K1A-0B1"))
    }
    @Test
    fun ZipCodeValidCamelCase() {
        assertTrue(IsValidZipCode("k1A 0b1"))
    }
    @Test
    fun ZipCodeInvalid3Espace() {
        assertFalse(IsValidZipCode("H1Y   1E1"))
    }
    @Test
    fun ZipCodeInvalidUnderscore() {
        assertFalse(IsValidZipCode("H1Y_1E1"))
    }
    @Test
    fun ZipCodeInvalidPosition() {
        assertFalse(IsValidZipCode("h3Y 1TO"))
    }

}