import java.util.Scanner;
class  Ascending
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size =sc.nextInt();
		int a[] = new int[size];
		
		

		for(int k=0;k<=(a.length)-1;k++){

			System.out.println("Enter the values");
			int value = sc.nextInt();
			a[k] =value;
		}
		
		for(int i=0;i<=(a.length)-1;i++){
			
        for(int j=0;j<(a.length)-1;j++){

			if (a[j]>a[j+1])
			{
				int c=a[j];
			a[j] =a[j+1];
			a[j+1] =c;
			}
		}

			

			
			}
		

		System.out.print("a [] ={");

		for(int m:a){

			System.out.print(m+",");
		}
		System.out.println("}");

          
		





	}
}
