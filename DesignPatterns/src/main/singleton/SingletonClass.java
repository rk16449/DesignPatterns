package main.singleton;

public class SingletonClass {
	
	private static SingletonClass instance = null;
	
	private SingletonClass(){
	}
	
	public static SingletonClass getInstance(){
		if(instance == null){
			instance = new SingletonClass();
		}
		return SingletonClass.instance;
	}
	
	public String toString(){
		return "This is a singleton object";
	}
}
