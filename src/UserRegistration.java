import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Pattern pattern;
		String firstName, lastName, email;
		Matcher matcher;

		pattern = Pattern.compile("^[A-Z][a-z]{2,}");
		System.out.println("Enter the FirstName");
		while (true) {
			firstName = scanner.nextLine();
			if (pattern.matcher(firstName).matches()) {
				break;
			}
			System.out.println("Enter valid first name");
		}

		pattern = Pattern.compile("^[A-Z][a-z]{2,}");
		System.out.println("Enter the Last Name");
		while (true) {
			lastName = scanner.nextLine();
			if (pattern.matcher(lastName).matches()) {
				break;
			}
			System.out.println("Enter valid last name");
		}

		pattern = Pattern.compile("abc(\\.xyz)?@bl\\.co(\\.in)?");
		System.out.println("Enter the email");
		while (true) {
			email = scanner.nextLine();
			if (pattern.matcher(email).matches()) {
				break;
			}
			System.out.println("Enter valid email");
		}

	}
}