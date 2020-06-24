package caf.war.LoanTasksProject.is.document;

import java.io.Serializable;

/**
 * IS document wrapper
 */
public  class MJRA_BPM_Workshop_Helper_Doc_LoanApplicationRequest extends java.lang.Object implements Serializable {

	
	private static final long serialVersionUID = 1L;
	// IS Document type used to generate this class
	public static final String DOCUMENT_TYPE = "MJRA_BPM_Workshop_Helper.Doc:LoanApplicationRequest";
	private java.lang.String accountNumber;
	private java.lang.String customerName;
	private int customerSalary;
	private java.lang.String loanType;
	public static String[][] FIELD_NAMES = new String[][] {{"accountNumber", "AccountNumber"},{"customerName", "CustomerName"},{"customerSalary", "CustomerSalary"},{"loanType", "LoanType"},{"loanAmount", "LoanAmount"},
	};
	private int loanAmount;
	

	public MJRA_BPM_Workshop_Helper_Doc_LoanApplicationRequest() {
	}


	public java.lang.String getAccountNumber()  {
		
		return accountNumber;
	}


	public void setAccountNumber(java.lang.String accountNumber)  {
		this.accountNumber = accountNumber;
	}


	public java.lang.String getCustomerName()  {
		
		return customerName;
	}


	public void setCustomerName(java.lang.String customerName)  {
		this.customerName = customerName;
	}


	public int getCustomerSalary()  {
		
		return customerSalary;
	}


	public void setCustomerSalary(int customerSalary)  {
		this.customerSalary = customerSalary;
	}


	public java.lang.String getLoanType()  {
		
		return loanType;
	}


	public void setLoanType(java.lang.String loanType)  {
		this.loanType = loanType;
	}


	public int getLoanAmount()  {
		
		return loanAmount;
	}


	public void setLoanAmount(int loanAmount)  {
		this.loanAmount = loanAmount;
	}

}