package Pages;

import Base.BaseStepMethod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class UserDashboardPage extends BaseStepMethod {
    private static final Logger LOGGER= LogManager.getLogger(UserDashboardPage.class);

    private static final By TXTUSERDPAGEUSERNAME =By.xpath("((//a[@title='Hesabım'])//span)[2]");

    public void verifyValidLogin(String userName){
        //getTextElement(TXTUSERDPAGEUSERNAME);
        ContainsText(TXTUSERDPAGEUSERNAME,userName);
        LOGGER.info("User text is verified. "+userName);
    }
}
