package edu.bit.ex;

public class Emp {
	private int empno, mgr, sal, comm, deptno;
	private String ename, job, hiredate, dname, loc;
	
	public Emp() {}

	public int getEmpno() {
		return empno;
	}

	public int getMgr() {
		return mgr;
	}

	public String getHiredate() {
		return hiredate;
	}

	public int getSal() {
		return sal;
	}

	public int getComm() {
		return comm;
	}

	public int getDeptno() {
		return deptno;
	}

	public String getEname() {
		return ename;
	}

	public String getJob() {
		return job;
	}

	public String getDname() {
		return dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public void setMgr(int mgr) {
		this.mgr = mgr;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public void setComm(int comm) {
		this.comm = comm;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}
	
}
