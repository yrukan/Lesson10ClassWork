package by.htp.poly;

public class Base implements Worker{

	public void doSmth(){
		System.out.println("Base");
	}
	
	@Override
	public void work(){
		System.out.println("Base work");
	}
}
