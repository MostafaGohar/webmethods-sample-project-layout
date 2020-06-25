/**
 * 
 */
package caf.war.testTaskProject;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * @author mostafagohar
 *
 */
@ManagedBean(name = "TestTaskProject")
@ApplicationScoped
@DTManagedBean(displayName = "testTaskProject", beanType = BeanType.APPLICATION)
public class TestTaskProject extends com.webmethods.caf.faces.bean.BaseApplicationBean 
{
	public TestTaskProject()
	{
		super();
		setCategoryName( "CafApplication" );
		setSubCategoryName( "testTaskProject" );
	}
}