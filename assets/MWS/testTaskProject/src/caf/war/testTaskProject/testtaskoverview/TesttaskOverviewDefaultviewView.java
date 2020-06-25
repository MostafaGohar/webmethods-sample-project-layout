/**
 * 
 */
package caf.war.testTaskProject.testtaskoverview;

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

@ManagedBean(name = "TesttaskOverviewDefaultviewView")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "TesttaskOverview/default", beanType = BeanType.PAGE)
public class TesttaskOverviewDefaultviewView extends com.webmethods.caf.faces.bean.BasePageBean {


	private static final long serialVersionUID = 1L;
	private static final String[][] INITIALIZE_PROPERTY_BINDINGS = new String[][] {
		{"#{activePreferencesBean.currentTab}", "TaskData"},
	};

	// binding the Task Display Provider to the current taskID (passed to the Portlet Bean via the URL)
	private TaskDisplayProvider taskDisplayProvider = null;
	private static final String[][] TASKDISPLAYPROVIDER_PROPERTY_BINDINGS = new String[][] { {
			"#{TaskDisplayProvider.taskID}", "#{TesttaskOverview.taskID}" }, };
	private transient caf.war.testTaskProject.testtaskoverview.TesttaskOverview testtaskOverview = null;
	private caf.war.testTaskProject.taskclient.Testtask testtask = null;
	private static final String[][] TESTTASK_PROPERTY_BINDINGS = new String[][] {
		{"#{Testtask.taskID}", "#{TesttaskOverview.taskID}"},
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

	public caf.war.testTaskProject.testtaskoverview.TesttaskOverview getTesttaskOverview()  {
		if (testtaskOverview == null) {
		    testtaskOverview = (caf.war.testTaskProject.testtaskoverview.TesttaskOverview)resolveExpression("#{TesttaskOverview}");
		}
		return testtaskOverview;
	}

	public caf.war.testTaskProject.taskclient.Testtask getTesttask()  {
		if (testtask == null) {
		    testtask = (caf.war.testTaskProject.taskclient.Testtask)resolveExpression("#{Testtask}");
		}
	
	    resolveDataBinding(TESTTASK_PROPERTY_BINDINGS, testtask, "testtask", false, false);
		return testtask;
	}

}