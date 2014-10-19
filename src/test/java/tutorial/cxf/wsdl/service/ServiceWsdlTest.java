package tutorial.cxf.wsdl.service;
/*
import java.net.URL;
import java.util.logging.Logger;

import javax.xml.namespace.QName;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import tutorial.cxf.wsdl.sei.UserServices;

public class ServiceWsdlTest {
	 
	 private static final String WSDL_URL_KEY = "checkVerify.wsdl.url";
	 private static final QName QNAME = new QName("http://tutorial.cxf.wsdl/v1", "UserServices");
	 private static UserServices checkVerify;
	 private static final String TODAY="";
	    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Attempting to initiate service");
        String wsdl = System.getProperty(WSDL_URL_KEY);
       System.out.println("Using WSDL :"+wsdl);
        
        final URL wsdlUrl = new URL(wsdl);

        final UserServices service = new UserServices(wsdlUrl, QNAME);
        
        checkVerify = service.getCheckVerify();
                
        if (checkVerify != null) {
            System.out.println("Found service stub.");
        } else {
            fail("");
        }
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		LOGGER.debug("Executing...");

        CheckType check = new CheckType();
        //....

        MessageResponseType response = null;
        try {

            response = checkVerify.verify(check);

            LOGGER.debug("Completed Exception response.");

        } catch (MyFault ex) {
            LOGGER.error("Error class: " + ex.getClass().getName());
            LOGGER.error("Caught error. Message: " + ex.getMessage());

            assertTrue(true);
        }
		
		
	}

}*/
