package edu.bit.ex.vo;

import java.sql.Timestamp;

public class EmpVO {
	private String ename, job;
	private int empno;
	private Timestamp hiredate;

	public EmpVO(String ename, int empno, String job) {
		this.ename = ename;
	    this.empno = empno;
	    this.job = job;
	}

	public String getEname() {
		return ename;
	}

	public String getJob() {
		return job;
	}

	public int getEmpno() {
		return empno;
	}

	public Timestamp getHiredate() {
		return hiredate;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public void setHiredate(Timestamp hiredate) {
		this.hiredate = hiredate;
	}

}
