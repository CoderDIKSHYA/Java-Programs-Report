//1)WAP TO CREATE AN ARRAY SIZE OF 5 AND STORE THE VALUE FROM THE USER ?
import java.util.Scanner;
import java.util.Arrays;
class Arr2 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter size : ");
		int arr[]=new int[sc.nextInt()];
		
		for(int i=0;i<arr.length;i++){
			System.out.print("Element "+(i+1)+": ");
			arr[i]=sc.nextInt();
			}
			
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
			}
			
			System.out.println();
			System.out.println(Arrays.toString(arr));//it is static way
	}
}