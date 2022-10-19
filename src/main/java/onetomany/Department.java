package onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int did;
	@Column(nullable = false)
	private String dname;
	@OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
	private List<Employee> employeelist=new ArrayList();
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public List<Employee> getEmployeelist() {
		return employeelist;
	}
	public void setEmployeelist(List<Employee> employeelist) {
		this.employeelist = employeelist;
	}
	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + ", employeelist=" + employeelist + "]";
	}
	public Department(int did, String dname, List<Employee> employeelist) {
		super();
		this.did = did;
		this.dname = dname;
		this.employeelist = employeelist;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}


}
