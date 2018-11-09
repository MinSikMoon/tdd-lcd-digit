package main;

public class DigitMaker {
	static String[] firstLines =  {"._.", "...", "._.", "._."};
	static String[] secondLines = {"|.|", "..|", "._|", "._|"};
	static String[] thirdLines =  {"|_|", "..|", "|_.", "._|"};

	public String makeDigit(int i) {
		if(i/10 > 0){
			if(i == 10){
				String[] line1 = new String[2];
				line1[0] = firstLines[1];
				line1[1] = firstLines[0];
				String firstLine = String.join(" ", line1); 
				
				String[] line2 = new String[2];
				line2[0] = secondLines[1];
				line2[1] = secondLines[0];
				String secondLine = String.join(" ", line2);//secondLines[1] + " " +secondLines[0];
				
				
				String[] line3 = new String[2];
				line3[0] = thirdLines[1];
				line3[1] = thirdLines[0];
				String thirdLine =  String.join(" ", line3);//thirdLines[1]+ " " +thirdLines[0];
				
				
				
				
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
