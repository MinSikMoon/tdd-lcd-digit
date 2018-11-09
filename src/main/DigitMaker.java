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
				
				for(int j=0; j< numberString.length(); j++){
					line[j] = firstLines[numberString.charAt(j) - '0'];
				}
				String firstLine = String.join(" ", line); 
				
				for(int j=0; j< numberString.length(); j++){
					line[j] = secondLines[numberString.charAt(j) - '0'];
				}
				String secondLine = String.join(" ", line);//secondLines[1] + " " +secondLines[0];
				
				String thirdLine = getThirdLine(numberString, line);
				
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

	private String getThirdLine(String numberString, String[] line) {
		for(int j=0; j< numberString.length(); j++){
			line[j] = thirdLines[numberString.charAt(j) - '0'];
		}
		String thirdLine =  String.join(" ", line);
		return thirdLine;
	}
	
}
