import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assumptions
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ConciergeTests {

    @Test
    fun handleWelcomeParty_WhenTheAgeIsLessThan18_ThenReturnBadNotice() {
        // Arrange
        val concierge = Concierge()

        // Act
        val result = concierge.handleWelcomeParty(17, "commom", "XT1234")

        Assertions.assertTrue(result == "You are not allowed to enter!")
    }

    @Test
    fun handleWelcomeParty_WhenThePassIsInvalid_ThenReturnBadNotice() {
        // Arrange
        val concierge = Concierge()

        // Act
        val result = concierge.handleWelcomeParty(18, "cdscdscds", "XT1234")

        Assertions.assertTrue(result == "You are not allowed to enter!")
    }

    @Test
    fun handleWelcomeParty_WhenTheCodeIsInvalid_ThenReturnBadNotice() {
        // Arrange
        val concierge = Concierge()

        // Act
        val result = concierge.handleWelcomeParty(18, "commom", "XZ1234")

        Assertions.assertTrue(result == "You are not allowed to enter!")
    }

    @Test
    fun handleWelcomeParty_WhenTheParametersAreValid_ThenReturnGoodNotice() {
        // Arrange
        val concierge = Concierge()

        // Act
        val result = concierge.handleWelcomeParty(18, "commom", "XT1234")

        Assertions.assertTrue(result == "Welcome to the party!")
    }

    @Test
    fun handleWelcomeParty_WhenPassIsDifferentFromCode_ThenReturnBadNotice() {
        // Arrange
        val concierge = Concierge()

        // Act
        val result = concierge.handleWelcomeParty(18, "commom", "XL1234")

        Assertions.assertTrue(result == "You are not allowed to enter!")
    }
}
