package com.LabAssignments;

public class Refill 
{
	 private  String inkColor;
	 private int length;
	 private Nib nib;
	public Refill() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Refill(String inkColor, int length, Nib nib) {
		super();
		this.inkColor = inkColor;
		this.length = length;
		this.nib = nib;
	}
	public String getInkColor() {
		return inkColor;
	}
	public void setInkColor(String inkColor) {
		this.inkColor = inkColor;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public Nib getNib() {
		return nib;
	}
	public void setNib(Nib nib) {
		this.nib = nib;
	}
	@Override
	public String toString() {
		return "Refill [inkColor=" + inkColor + ", length=" + length + ", nib=" + nib + "]";
	}
	 

}
