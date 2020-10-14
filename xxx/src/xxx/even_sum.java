package xxx;

public class even_sum {
	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println("结果是："+sum);
		
		
		int j=1;
		do {
//			j++;//2052
			if(j%2==0) {
				sum+=j;
			}
			System.out.println("结果是："+sum);
		}while(j<=0);
		
		
		int k=1;
		while(k<=100){
			
			if(k%2==0) {
				sum+=k;
			}
			System.out.println("结果是："+sum);
			
		}
		
	}

}
