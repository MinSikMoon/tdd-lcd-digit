package main;

public class DigitMaker {
	static String[] firstLines = {"._.", "..."};

	public String makeDigit(int i) {
		if(i == 1){
			String firstLine = firstLines[1];//"..."; 
			String secondLine = "..|";
			String thirdLine = "..|";
			String[] lines = new String[]{firstLine, secondLine, thirdLine};
			return String.join("\n", lines) + "\n";
		}else if(i==2){
			String firstLine = "._."; 
			String secondLine = "._|"; 
			String thirdLine = "|_.";
			String[] lines = new String[]{firstLine, secondLine, thirdLine};
			return String.join("\n", lines) + "\n";
		}
		
		String firstLine = firstLines[0];//"._."; 
		String secondLine = "|.|"; 
		String thirdLine = "|_|";
		String[] lines = new String[]{firstLine, secondLine, thirdLine};
		return String.join("\n", lines) + "\n";
	}
	
}
