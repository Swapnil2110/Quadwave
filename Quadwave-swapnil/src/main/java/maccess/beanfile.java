package maccess;
import java.io.*;
@SuppressWarnings("serial")
public class beanfile implements Serializable{
	private String employeeid,employeename,designation;
	private int exp;
	
	public String getEmpid() {
		return employeeid;
	}
	
	public void setEmpid(String empid) {
		this.employeeid = empid;
	}
	
	public String getEmpname() {
		return employeename;
	}
	
	public void setEmpname(String empname) {
		this.employeename = empname;
	}
	
	public String getDesg() {
		return designation;
	}
	
	public void setDesg(String desg) {
		this.designation = desg;
	}
	
	public int getYerofexp() {
		return exp;
	}
	
	public void setYerofexp(int yerofexp) {
		this.exp = yerofexp;
	}
	

}
