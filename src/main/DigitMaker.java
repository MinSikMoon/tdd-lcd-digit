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
				
				String firstLine = getFirstLine(numberString); 
				String secondLine = getSecondLine(numberString);
				String thirdLine = getThirdLine(numberString);
				
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

	private String getFirstLine(String numberString, String[] line) {
		for(int j=0; j< numberString.length(); j++){
			line[j] = firstLines[numberString.charAt(j) - '0'];
		}
		String firstLine = String.join(" ", line);
		return firstLine;
	}

	private String getSecondLine(String numberString, String[] line) {
		return getSecondLine(numberString);
	}

	private String getFirstLine(String numberString) {
		String[] line = new String[numberString.length()];
		String[] curLines = firstLines;
		for(int j=0; j< numberString.length(); j++){
			line[j] = curLines[numberString.charAt(j) - '0'];
		}
		return String.join(" ", line);
	}
	
	private String getSecondLine(String numberString) {
		String[] line = new String[numberString.length()];
		String[] curLines = secondLines;
		for(int j=0; j< numberString.length(); j++){
			line[j] = curLines[numberString.charAt(j) - '0'];
		}
		String secondLine =  String.join(" ", line);
		return secondLine;
	}

	private String getThirdLine(String numberString, String[] line) {
		return getThirdLine(numberString);
	}

	private String getThirdLine(String numberString) {
		String[] line = new String[numberString.length()];
		String[] curLines = thirdLines;
		for(int j=0; j< numberString.length(); j++){
			line[j] = curLines[numberString.charAt(j) - '0'];
		}
		String thirdLine =  String.join(" ", line);
		return thirdLine;
	}
	
}
