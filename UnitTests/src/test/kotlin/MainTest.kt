import org.junit.jupiter.api.*
import kotlin.test.fail

class MainTest {

    @Test
    @DisplayName("Test method verifySimilarChars")
    fun testCountXO() {
        Assertions.assertTrue(verifySimilarChars("xxoo"))
    }

    @Test
    @DisplayName("Test method verifySimilarChars using AssertAll")
    fun testCountXOUsingAssertAll() {
        Assertions.assertAll(
            { Assertions.assertTrue(verifySimilarChars("xxoo")) },
            { Assertions.assertTrue(verifySimilarChars("xooxx")) },
        )
    }

    @Test
    @Disabled
    @DisplayName("Test method verifySimilarChars using AssertAll")
    fun testCountXOUsingAssertAllDisabled() {
        Assertions.assertAll(
            { Assertions.assertTrue(verifySimilarChars("xxoo")) },
            { Assertions.assertTrue(verifySimilarChars("xooxx")) },
        )
    }

    @Test
    @DisplayName("Test not finishe yet")
    fun testNotFinishedYer() {
        fail("Not finished yet")
    }
    
    @Test
    @DisplayName("Test method verifySimilarChar assumeTrue")
    fun testCountXOUsingAssumeTrue() {
        Assumptions.assumeTrue(verifySimilarChars("xxoo"))

        println("Only executed if the assumption is true")
    }

    @Test
    @DisplayName("Test method verifySimilarChar when string is empty or null")
    fun testCountXOWhenStringIsEmptyOrNull() {
        Assertions.assertAll(
            { Assertions.assertTrue(verifySimilarChars("")) },
            { assertThrows<NullPointerException> { (verifySimilarChars(null)) } },
        )
    }
}