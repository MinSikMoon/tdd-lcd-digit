package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.DigitMaker;

public class digit {
	
	@Test
	public void test_num0() {
		//a
		DigitMaker dm = new DigitMaker();
		//a
		String result = dm.makeDigit(0);
		//a
		assertEquals( "._.\n"
					+ "|.|\n"
					+ "|_|\n", result);
	}
	@Test
	public void test_num1() {
		//a
		DigitMaker dm = new DigitMaker();
		//a
		//a
		String firstLine = "...\n"; 
		String secondLine = "..|\n";
		String thirdLine = "..|\n";
		assertEquals( firstLine
					+ secondLine
					+ thirdLine, dm.makeDigit(1));
	}
	@Test
	public void test_num00() {
		//a
		DigitMaker dm = new DigitMaker();
		//a
		//a
		String firstLine = "...\n"; 
		String secondLine = "..|\n";
		String thirdLine = "..|\n";
		assertEquals( firstLine
				+ secondLine
				+ thirdLine, dm.makeDigit(1));
	}
	
}
