package main;

public class DigitMaker {
	static String[] firstLines =  {"._.", "...", "._.", "._."};
	static String[] secondLines = {"|.|", "..|", "._|", "._|"};
	static String[] thirdLines =  {"|_|", "..|", "|_.", "._|"};

	public String makeDigit(int i) {
		if(i/10 > 0){
			if(i == 10){
				String numberString = String.valueOf(i);
				String[] line = new String[numberString.length()];
				
				
				line[0] = firstLines[numberString.charAt(0) - '0'];
				line[1] = firstLines[numberString.charAt(1) - '0'];
				String firstLine = String.join(" ", line); 
				
				line[0] = secondLines[numberString.charAt(0) - '0'];
				line[1] = secondLines[numberString.charAt(1) - '0'];
				String secondLine = String.join(" ", line);//secondLines[1] + " " +secondLines[0];
				
				line[0] = thirdLines[numberString.charAt(0) - '0'];
				line[1] = thirdLines[numberString.charAt(1) - '0'];
				String thirdLine =  String.join(" ", line);//thirdLines[1]+ " " +thirdLines[0];
				
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
