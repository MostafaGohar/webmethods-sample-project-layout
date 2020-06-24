package caf.war.LoanTasksProject.taskclient;


import com.webmethods.caf.faces.data.task.ITaskData;
import com.webmethods.caf.faces.data.ContentProviderException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * Task Client bean for 'Loan Expert Task' task.
 */
@ManagedBean(name = "LoanExpertTask")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class LoanExpertTask extends com.webmethods.caf.faces.data.task.impl.TaskContentProviderExtended {

	private static final long serialVersionUID = 8721829352292699136L;
	
	/**
	 * Globally unique task type id
	 */
	private static final String TASK_TYPE_ID = "8548C11C-203F-F6C3-6DB7-67D1D335A4FC";

	/**
	 * Default constructor
	 */
	public LoanExpertTask() {
		super();
		setTaskTypeID(TASK_TYPE_ID);
	}
	
	/**
	 * Task Data Object
	 */
	public static class TaskData extends com.webmethods.caf.faces.data.task.impl.TaskData {

		private static final long serialVersionUID = 7800475422867095552L;
		
		public static String[][] FIELD_NAMES = new String[][] {{"loanApplicationCanonical", "LoanApplicationCanonical"},
		};

		private caf.war.LoanTasksProject.is.document.MJRA_BPM_Workshop_Helper_Doc_LoanApplicationCanonical loanApplicationCanonical = null;

		public static final String[] INPUTS = new String[] {"loanApplicationCanonical", };

		public static final String[] OUTPUTS = new String[] {"loanApplicationCanonical", };

		public TaskData() {
		}

		public caf.war.LoanTasksProject.is.document.MJRA_BPM_Workshop_Helper_Doc_LoanApplicationCanonical getLoanApplicationCanonical()  {
			if (loanApplicationCanonical == null) {
				loanApplicationCanonical = new caf.war.LoanTasksProject.is.document.MJRA_BPM_Workshop_Helper_Doc_LoanApplicationCanonical();
			}
			return loanApplicationCanonical;
		}

		public void setLoanApplicationCanonical(caf.war.LoanTasksProject.is.document.MJRA_BPM_Workshop_Helper_Doc_LoanApplicationCanonical loanApplicationCanonical)  {
			this.loanApplicationCanonical = loanApplicationCanonical;
		}
		
	}
	
	/**
	 * Return current task data object
	 * @return current task data
	 */
	public TaskData getTaskData() {
		return (TaskData)getValue(PROPERTY_KEY_TASKDATA);
	}

	/**
	 * Creates new task data object
	 * @return newly created task data object
	 */	
	protected ITaskData newTaskData() throws ContentProviderException {
		return new TaskData();
	}

}