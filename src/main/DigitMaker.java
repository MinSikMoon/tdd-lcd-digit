package main;

public class DigitMaker {
	static String[] firstLines =  {"._.", "...", "._.", "._."};
	static String[] secondLines = {"|.|", "..|", "._|", "._|"};
	static String[] thirdLines =  {"|_|", "..|", "|_.", "._|"};

	public String makeDigit(int i) {
		if(i/10 > 0){
			if(i == 10){
				String firstLine = firstLines[1] + " " +firstLines[0];//"._."; 
				String secondLine = secondLines[1] + " " +secondLines[0];//"|.|"; 
				String thirdLine = thirdLines[1]+ " " +thirdLines[0];//"|_|";
				String[] lines = new String[]{firstLine, secondLine, thirdLine};
				return String.join("\n", lines) + "\n";
			}
		}
		String firstLine = firstLines[i];//"._."; 
		String secondLine = secondLines[i];//"|.|"; 
		String thirdLine = thirdLines[i];//"|_|";
		String[] lines = new String[]{firstLine, secondLine, thirdLine};
		return String.join("\n", lines) + "\n";
	}
	
}
