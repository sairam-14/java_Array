import java.util.Scanner;
class Modifyarray                                           // Example:2,3,1,4,3,1,9,2  2,3,1,4,0,0,9,0
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int size = sc.nextInt();
		int[] a = new int[size];

		for (int i=0;i<=(a.length)-1;i++ )
		{
			System.out.println("Enter the values");
			int value=sc.nextInt();
			a[i]=value;
		}



		for (int i=0;i<(a.length)-1;i++)
		{
		 for (int j=i+1;j<=(a.length)-1;j++) 

		 {
             if(a[i]==a[j]){
                 
				    a[i]=a[j];
					 a[j]=0;
								
			 }

		 }
		}

		for(int m:a){
			System.out.print(m+",");
		}
	}
}
