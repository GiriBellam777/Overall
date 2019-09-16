package UserInfo;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty"},monochrome=true,
					features= {"D:\\Users\\sthunga\\Desktop\\185930_Thunga_Saikumar\\UserInformation\\src\\test\\resources\\UserInformation\\UserInfo.feature"},
					glue= {"UserInfo"})
public class UserRunner {

}
