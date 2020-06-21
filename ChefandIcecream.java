/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;



/* Name of the class has to be "Main" only if the class is public. */
public class ChefandIcecream
{
	public static void main (String[] args) 
	{
		// your code goes here
		Scanner scanner = new Scanner(System.in);
		int t = 0;
		try {
			t = scanner.nextInt();
		}catch (Exception e) {}
			for(int i=0; i<t; i++) {
				String s = "", arr[];
				int n=0;
				try {
				n = scanner.nextInt();
				scanner.nextLine();
				s = scanner.nextLine();
				}catch (Exception e) {}
				arr = s.split(" ");
				int ar[] = new int[arr.length];
				for(int j=0; j<ar.length; j++)
					ar[j] = Integer.parseInt(arr[j]);
				int flag=0, c5=0, c10=0, c15=0;
				for(int j=0; j<n; j++) {
					switch (ar[j]) {
					case 5:
						c5++;
						break;
					case 10:
						if(c5 > 0) {
							c10++;
							c5--;
						}
						else
							flag = 1;
						break;
					case 15:
						if(c10>0) {
							c10--;
							c15++;
						}
						else if (c5>1) {
							c5-=2;
							c15++;
						}
						else
							flag = 1;
						break;
					}
					if(flag==1) {
						System.out.println("NO");
						break;
					}
				}
				if(flag==0) {
					System.out.println("YES");
				}
			}
	}
}
