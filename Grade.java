package edu.bit.ex;

public class Grade {

	private int sNum, java, DB, JSP;
	private double avg;
	
	public Grade() {}
	
	public int getsNum() {
		return sNum;
	}
	public int getJava() {
		return java;
	}
	public int getDB() {
		return DB;
	}
	public int getJSP() {
		return JSP;
	}
	public double getAvg() {
		return (java+DB+JSP)/3;
	}
	public void setsNum(int sNum) {
		this.sNum = sNum;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public void setDB(int DB) {
		this.DB = DB;
	}
	public void setJSP(int JSP) {
		this.JSP = JSP;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
}
