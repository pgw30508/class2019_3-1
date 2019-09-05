package kr.ac.daelim.uml;

public class Medic extends Unit {

	String Name="Medic";
	int Helath=60;
	
	public void Healing(Character character)
	{
		System.out.println("유닛을 치유한다.");
	}

}
