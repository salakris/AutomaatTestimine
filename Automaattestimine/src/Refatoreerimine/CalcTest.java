package Refatoreerimine;

import static org.junit.Assert.*;

import org.junit.Test;


public class CalcTest {
	
	Calc salaryCalculator = new Calc();
	
	@Test
	public void juniorTest() {
		// if h<8
		assertEquals(10,salaryCalculator.juniorWage(1, 1));
		// if h>8
		assertEquals(120,salaryCalculator.juniorWage(1, 10));
		// hero bonus,
		assertEquals(350,salaryCalculator.juniorWage(1, 21));
	}
	@Test
	public void seniorTest() {
		// if h>8
		assertEquals(150,salaryCalculator.seniorWage(2, 9));
		// if h<8
		assertEquals(105,salaryCalculator.seniorWage(2, 7));
		// hero bonus
		assertEquals(530,salaryCalculator.seniorWage(2, 21));
	}
	@Test
	public void specialistTest() {
		// if h>9
		assertEquals(264,salaryCalculator.specialistWage(3,10));
		// if h<9
		assertEquals(176,salaryCalculator.specialistWage(3, 8));
		// hero bonus
		assertEquals(1020,salaryCalculator.specialistWage(3, 21));
	}
	

}
