package xxx;

public class java_for {
	public static void main(String[] args) {
		int[] number= {
				10,20,30,40
		};
		for(int x:number) {
			System.out.print(x);
			System.out.print("\t");
			System.out.print("\n");
			
		}
		
		String[] names= {
			"james","larry","Tom","lacy"	
		};
		for(String name:names) {
			System.out.print(name);
			System.out.print("\t");
			System.out.print("\n");
			
		}
		
		
		int[] number1= {
				1,2,3,4,5,6
		};
		for(int x:number1) {
			if(x==30) {
				break;
			};
			System.out.print(x);
			System.out.print("\t");
//			System.out.print("\n===========\n");
		}
		
		
		int[] number2= {
			15,20,25,30,35,40	
		};
		for(int y:number2) {
			if(y==30) {
				continue;
			};
			
			System.out.print(y);
			System.out.print("\t");
			
		}
		System.out.print("\n=============\n");
		
		double x1=11.6359999;
		double y1=2.76;
		System.out.printf("e的值为 %.6f%n",Math.E);
		System.out.printf("exp(%.3f)为%.3f%n",x1,Math.exp(x1));
		System.out.printf("exp(%.3f)为%.3f%n",y1,Math.exp(y1));
//		System.out.printf("log(%8f)为%.6f%n",x1,Math.log(x1));
		System.out.printf("pow(%3f,3f)为%.3f%n",x1,y1,Math.pow(x1, y1));
		System.out.printf("sqrt(%.3)为%.3f%n",x1,Math.sqrt(x1));
		
	}

}
