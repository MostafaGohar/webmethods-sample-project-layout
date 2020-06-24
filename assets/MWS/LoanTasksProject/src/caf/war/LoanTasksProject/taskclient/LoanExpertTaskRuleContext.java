package caf.war.LoanTasksProject.taskclient;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

@ManagedBean(name = "LoanExpertTaskRuleContext")
@SessionScoped
@DTManagedBean(displayName = "Loan Expert Task Rule Context", beanType = BeanType.DEFAULT)
public class LoanExpertTaskRuleContext  extends  com.webmethods.caf.faces.data.task.impl.BaseTaskRuleContext {
}