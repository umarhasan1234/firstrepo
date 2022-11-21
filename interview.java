import java.util.Scanner;

public class Interview{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row");
		int row=sc.nextInt();
		
		
		for(int i=0;i<row;i++) {
			if(i==0) {
				for(int j=0;j<3;j++) {
					if(j==1) {
						System.out.print("1");
					}
					else
					{
						System.out.print(" ");
					}
					
				}
				System.out.println();
				
			}
			else {
				for(int j=0;j<3;j++) {
					if(j==1) {
						System.out.print("1"+" ");
					}
					else {
						System.out.print("2"+" ");
					}
				}
				System.out.println();
			}
			
			
		}
	}
}
