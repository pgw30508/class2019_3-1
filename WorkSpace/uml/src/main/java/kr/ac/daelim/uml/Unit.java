package kr.ac.daelim.uml;

public class Unit {
	
	public String Name;
	public int Health;
	
	public void move() 
	{
		
		System.out.println("유닛이동");
	}
	public void UnderAttack(Character character)
	{
		System.out.println("유닛이 공격받는다");
	}

	
}
