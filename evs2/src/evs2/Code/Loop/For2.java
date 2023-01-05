package evs2.Code.Loop;

public class For2 {
	static int a;
		public static void main(String []args){
		  m1(3);
		  Loop();
			
	  }
		public static void Loop(){
		   for(int i=5; i>0; i--){
	              for(int j=0;j<i;j++) {
	               System.out.print("* ");
		   }	System.out.println();
	   }
		
  }
		public static int m1(int i){
		  for(int a=0; a<5; a++)
		System.out.println(a);
		return a;
	    
	}


	}
