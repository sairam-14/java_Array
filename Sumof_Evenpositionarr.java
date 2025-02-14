import java.util.Scanner;
class  Sumof_Evenpositionarr
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Nmbr of Arrays");
		int m = sc.nextInt();
		System.out.println("Enter the Nmbr of elemnts");
		int n = sc.nextInt();
        
		int a[][] =new int [m][n];

		for (int i=0;i<=(a.length)-1 ;i++ )
		{
			for (int j=0; j<=(a[i].length)-1; j++)
			{
				System.out.println("Enter the "+(i)+" Array "+(j)+" Elemnt ");
				int value = sc.nextInt();
				 a[i][j]=value;

			}
		}
         System.out.println("**********************************************");

              
		 for (int i=0;(i<=a.length-1) ;i++ )
		 {
			  int sum =0;
			if(i%2==0){

				System.out.print("{ ");

         for (int j =0; j<=(a[i].length-1);j++ )
         {
             sum+=a[i][j];

			
			
         }
		 System.out.print(sum+", ");
		  System.out.println(" }");
		    
             
			}
			
			
		 }
		  

             

			
		
	}
}
