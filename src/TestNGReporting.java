import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGReporting {

			@Test
			public void login()
			{
				System.out.println("Login");
			}
			
			@Test
			public void logout()
			{
				Assert.assertEquals("test","test1");
			}

}

