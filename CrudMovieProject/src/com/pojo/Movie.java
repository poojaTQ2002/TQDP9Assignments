package com.pojo;

public class Movie {

	private int mid;
	private String mname;
	private double mprice;
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movie(int mid, String mname, double mprice) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.mprice = mprice;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public double getMprice() {
		return mprice;
	}
	public void setMprice(double mprice) {
		this.mprice = mprice;
	}
	@Override
	public String toString() {
		return "Movie [mid=" + mid + ", mname=" + mname + ", mprice=" + mprice + "]";
	}
	
	
}

