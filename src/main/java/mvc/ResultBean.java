package mvc;

import java.io.Serializable;

public class ResultBean implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int hno;
	private String name;
	private int c;
	private int cpp;
	private int java;
	
	public int getHno() {
		return hno;
	}
	public String getName() {
		return name;
	}
	public int getC() {
		return c;
	}
	public int getCpp() {
		return cpp;
	}
	public int getJava() {
		return java;
	}
	public void setHno(int hno) {
		this.hno = hno;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setC(int c) {
		this.c = c;
	}
	public void setCpp(int cpp) {
		this.cpp = cpp;
	}
	public void setJava(int java) {
		this.java = java;
	}
	
	

}
