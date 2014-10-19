package tutorial.cxf.wsdl.exception;

import javax.xml.ws.WebFault;

@WebFault(name="UserNotFoundException",targetNamespace="http://tutorial.cxf.wsdl/v1")
public class UserNotFoundException extends Exception {
	/**
	 * User defined Exception
	 */
	private static final long serialVersionUID = 1L;
	private CheckFaultBean checkFaultBean;
	
	public UserNotFoundException(){
		super();
	}
	public UserNotFoundException(String message,CheckFaultBean checkFaultBean){
		super(message);
		this.checkFaultBean=checkFaultBean;
	}
	public UserNotFoundException(String message,CheckFaultBean checkFaultBean,Throwable cause){
		super(message, cause);
		this.checkFaultBean=checkFaultBean;
	}
	public CheckFaultBean getFaultInfo(){
		return checkFaultBean;
	}
}
