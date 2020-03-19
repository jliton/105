package This;

import org.testng.annotations.Test;

public class ThisKeyWord {
public ThisKeyWord() {
	// TODO Auto-generated constructor stub
}
//3calling value of a=10
ThisKeyWord(int a){
	this();
	System.out.println(a);
	
}
//2-initiating value of a
//calling cureent class constractor 
@Test
public void AA() {
ThisKeyWord a=new ThisKeyWord(10);

}
}