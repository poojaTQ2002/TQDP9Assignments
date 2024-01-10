package com.LabAssignments;

public class Nib 
{
  private String materialType;
  private float width;
public Nib() {
	super();
	// TODO Auto-generated constructor stub
}
public Nib(String materialType, float width) {
	super();
	this.materialType = materialType;
	this.width = width;
}
public String getMaterialType() {
	return materialType;
}
public void setMaterialType(String materialType) {
	this.materialType = materialType;
}
public float getWidth() {
	return width;
}
public void setWidth(float width) {
	this.width = width;
}
@Override
public String toString() {
	return "Nib [materialType=" + materialType + ", width=" + width + "]";
}
  
}
