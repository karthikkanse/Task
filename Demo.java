package a7;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=scan.nextInt();
		int arr[] =new int[size];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the element "+(i+1)+" of array");
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			arr[i]=arr[i]%2;
		}
		int countone=0;int countzero=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1) {
				countone++;
			}
			else if(arr[i]==0) {
				countzero++;
			}
		}
		if(countone%2==0&&countzero%2==0) {
			System.out.println("Can be Palindrome");
		}
		else if((countone%2==0&&countzero%2==1)||(countone%2==1&&countzero%2==0)) {
			System.out.println("Can be Palindrome");
		}
		else
			System.out.println("Cannot be Palindrome");
		
	}
}
