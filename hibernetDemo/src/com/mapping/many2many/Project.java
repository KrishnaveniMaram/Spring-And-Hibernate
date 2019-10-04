package com.mapping.many2many;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="project_table_m2m")
public class Project {
	private int pid;
	private String pname;
	private String pmgr;
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	@ManyToMany
private	List<Project>projects=new ArrayList<Project>();
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
	public String getPmgr() {
		return pmgr;
	}
	public void setPmgr(String pmgr) {
		this.pmgr = pmgr;
	}
	public Project(int pid, String pname, String pmgr) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pmgr = pmgr;
	}
	public Project() {
		
	}
	
	

}
