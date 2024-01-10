package com.wrapper;

public class BoxingUnboxingExample {

	public static void main(String[] args) {

		// Boxing:
		// primitive to wrapper
		//int
		int num = 23;

		Integer i1 = new Integer(45);
		Integer i2 = 78;

		Integer j = Integer.valueOf(num);
		Integer k = num;
		
		//float
		Float f1=new Float(10);
		Float f2 = 20f;
		Float f=Float.valueOf(23);
		
		//double
		Double d1=new Double(30);
		Double d2=45d;
		Double d=Double.valueOf(55);
		
		//short
		Short s1=new Short((short) 77);
		Short s2=40;
		Short s=Short.valueOf((short) 55);
		
		//long
		Long l1=new Long(79);
		Long l2=(long) 55;
		Long l=Long.valueOf(90);
		
		//byte
		Byte b1=new Byte((byte) 13);
		Byte b2=66;
		Byte b=Byte.valueOf((byte) 32);
		
		
		

		System.out.println(i1 + " " + i2 + " " + j + " " + k+" "+f1+" "+f2+" "+f+" "+d1+" "+d2+" "+d+" "+s1+" "+s2+" "+s+" "+l1+" "+l2+" "+l+" "+b1+" "+b2+" "+b);

		// Unboxing
		// wrapper to primtive

		Float fl1 = new Float(78.3f);

		float fl2 = f1.floatValue();
        float f3 = fl1;//auto
		
		Integer int1=new Integer(15);
		int int2=int1.intValue();
		int int3=int1;
		
		Double db=new Double(15);
		double db1=db.doubleValue();
		double db2=db1;
		
		Long lo=new Long(56);
		long lo1=lo.longValue();
		double lo2=lo1;
		
		Short sh=new Short((short) 55);
		short sh1=sh.shortValue();
		short sh2=sh1;
		
		Byte bt=new Byte((byte) 11);
		byte bt1=bt.byteValue();
		byte bt2=bt1;
		
		System.out.println(fl1+" "+fl2+ " " +f3+" "+int1+" "+int2+" "+int3+" "+db+" "+db1+" "+db2+" "+lo+" "+lo1+" "+lo2+" "+sh+" "+sh1+" "+sh2+" "+bt+" "+bt1+" "+bt2);

	}

}

