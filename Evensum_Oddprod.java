import java.util.Scanner;
class Evensum_Oddprod 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size =sc.nextInt();
		int a[] =new int[size];
		int sum=0;
		int prod=1;
		for(int i=0;i<=size-1;i++){
			System.out.println("Enter the values");
			int value =sc.nextInt();
			a[i]=value;
			if(a[i]%2==0){
				sum=sum+a[i];
			}else{
				prod=prod*a[i];
			}
		}
		System.out.println("Even sum is"+sum);
		System.out.println("Odd prod is"+prod);

	}
}
