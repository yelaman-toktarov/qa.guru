package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPageObjectsTests extends TestBase {

    @Test
    void successfulRegistrationTest() {
        String userName = "Alex";

        registrationPage.openPage()
                .setFirstName(userName)
                .setLastName("Egorov")
                .setEmail("alex@egorov.com")
                .setGender("Other")
                .setPhone("1234567890")
                .setBirthDate("30", "July", "2008")
                .setSubjects("Math", "Sports")
                .uPloadFile("img/1.png")
                .setCurrentAddress("Some address 1")
                .setCityAndState("NCR", "Delhi")
                .submitTheForm();

        registrationPage.verifyResultsModalAppears()
                .verifyResult("Student Name", userName + " Egorov")
                .verifyResult("Student Email", "alex@egorov.com")
                .verifyResult("Gender", "Other")
                .verifyResult("Mobile", "1234567890")
                .verifyResult("Date of Birth", "30 July,2008");

    }
}
