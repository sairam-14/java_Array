import java.util.Scanner;
class  Maxvalue2D
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		// Take No of Arrays User want
		System.out.println("Enter the nmbr of subarray");
		int m = sc.nextInt();

		// Take the nmbr of elmts for user want
		System.out.println("Enter the nmbr of element");
		int n =sc.nextInt();
          
		 //Declaring the Array With uesr Given Sizes
		int a[][] = new int [m][n];                    // int a[][] = new int[no of arrays][no of elmts in arr]

         //Adding the elemnts to Given 2D Array
		for (int i=0;i<=(a.length)-1 ; i++)             //no of arrays iteration
		{
          for (int j=0;j<=(a[i].length)-1 ;j++ )        // adding elemnts to each array iteration
          {
			  System.out.println("Enter the "+(i+1)+"Array"+(j+1)+"elelmnt");

			  int value = sc.nextInt();

			  a[i][j] = value;

          }
		}

		  System.out.println("*******************************************/n");
                 
				
				// Iterate Each Sub Array To Find Max Value In Each Array
				
		  for (int i=0;i<=(a.length)-1 ;i++ )
		  {         
			  int max = a[i][0];
			  System.out.print(" {");
			  for (int j =0;j<=(a[i].length-1) ; j++)
			  {
                
				   if(max<a[i][j]){

					   max=a[i][j];
                
					   
				   }
                  

			  }
			  System.out.print("Max of "+(i+1)  + "Array is ="+max);
			  System.out.println("}");

		  }
			   
           
           }

		}

	

