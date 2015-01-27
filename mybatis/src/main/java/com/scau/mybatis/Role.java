package com.scau.mybatis;

public class Role {
	private int id;
	private String name;
	private int ctime;
	private int mtime;
	private int listorder;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCtime() {
		return ctime;
	}
	public void setCtime(int ctime) {
		this.ctime = ctime;
	}
	public int getMtime() {
		return mtime;
	}
	public void setMtime(int mtime) {
		this.mtime = mtime;
	}
	public int getListorder() {
		return listorder;
	}
	public void setListorder(int listorder) {
		this.listorder = listorder;
	}
}
