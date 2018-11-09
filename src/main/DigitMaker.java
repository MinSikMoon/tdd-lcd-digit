package main;

public class DigitMaker {
	static String[] firstLines = {"._.", "...","._."};
	static String[] secondLines = {"|.|", "..|"};
	static String[] thirdLines = {"|_|", "..|"};

	public String makeDigit(int i) {
		if(i == 1){
			String firstLine = firstLines[1];//"..."; 
			String secondLine = secondLines[1];//"..|";
			String thirdLine = thirdLines [1];//"..|";
			String[] lines = new String[]{firstLine, secondLine, thirdLine};
			return String.join("\n", lines) + "\n";
		}else if(i==2){
			String firstLine = firstLines[2]; 
			String secondLine = "._|"; 
			String thirdLine = "|_.";
			String[] lines = new String[]{firstLine, secondLine, thirdLine};
			return String.join("\n", lines) + "\n";
		}
		
		String firstLine = firstLines[0];//"._."; 
		String secondLine = secondLines[0];//"|.|"; 
		String thirdLine = thirdLines[0];//"|_|";
		String[] lines = new String[]{firstLine, secondLine, thirdLine};
		return String.join("\n", lines) + "\n";
	}
	
}
