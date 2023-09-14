package week1.day1;

public class FirstProgram {

	public static void main(String[] args) {
		
		System.out.println("HII KESAV RAJ NARAYAN R B ");
		Car Ferrai=new Car();
		Ferrai.ApplyBreak();
		Ferrai.SoundHorn();
		Ferrai.ChangeGrear();
		Ferrai.Headlighton();
		
		
	}


public static class Car {
	
	public void ApplyBreak() {
		System.out.println("Apply Break");
	}
	
	public void TurnonMusic() {
		System.out.println("Turn on Music");
	}
	
	public void SoundHorn() {
		System.out.println("SounHorn");
	}
	
	public void ChangeGrear() {
		System.out.println("Change Gear");
	}
	
	public void Headlighton() {
		System.out.println("Headlight on");
	}
	
}
	
}
