import java.util.Scanner;
class Firsthalfasnd_Secondhalfdesnd
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

		for(int i=0;i<=(((a.length)/2)-1);i++){
             for( int j=0;j<(((a.length)/2)-1);j++){

				 if(a[j]>a[j+1]){
					int c= a[j];
					a[j] =a[j+1];
					a[j+1] =c;
				 }
		
			}
		}
		
			 for(int i = (a.length/2);i<=(a.length)-1;i++){
				 for(int j= (a.length/2);j<(a.length)-1;j++){

					 if(a[j]<a[j+1]){
						 int c =a[j];
						 a[j] =a[j+1];
						 a[j+1]=c;
					 }
				 }
			 }

				 System.out.print("a[]={");

				 for(int m:a){
					 System.out.print(m+",");
				 }
				 System.out.println("}");


                  


			

	}
}
