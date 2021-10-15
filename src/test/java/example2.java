import java.util.Locale;
import java.util.Scanner;

public class example2 {

	public static void main(String[] args) {
		getString();
	}

	public static void getString() {
		System.out.println("Write some string");

		Scanner in = new Scanner(System.in);
		String oldString = in.nextLine(), newString = "";


		newString = newString + oldString.substring(0, 1).toUpperCase(Locale.ROOT);


		for (int i = 1; i < oldString.length(); i++) {
			if (" ".equals(oldString.substring(i - 1, i)))
				newString = newString + oldString.substring(i, i + 1).toUpperCase(Locale.ROOT);
			else
				newString = newString + oldString.substring(i, i + 1);
		}

		newString = newString.replaceAll("\\s+", " ");
		System.out.println(newString);


	}
}
