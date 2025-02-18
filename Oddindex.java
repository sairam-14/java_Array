import java.util.Scanner;
class Oddindex 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size =sc.nextInt();
		int a[] = new int[size];
		int product =1;
		for(int i=0;i<=size-1;i++){
			System.out.println("Enter the values");
			int value = sc.nextInt();
			a[i]=value;
			if(i%2!=0){
				product=product*a[i];
			}
		}

		System.out.println("product of odd index value is"+product);


			
	}
}
