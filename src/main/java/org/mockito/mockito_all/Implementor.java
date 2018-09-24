package org.mockito.mockito_all;

public class Implementor implements ICalculator {
	
	ICalculator interfaceObj;

	public void setCalculate(ICalculator interfaceObj) {
			this.interfaceObj = interfaceObj;
	}


	public double fortnightSalary(double val) {
		return interfaceObj.fortnightSalary(val);
	}


	public float computeTax(double aSalary) {
		return interfaceObj.computeTax(aSalary);
	}


	public double weeklySalary(double aSalary) {
		return interfaceObj.weeklySalary(aSalary);
	}


	public double computeKiwiSaver(double aSalary) {
		return interfaceObj.computeKiwiSaver(aSalary);
	}	

}
