package javatraining.interfaces;



interface CreateInterface{
	void run(); // abstract method
	int sum();
    int speed=10;

}

class  abc{

}


public class ImplementInterface implements CreateInterface {



public static void main(String args[]) { 
	ImplementInterface obj = new ImplementInterface();
	obj.run();

	System.out.println(speed);
	}
	@Override
	public void run() {
		System.out.println("run");
	}

	@Override
	public int sum() {
		return speed;
	}
}
