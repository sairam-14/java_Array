import java.util.Scanner;
class Targetedvalue 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int size = sc.nextInt();
       
		int a[] = new int[size];
            int sum =0;

			for (int k=0;k<=(a.length)-1 ;k++ )
			{
            System.out.println("Enter the Elements");
			int value = sc.nextInt();
			a[k]=value;
			}

			System.out.println("Enter the target value");
		    int targetvalue = sc.nextInt();
               
			   int point =0;

		for (int i=0;i<(a.length)-1; i++)
		{
			for (int j=i+1;j<=(a.length)-1 ; j++)
			{
               sum=a[i]+a[j];

			   if(sum==targetvalue){

                    point++;
              
			}
			



			}

		}

		 if(point>0){
				System.out.println("  1 occured");
				
			}
			else{
				System.out.println(" 0 occured");



			}
			 
		
		
	}
}
