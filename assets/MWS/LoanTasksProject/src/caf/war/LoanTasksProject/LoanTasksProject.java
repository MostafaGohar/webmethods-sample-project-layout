/**
 * 
 */
package caf.war.LoanTasksProject;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * @author mostafagohar
 *
 */
@ManagedBean(name = "LoanTasksProject")
@ApplicationScoped
@DTManagedBean(displayName = "LoanTasksProject", beanType = BeanType.APPLICATION)
public class LoanTasksProject extends com.webmethods.caf.faces.bean.BaseApplicationBean 
{
	public LoanTasksProject()
	{
		super();
		setCategoryName( "CafApplication" );
		setSubCategoryName( "LoanTasksProject" );
	}
}