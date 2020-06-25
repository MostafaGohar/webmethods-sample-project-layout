package caf.war.testTaskProject.taskclient;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

@ManagedBean(name = "TesttaskRuleContext")
@SessionScoped
@DTManagedBean(displayName = "test task Rule Context", beanType = BeanType.DEFAULT)
public class TesttaskRuleContext  extends  com.webmethods.caf.faces.data.task.impl.BaseTaskRuleContext {
}