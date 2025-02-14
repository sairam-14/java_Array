import java.util.Scanner;
class Duplicatevalue 
{
	public static void main(String[] args) 
	{

		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter the size");
		int size =sc.nextInt();
		int a[] = new int[size];

		for(int i=0;i<=(a.length)-1;i++){

			System.out.println("Enter the value");
			int value = sc.nextInt();
			a[i]=value;
		}

		//int a[] ={9,7,6,4,3,9,1,7};
             
			 
		for(int i =0;i<(a.length)-1;i++){
         for(int j=i+1;j<=(a.length)-1;j++){
                
               
			if(a[i]==a[j]){

				System.out.print(a[i]+" ,");
				
				break;
				
			}
			

		}
		}

	}
}
