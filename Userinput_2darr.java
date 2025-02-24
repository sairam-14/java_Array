import java.util.Scanner;
class  Userinput_2darr
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nmbr of sub Arrays");
		int m = sc.nextInt();
		System.out.println("Enter the nmbr of elemnts");
		int n = sc.nextInt();
		char a[][]=new char[m][n];

		for (int i=0;i<=(a.length-1) ;i++ )
		{
			for (int j=0;j<=(a[i].length-1) ;j++ )
			{
				System.out.println("Enter the "+(i)+" Array "+(j)+" Elemnt ");

				char value = sc.next().charAt(0);

				a[i][j]=value;
			}
		}

		for (int i=0; i<=(a.length-1); i++)
		{
			System.out.print("{ ");
			for (int j=0;j<=(a[i].length)-1 ;j++ )
			{
				System.out.print(a[i][j]+",");
			}
			System.out.println(" }");
		}
		



	}
}
