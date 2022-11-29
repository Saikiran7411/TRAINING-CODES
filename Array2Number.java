package arraysexmp;

public class Array2Number {
	public static void main(String[] args) {
		int arr[]= {5,8,1};
		int res=0;
		for (int i = 0; i < arr.length; i++) {
			res=(res*10)+arr[i];
			
		}
		System.out.println(res);
	}

}
