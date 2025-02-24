import java.util.Scanner;
class Evenpreced_Oddsucseed 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size =sc.nextInt();
		int a[] = new int[size];
		for(int i=0;i<=size-1;i++){
			System.out.println("Enter the value");
			int value = sc.nextInt();
			a[i]=value;
		}
           

		for(int i=0;i<=(a.length)-1;i++){

			if(a[i]%2==0){
                          
               a[i]--;
	
	          }else
			{
				 a[i]++;
                      }
               }

	   System.out.print("a [] = {");
		for(int j:a){
			System.out.print(j+", ");

			
		}
		System.out.println("}");

           
	}
}
