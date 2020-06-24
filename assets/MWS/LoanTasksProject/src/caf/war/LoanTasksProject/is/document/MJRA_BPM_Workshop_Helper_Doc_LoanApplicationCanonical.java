package caf.war.LoanTasksProject.is.document;

import java.io.Serializable;

/**
 * IS document wrapper
 */
public  class MJRA_BPM_Workshop_Helper_Doc_LoanApplicationCanonical extends java.lang.Object implements Serializable {

	
	private static final long serialVersionUID = 1L;
	// IS Document type used to generate this class
	public static final String DOCUMENT_TYPE = "MJRA_BPM_Workshop_Helper.Doc:LoanApplicationCanonical";
	// Used by Designer to access the source document.
	@SuppressWarnings("unused")
	private static final String DOCUMENT_SRC = "http://localhost:5555";
	private caf.war.LoanTasksProject.is.document.MJRA_BPM_Workshop_Helper_Doc_LoanApplicationRequest loanApplicationRequest = null;
	private java.lang.String isValid;
	private java.lang.String expertComment;
	private java.lang.String waitConfirmation;
	public static String[][] FIELD_NAMES = new String[][] {{"loanApplicationRequest", "LoanApplicationRequest"},{"isValid", "isValid"},{"expertComment", "expertComment"},{"waitConfirmation", "waitConfirmation"},{"isApproved", "isApproved"},
	};
	private java.lang.String isApproved;
	

	public MJRA_BPM_Workshop_Helper_Doc_LoanApplicationCanonical() {
	}


	public caf.war.LoanTasksProject.is.document.MJRA_BPM_Workshop_Helper_Doc_LoanApplicationRequest getLoanApplicationRequest()  {
		if (loanApplicationRequest == null) {
			loanApplicationRequest = new caf.war.LoanTasksProject.is.document.MJRA_BPM_Workshop_Helper_Doc_LoanApplicationRequest();
		}
		return loanApplicationRequest;
	}


	public void setLoanApplicationRequest(caf.war.LoanTasksProject.is.document.MJRA_BPM_Workshop_Helper_Doc_LoanApplicationRequest loanApplicationRequest)  {
		this.loanApplicationRequest = loanApplicationRequest;
	}


	public java.lang.String getIsValid()  {
		
		return isValid;
	}


	public void setIsValid(java.lang.String isValid)  {
		this.isValid = isValid;
	}


	public java.lang.String getExpertComment()  {
		
		return expertComment;
	}


	public void setExpertComment(java.lang.String expertComment)  {
		this.expertComment = expertComment;
	}


	public java.lang.String getWaitConfirmation()  {
		
		return waitConfirmation;
	}


	public void setWaitConfirmation(java.lang.String waitConfirmation)  {
		this.waitConfirmation = waitConfirmation;
	}


	public java.lang.String getIsApproved()  {
		
		return isApproved;
	}


	public void setIsApproved(java.lang.String isApproved)  {
		this.isApproved = isApproved;
	}

}