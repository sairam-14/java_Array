import java.util.Scanner;
class Largestnegative 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int size =sc.nextInt();
		int a[] =new int[size];
		  
		  int large = a[0];
         
		for(int i=0;i<=size-1;i++){
			System.out.println("Enter the negative value");
			int value = sc.nextInt();
			a[i]=value;

			if(large>a[i]){
				
				large=a[i];
				}
			 
				
			}
			System.out.println("Largest Negative Value is:"+large);
			
		
		
	}
}
