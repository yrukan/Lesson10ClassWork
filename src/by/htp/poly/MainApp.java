package by.htp.poly;

public class MainApp {

	public static void main(String[] args) {
		
		A a = new A();
		Base base = new Base();
		B b = new B();
	
		Base[] values = new Base[]{a, base, b};
		
		for(Base v: values){
			v.doSmth();
			v.work();
		}

	}

}
