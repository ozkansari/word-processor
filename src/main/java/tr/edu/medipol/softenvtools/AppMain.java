package tr.edu.medipol.softenvtools;

import org.apache.commons.lang3.StringUtils;

public class AppMain {

	public static void main(String[] args) {
		String inputSentence = "Software Environment and Tools";
		String formatted = format(inputSentence);
		System.out.println(inputSentence + " -> " + formatted);
	}

	// We want to test this formatting logic runs correctly for different types of inputs
	public static String format(String input) {
		if(input == null) return ""
		String whitespaceDeleted = StringUtils.deleteWhitespace(input);
		String formatted = StringUtils.lowerCase(whitespaceDeleted);
		return formatted;
	}
}
