/**
 * 
 */
package caf.war.LoanTasksProject.loanexperttaskview;

/**
 * @author mostafagohar
 *
 */

import com.webmethods.caf.faces.data.dir.PrincipalModel;
import com.webmethods.caf.faces.data.dir.PrincipalModelList;
import com.webmethods.caf.faces.data.task.impl.TaskContentProvider;


import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

@ManagedBean(name = "LoanExpertTaskViewDefaultviewView")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "LoanExpertTaskView/default", beanType = BeanType.PAGE)
public class LoanExpertTaskViewDefaultviewView extends com.webmethods.caf.faces.bean.task.BaseTaskDetailsPageBean {

 
	/**
	 * Determines if a de-serialized file is compatible with this class.
	 *
	 * Maintainers must change this value if and only if the new version
	 * of this class is not compatible with old versions. See Sun docs
	 * for <a href=http://java.sun.com/j2se/1.5.0/docs/guide/serialization/spec/version.html> 
	 * details. </a>
	 */
	private static final long serialVersionUID = 1L;
	private com.webmethods.caf.faces.data.task.TaskDisplayProvider taskDisplayProvider = null;
	private static final String[][] TASKDISPLAYPROVIDER_PROPERTY_BINDINGS = new String[][] {
		{"#{TaskDisplayProvider.taskID}", "#{LoanExpertTaskView.taskID}"},
	};
	
	
    
	public com.webmethods.caf.faces.data.task.TaskDisplayProvider getTaskDisplayProvider()  {
		if (taskDisplayProvider == null) {
		    taskDisplayProvider = (com.webmethods.caf.faces.data.task.TaskDisplayProvider)resolveExpression("#{TaskDisplayProvider}");
		}
	    resolveDataBinding(TASKDISPLAYPROVIDER_PROPERTY_BINDINGS, taskDisplayProvider, "taskDisplayProvider", false, false);
		return taskDisplayProvider;
	}

    
	/**
	 * Cancel button action handler
	 */
	public String cancelView() {
		try {
			// just redirect to return (finish) url
			String url = getLoanExpertTaskView().getFinishUrl();
			if (url != null && url.length() > 0) {
				getFacesContext().getExternalContext().redirect(url);
			}
		} catch (Exception e) {
			error(e);
			log(e);
		}
		return null;
	}
	
	/**
	 * Complete button action handler
	 */
	public String completeTask() {
		try {
			if( !getLoanExpertTask().isUpdateable() ){
				String errMsg = "You must accept a task before updating it";	//view.task.pagebean.task.accept.msg
				error(errMsg);
				return null; 
			}

			// do the work
			getLoanExpertTask().completeTask(); 
		
			// then redirect to finish url
			String url = getLoanExpertTaskView().getFinishUrl(); 
			if (url != null && url.length() > 0) {
				getFacesContext().getExternalContext().redirect(url);
			}
		} catch (Exception e) {
			error(e);
			log(e);
		}
		return null;
	}	

	/**
	 * Submit button action handler
	 */
	public String submitTask() {
		try {
			if( !getLoanExpertTask().isUpdateable() ){
				String errMsg = "You must accept a task before updating it";	//view.task.pagebean.task.accept.msg
				error(errMsg);
				return null; 
			}


			// do the work
			getLoanExpertTask().applyChanges();
		} catch (Exception e) {
			error(e);
			log(e);
		}
		return null;
	}

	private PrincipalModelList selectedPrincipalList;

	public PrincipalModelList getPrincipalList() {
		return selectedPrincipalList;
	}
	
	public void setPrincipalList(PrincipalModelList value) {
		this.selectedPrincipalList = value;
	}
	
