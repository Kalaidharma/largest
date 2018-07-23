import java.util.Arrays;
import java.util.Scanner;
public class largestnumber {
 public static void main(String[] args){
	 Scanner sc=new Scanner(System.in);
	 int n;
	 n=sc.nextInt();
	 int arr[]=new int[n];
	 for(int i=0;i<n;i++){
		 arr[i]=sc.nextInt();
	 }
	 Arrays.sort(arr);
	 /*for(int i=0;i<n;i++){
		 System.out.print(arr[i]);
	 }*/
	 for(int j=n-1;j>=0;j--){
		 System.out.print(arr[j]);
	 }
		 //for(int j=0;j<n;j++)
 }
}
