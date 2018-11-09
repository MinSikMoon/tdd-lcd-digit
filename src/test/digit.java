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
		assertEquals( "...\n"
					+ "..|\n"
					+ "..|\n", dm.makeDigit(1));
	}
	
	
	
	
	
	
	
}
