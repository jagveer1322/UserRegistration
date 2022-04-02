import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
	@Test
	public void givenFirstName_WhenProper_ShouldReturn_True() {
		UserValidater userValidater = new UserValidater();
		boolean result = userValidater.validateFirstName("Jagveer");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenFirstName_WhenNotProper_ShouldReturn_False() {
		UserValidater userValidater = new UserValidater();
		boolean result = userValidater.validateFirstName("Ja");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenLastName_WhenProper_ShouldReturn_True() {
		UserValidater userValidater = new UserValidater();
		boolean result = userValidater.validateLastName("Singh");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenLastName_WhenNotProper_ShouldReturn_False() {
		UserValidater userValidater = new UserValidater();
		boolean result = userValidater.validateLastName("Pa");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenEmail_WhenProper_ShouldReturn_True() {
		UserValidater userValidater = new UserValidater();
		boolean result = userValidater.validateEmail("abc.xyz@bl.co.in");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenEmail_WhenNotProper_ShouldReturn_False() {
		UserValidater userValidater = new UserValidater();
		boolean result = userValidater.validateEmail("jagveer@.com");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenPhone_WhenProper_ShouldReturn_True() {
		UserValidater userValidater = new UserValidater();
		boolean result = userValidater.validatePhone("910000000000");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPhone_WhenNotProper_ShouldReturn_False() {
		UserValidater userValidater = new UserValidater();
		boolean result = userValidater.validatePhone("8858745475");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenPassword_WhenProper_ShouldReturn_True() {
		UserValidater userValidater = new UserValidater();
		boolean result = userValidater.validatePassword("abcdfdA@fg0");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPassword_WhenNotProper_ShouldReturn_False() {
		UserValidater userValidater = new UserValidater();
		boolean result = userValidater.validatePassword("adasdas0daS");
		Assert.assertEquals(false, result);
	}
}