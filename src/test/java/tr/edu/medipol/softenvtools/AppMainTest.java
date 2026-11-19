package tr.edu.medipol.softenvtools;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AppMainTest {

	@Test
	public void formatWithEmptyString() {
		// GIVEN
		String input = "";
		// WHEN (ACT)
		String actual = AppMain.format(input);
		// THEN
		assertEquals("", actual, "Result should be empty");
	}
	
	@Test
	public void formatWithNullString() {
		// GIVEN
		String input = null;
		// WHEN (ACT)
		String actual = AppMain.format(input);
		// THEN
		assertEquals("", actual, "Result should be empty");	
	}
}
