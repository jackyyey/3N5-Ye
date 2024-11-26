import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.ye.isValidEmail

class TestEmail {

    @Test
    fun `test valid emails`() {
        assertTrue(isValidEmail("bob@smith.org"))
        assertTrue(isValidEmail("a.b.c@pipo.com"))
        assertTrue(isValidEmail("Rodgere.Federer@tennis.info"))
    }

    @Test
    fun `test invalid emails`() {
        assertFalse(isValidEmail("bob@smith"))
        assertFalse(isValidEmail("a..b@popi.org"))
        assertFalse(isValidEmail("john.doe@.com"))
        assertFalse(isValidEmail("john.doe@plop.c"))
    }
}