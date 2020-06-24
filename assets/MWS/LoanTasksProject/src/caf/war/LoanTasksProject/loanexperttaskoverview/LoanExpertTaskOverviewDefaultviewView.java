/**
 * 
 */
package caf.war.LoanTasksProject.loanexperttaskoverview;

/**
 * @author mostafagohar
 *
 */

import com.webmethods.caf.faces.data.task.TaskDisplayProvider;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

@ManagedBean(name = "LoanExpertTaskOverviewDefaultviewView")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "LoanExpertTaskOverview/default", beanType = BeanType.PAGE)
public class LoanExpertTaskOverviewDefaultviewView extends com.webmethods.caf.faces.bean.BasePageBean {


	private static final long serialVersionUID = 1L;
	private static final String[][] INITIALIZE_PROPERTY_BINDINGS = new String[][] {
		{"#{activePreferencesBean.currentTab}", "TaskData"},
	};

	// binding the Task Display Provider to the current taskID (passed to the Portlet Bean via the URL)
	private TaskDisplayProvider taskDisplayProvider = null;
	private static final String[][] TASKDISPLAYPROVIDER_PROPERTY_BINDINGS = new String[][] { {
			"#{TaskDisplayProvider.taskID}", "#{LoanExpertTaskOverview.taskID}" }, };
	private transient caf.war.LoanTasksProject.loanexperttaskoverview.LoanExpertTaskOverview loanExpertTaskOverview = null;
	private caf.war.LoanTasksProject.taskclient.LoanExpertTask loanExpertTask = null;
	private static final String[][] LOANEXPERTTASK_PROPERTY_BINDINGS = new String[][] {
		{"#{LoanExpertTask.taskID}", "#{LoanExpertTaskOverview.taskID}"},
	};

	/**
	 * Initialize page
	 */
	public String initialize() {
		try {
		    resolveDataBinding(INITIALIZE_PROPERTY_BINDINGS, null, "initialize", true, false);
		} catch (Exception e) {
			error(e);
			log(e);
		}
		return null;	
	}

	/*
	 * Get the Task Display Provider for the current taskID
	 */
	public TaskDisplayProvider getTaskDisplayProvider() {
		if (taskDisplayProvider == null) {
			taskDisplayProvider = (TaskDisplayProvider) resolveExpression("#{TaskDisplayProvider}");
		}
		resolveDataBinding(TASKDISPLAYPROVIDER_PROPERTY_BINDINGS,
				taskDisplayProvider, "taskDisplayProvider", false, false);
		return taskDisplayProvider;
	}

	public caf.war.LoanTasksProject.loanexperttaskoverview.LoanExpertTaskOverview getLoanExpertTaskOverview()  {
		if (loanExpertTaskOverview == null) {
		    loanExpertTaskOverview = (caf.war.LoanTasksProject.loanexperttaskoverview.LoanExpertTaskOverview)resolveExpression("#{LoanExpertTaskOverview}");
		}
		return loanExpertTaskOverview;
	}

	public caf.war.LoanTasksProject.taskclient.LoanExpertTask getLoanExpertTask()  {
		if (loanExpertTask == null) {
		    loanExpertTask = (caf.war.LoanTasksProject.taskclient.LoanExpertTask)resolveExpression("#{LoanExpertTask}");
		}
	
	    resolveDataBinding(LOANEXPERTTASK_PROPERTY_BINDINGS, loanExpertTask, "loanExpertTask", false, false);
		return loanExpertTask;
	}

}