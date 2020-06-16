/**
 * 
 */
package caf.war.confirmPaymentProject.confirmpaymentoverview;

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

@ManagedBean(name = "ConfirmPaymentOverviewDefaultviewView")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "ConfirmPaymentOverview/default", beanType = BeanType.PAGE)
public class ConfirmPaymentOverviewDefaultviewView extends com.webmethods.caf.faces.bean.BasePageBean {


	private static final long serialVersionUID = 1L;
	private static final String[][] INITIALIZE_PROPERTY_BINDINGS = new String[][] {
		{"#{activePreferencesBean.currentTab}", "TaskData"},
	};

	// binding the Task Display Provider to the current taskID (passed to the Portlet Bean via the URL)
	private TaskDisplayProvider taskDisplayProvider = null;
	private static final String[][] TASKDISPLAYPROVIDER_PROPERTY_BINDINGS = new String[][] { {
			"#{TaskDisplayProvider.taskID}", "#{ConfirmPaymentOverview.taskID}" }, };
	private transient caf.war.confirmPaymentProject.confirmpaymentoverview.ConfirmPaymentOverview confirmPaymentOverview = null;
	private caf.war.confirmPaymentProject.taskclient.ConfirmPayment confirmPayment = null;
	private static final String[][] CONFIRMPAYMENT_PROPERTY_BINDINGS = new String[][] {
		{"#{ConfirmPayment.taskID}", "#{ConfirmPaymentOverview.taskID}"},
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

	public caf.war.confirmPaymentProject.confirmpaymentoverview.ConfirmPaymentOverview getConfirmPaymentOverview()  {
		if (confirmPaymentOverview == null) {
		    confirmPaymentOverview = (caf.war.confirmPaymentProject.confirmpaymentoverview.ConfirmPaymentOverview)resolveExpression("#{ConfirmPaymentOverview}");
		}
		return confirmPaymentOverview;
	}

	public caf.war.confirmPaymentProject.taskclient.ConfirmPayment getConfirmPayment()  {
		if (confirmPayment == null) {
		    confirmPayment = (caf.war.confirmPaymentProject.taskclient.ConfirmPayment)resolveExpression("#{ConfirmPayment}");
		}
	
	    resolveDataBinding(CONFIRMPAYMENT_PROPERTY_BINDINGS, confirmPayment, "confirmPayment", false, false);
		return confirmPayment;
	}

}