package org.mockito.mockito_all;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.*;
import org.mockito.Mockito;
import org.mockito.Mockito.*;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class CalculatorTest extends TestCase {


	ICalculator interfaceObj;
	Implementor implementor;

	Employee emp;

	double aSalary;

	@Before
	public void setUp() throws Exception {

		emp = new Employee(101, 100000.0);

		interfaceObj = Mockito.mock(ICalculator.class);
		implementor = new Implementor();

		aSalary = emp.annualSalary;

		Mockito.when(interfaceObj.computeTax(aSalary)).thenReturn((float) (aSalary / 3));

		Mockito.when(interfaceObj.fortnightSalary(aSalary)).thenReturn(aSalary / 26);

		Mockito.when(interfaceObj.weeklySalary(aSalary)).thenReturn((double) ( aSalary / 52));

		Mockito.when(interfaceObj.computeKiwiSaver(aSalary)).thenReturn((aSalary / 100) * 4);

		implementor.setCalculate(interfaceObj);

	}
	

	public void testfortnightSalary() {
		assertEquals(aSalary / 26, implementor.fortnightSalary(aSalary), 0.2);

	}
	
	public void testWeeklySalary() {
		assertEquals(aSalary / 52, implementor.weeklySalary(aSalary), 0.2);
	}
	
	public void testComputeTax() {
		assertEquals(aSalary / 3, implementor.computeTax(aSalary), 0.2);
	}
	
	public void testKiwiOption() {
		assertEquals((aSalary/100) *4, implementor.computeKiwiSaver(aSalary));
	}
	
	@After
	public void tearDown() throws Exception {
		
		interfaceObj = null;
		assertNull(interfaceObj);

	}
	


}
