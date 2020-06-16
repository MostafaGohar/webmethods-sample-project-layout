/**
 * 
 */
package caf.war.confirmPaymentProject;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * @author mostafagohar
 *
 */
@ManagedBean(name = "ConfirmPaymentProject")
@ApplicationScoped
@DTManagedBean(displayName = "confirmPaymentProject", beanType = BeanType.APPLICATION)
public class ConfirmPaymentProject extends com.webmethods.caf.faces.bean.BaseApplicationBean 
{
	public ConfirmPaymentProject()
	{
		super();
		setCategoryName( "CafApplication" );
		setSubCategoryName( "confirmPaymentProject" );
	}
}