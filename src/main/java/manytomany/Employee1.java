package manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Employee1 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eid;
	@Column(nullable = false)
	private String ename;
	@Column(nullable = false)
	private String eaddress;
	@Column(nullable = false)
	private String esalary;
	
	@ManyToMany(mappedBy = "emplist",cascade = CascadeType.ALL)
	private List<Project> projectlist=new ArrayList<Project>();

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEaddress() {
		return eaddress;
	}

	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}

	public String getEsalary() {
		return esalary;
	}

	public void setEsalary(String esalary) {
		this.esalary = esalary;
	}

	public List<Project> getProjectlist() {
		return projectlist;
	}

	public void setProjectlist(List<Project> projectlist) {
		this.projectlist = projectlist;
	}

	@Override
	public String toString() {
		return "Employee1 [eid=" + eid + ", ename=" + ename + ", eaddress=" + eaddress + ", esalary=" + esalary
				+ ", projectlist=" + projectlist + "]";
	}

	public Employee1(int eid, String ename, String eaddress, String esalary, List<Project> projectlist) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eaddress = eaddress;
		this.esalary = esalary;
		this.projectlist = projectlist;
	}

	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	
}
