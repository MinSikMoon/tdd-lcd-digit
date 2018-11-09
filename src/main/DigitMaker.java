package main;

public class DigitMaker {
	static String[] firstLines = {"._.", "..."};
	static String[] secondLines = {"|.|", "..|"};
	static String[] thirdLines = {"|_|", "..|"};

	public String makeDigit(int i) {
		String firstLine = firstLines[i];//"._."; 
		String secondLine = secondLines[i];//"|.|"; 
		String thirdLine = thirdLines[i];//"|_|";
		String[] lines = new String[]{firstLine, secondLine, thirdLine};
		return String.join("\n", lines) + "\n";
	}
	
}
