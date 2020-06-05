package resetpassword;

import org.testng.annotations.Test;
import pages.EmailReset;
import pages.ForgotPassword;
import test.BaseTests;

import static org.testng.Assert.assertEquals;
@Test
public class ResetPasswordTest extends BaseTests {
    public void testSuccessfulRetrievingPassword(){
       ForgotPassword forgotPassword = homePage.clickForgotPassword();
       forgotPassword.clickEmailInput("jdoe@hotmail.com");
      EmailReset emailReset = forgotPassword.clickRetrievePasswordButton();
        assertEquals(emailReset.getEmailResettext(),"Your e-mail's been sent!","Password reset fail");
    }
}
