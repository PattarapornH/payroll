
package payrollcasestudy.entities.payentclassifications;

import payrollcasestudy.entities.PayCheck;
import payrollcasestudy.entities.paymentclassifications.PaymentClassification;

/**
 * represent payment classification which is based on a flat salary
 */
public class SalariedClassification extends PaymentClassification
{

	private double salary;

	public SalariedClassification( double salary )
	{
		this.salary = salary;
	}

	public double getSalary()
	{
		return salary;
	}
	
	@Override
	public double calculatePay( PayCheck payCheck )
	{
		return salary;
	}
	
}
