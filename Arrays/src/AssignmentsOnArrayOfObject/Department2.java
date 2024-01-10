package AssignmentsOnArrayOfObject;

public class Department2
{
   private int did;
   private String dname;
   Department2()
   {
	   
   }
public Department2(int did, String dname) {
	super();
	this.did = did;
	this.dname = dname;
}
public int getDid() {
	return did;
}
public void setDid(int did) {
	this.did = did;
}
public String getDname() {
	return dname;
}
public void setDname(String dname) {
	this.dname = dname;
}
@Override
public String toString() {
	return "Department [did=" + did + ", dname=" + dname + "]";
}

}
