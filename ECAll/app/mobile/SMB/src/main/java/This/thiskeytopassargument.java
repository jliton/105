package This;

class thiskeytopassargument{  
	  void m(thiskeytopassargument obj){  
	  System.out.println("method is invoked");  
	  }  
	  void p(){  
	  m(this);  
	  }  
	  public static void main(String args[]){  
	   thiskeytopassargument s1 = new thiskeytopassargument();  
	  s1.p();   
	  }  
	}  
