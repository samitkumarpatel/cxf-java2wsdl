package tutorial.cxf.wsdl.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class User {
	private String uId;
	private String name;
	public User(String uId, String name, String userType) {
		super();
		this.uId = uId;
		this.name = name;
		this.userType = userType;
	}
	private String userType;
	
	public User() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getuId() {
		return uId;
	}
	public void setuId(String uId) {
		this.uId = uId;
	}
	@Override
	public String toString() {
		return "User [uId=" + uId + ", name=" + name + ", userType=" + userType
				+ "]";
	}
	
}
