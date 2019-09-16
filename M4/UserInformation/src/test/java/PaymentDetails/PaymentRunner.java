package PaymentDetails;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},monochrome=true,
				features= {"D:\\Users\\sthunga\\Desktop\\185930_Thunga_Saikumar\\UserInformation\\src\\test\\resources\\PaymentDetails\\PaymentDetails.feature"},
				glue= {"PaymentDetails"})
public class PaymentRunner {

}
