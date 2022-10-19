package manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;


@Entity
public class Project {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pid;
	
	@Column(nullable = false)
	private String pname;
	
	@ManyToMany
	@JoinColumn(name = "empid")
	private List<Employee1> emplist=new ArrayList<Employee1>();

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public List<Employee1> getEmplist() {
		return emplist;
	}

	public void setEmplist(List<Employee1> emplist) {
		this.emplist = emplist;
	}

	public Project(int pid, String pname, List<Employee1> emplist) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.emplist = emplist;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Project [pid=" + pid + ", pname=" + pname + ", emplist=" + emplist + "]";
	}
	
	
	
	
}
