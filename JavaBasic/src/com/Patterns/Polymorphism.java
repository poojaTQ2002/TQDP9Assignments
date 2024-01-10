package com.Patterns;
public class Polymorphism 
{  
    public int add(int a, int b) 
    {  
        return a + b;  
    }  
    public double add(double a, double b) 
    {  
        return a + b;  
    } 

    public static void main(String[] args) 
    {  
    	Polymorphism calc = new Polymorphism();  
        int sumint = calc.add(5, 10);  
        System.out.println(sumint);  
        double sumdouble = calc.add(5, 3);  
        System.out.println(sumdouble);  
    }  
}  
