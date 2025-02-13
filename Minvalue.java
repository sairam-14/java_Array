import java.util.Scanner;
class Minvalue 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int size = sc.nextInt();
		int a[] =new int[size];
		     
		for(int i=0;i<=size-1;i++){
			System.out.println("Enter the values");
			int value =sc.nextInt();
			a[i]=value;
			int min =a[0];
			if(min>a[i]){

				min=a[i];
				
			}
			System.out.println(min);

		}

		

	}
}
