package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import resources.Base;

import java.io.IOException;

public class Hooks extends Base
{

    @Before
    public void BeforeSteps() throws IOException {
        driver=browserInvocation();
        driver.get(prop.getProperty("URL"));
        driver.manage().window().maximize();
    }
    @After
    public void AfterSteps()
    {
//        driver.quit();
    }
}
