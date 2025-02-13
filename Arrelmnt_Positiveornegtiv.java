import java.util.Scanner;
class  Arrelmnt_Positiveornegtiv
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
		for (int i=0;i<=(a.length)-1 ;i++ )

		{
			System.out.print("{ ");
			for (int j=0;j<=(a[i].length)-1 ;j++ )
			{

				if((a[i][j])>0){
					System.out.print(a[i][j]+"is positive  ,");
				}else{
					System.out.print(a[i][j]+"is negative  ,");
				}

			}

			System.out.println("} ");
			
		}
	}
}
