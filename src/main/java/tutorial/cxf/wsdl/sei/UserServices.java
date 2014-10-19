package tutorial.cxf.wsdl.sei;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import tutorial.cxf.wsdl.exception.UserNotFoundException;
import tutorial.cxf.wsdl.pojo.User;

@WebService(name="UserServices",targetNamespace="http://tutorial.cxf.wsdl/v1")
public interface UserServices {

		@WebMethod(operationName="getUser")
		@RequestWrapper(targetNamespace="http://tutorial.cxf.wsdl/v1",className="java.lang.String")
		@ResponseWrapper(targetNamespace="http://tutorial.cxf.wsdl/v1",className="tutorial.cxf.wsdl.pojo.User")
		public @WebResult(name="getUserResponse", 
											partName="getUserResponse",
											targetNamespace="http://tutorial.cxf.wsdl/v1")
											User getUser(@WebParam(name="userId", 
																							partName="userId",
																							targetNamespace="http://tutorial.cxf.wsdl/v1") String userId)
																							throws UserNotFoundException;
}
