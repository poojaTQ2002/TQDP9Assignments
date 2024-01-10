package com.Inheritance;
class IPLTeam
{
	public void Play()
	{
		System.out.println("IPL Team is playing");
	}
}
class CSK extends IPLTeam
{   
	public void Play()
	{
		System.out.println("CSK Team is playing");
	}
}
class RCB extends IPLTeam
{
	public void Play()
	{
		System.out.println("RCB Team is playing");
	}
}
public class IPLTeamTest 
{
  public static void main(String[] args) 
  {
	IPLTeam t=new IPLTeam();
	t.Play();
	System.out.println("''''''''''''''''''''''''''''''''''''''''''''");
	CSK csk=new CSK();
	csk.Play();
	System.out.println("''''''''''''''''''''''''''''''''''''''''''''");
	RCB rcb=new RCB();
	rcb.Play();
  }
}