	/**
	 * Action Event Handler for the control with id='dialogPrincipalAssignTo'
	 */
	public String assignToPrincipals() {
		try {

			// get the current assigned principals for this task
			TaskContentProvider tp = getLoanExpertTask();

			List<String> currentPrincipalList = new ArrayList<String>();
			String[] currentPrincipalIDs = tp.getTaskInfo().getAssignedToList();
			if (currentPrincipalIDs != null && currentPrincipalIDs.length > 0) {
				for (int ix = 0; ix < currentPrincipalIDs.length; ix++) {
					String principalID = currentPrincipalIDs[ix];
					currentPrincipalList.add( principalID );
				}
			}
			
			// get the selected principals from the picker
			if (selectedPrincipalList != null && selectedPrincipalList.size() > 0) {
				// loop and add the selected principals to the existing list
				for (int ix = 0; ix < selectedPrincipalList.size(); ix++) {
					PrincipalModel principalModel = (PrincipalModel) selectedPrincipalList.get(ix);
					String principalID = principalModel.getPrincipalID(); 
					if( !currentPrincipalList.contains( principalID)) {
						currentPrincipalList.add( principalID );
					}
				}
			}
				
			currentPrincipalIDs = currentPrincipalList.toArray( currentPrincipalIDs);
			tp.getTaskInfo().setAssignedToList(currentPrincipalIDs);
			tp.applyChangesNoAccept();
				
			// then redirect to finish url
			//String url = getRonTask36TaskView().getFinishUrl(); 
			//if (url != null && url.length() > 0) {
			//	getFacesContext().getExternalContext().redirect(url);
			//}				
		} catch (Exception e) {
			error(e);
			log(e);
		}		
		return null;
	}
	
	private static final String[][] INITIALIZE_PROPERTY_BINDINGS = new String[][] {
		{"#{LoanExpertTask.reset}", null}
	};
	private transient caf.war.LoanTasksProject.loanexperttaskview.LoanExpertTaskView loanExpertTaskView = null;
	private caf.war.LoanTasksProject.taskclient.LoanExpertTask loanExpertTask = null;
	private static final String[][] LOANEXPERTTASK_PROPERTY_BINDINGS = new String[][] {
		{"#{LoanExpertTask.taskID}", "#{LoanExpertTaskView.taskID}"},
		{"#{LoanExpertTask.autoAccept}", "false"},
		{"#{LoanExpertTask.adhocRouting}", "false"},
	};
	private static final String[][] APPROVE_PROPERTY_BINDINGS = new String[][] {
		{"#{LoanExpertTaskViewDefaultviewView.loanExpertTask.taskData.loanApplicationCanonical.isApproved}", "Yes"},
		{"#{LoanExpertTaskViewDefaultviewView.completeTask}", null},
	};
	private static final String[][] REJECT_PROPERTY_BINDINGS = new String[][] {
		{"#{LoanExpertTaskViewDefaultviewView.loanExpertTask.taskData.loanApplicationCanonical.isApproved}", "No"},
		{"#{LoanExpertTaskViewDefaultviewView.completeTask}", null},
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
	
	@Override
	protected void beforeRenderResponse() {
		super.beforeRenderResponse();
		try {
			getLoanExpertTask().refresh();
		} catch( Exception ex ) {
			error(ex);
			log(ex);
		}
		
	}


	public caf.war.LoanTasksProject.loanexperttaskview.LoanExpertTaskView getLoanExpertTaskView()  {
		if (loanExpertTaskView == null) {
		    loanExpertTaskView = (caf.war.LoanTasksProject.loanexperttaskview.LoanExpertTaskView)resolveExpression("#{LoanExpertTaskView}");
		}
		return loanExpertTaskView;
	}


	public caf.war.LoanTasksProject.taskclient.LoanExpertTask getLoanExpertTask()  {
		if (loanExpertTask == null) {
		    loanExpertTask = (caf.war.LoanTasksProject.taskclient.LoanExpertTask)resolveExpression("#{LoanExpertTask}");
		}
	
	    resolveDataBinding(LOANEXPERTTASK_PROPERTY_BINDINGS, loanExpertTask, "loanExpertTask", false, false);
		return loanExpertTask;
	}


	public String approve() {
	    resolveDataBinding(APPROVE_PROPERTY_BINDINGS, this, "approve.this", true, false);
		return null;
	}


	public String reject() {
	    resolveDataBinding(REJECT_PROPERTY_BINDINGS, this, "reject.this", true, false);
		return null;
	}
}