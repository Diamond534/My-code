package java_practice;
/*
 max£¬
 min£»
 */
public class practice_13min_max {
	public static void main(String[] args) {
		int[] array= {
			1,2,5,6,8,9,4,55,23,22,1,5,66,-1	
		};
		int max=array[0];
		int min=array[0];
		for( int i=1;i<array.length;i++) {
			if(array[i]<min) {
				min=array[i];
			}else {
				max=array[i];
			}
		}
		System.out.println("max:"+max);
		System.out.println("min:"+min);
	}

}
