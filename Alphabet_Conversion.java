import java.util.Scanner;
class Alphabet_Conversion
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size = sc.nextInt();
		char ch[] = new char[size];

		//Adding values to the Array from user input
		for(int i=0;i<=size-1;i++){
			System.out.println("Enter the Alphabet");
			char value = sc.next().charAt(0);
			ch[i]=value;

			
		}
          
		  //Printing The Array Before converision of alphabets
		System.out.print("ch []={");
         
		 for(char j :ch){
			System.out.print(j+",");
		}
		System.out.println("}");


    //Printing the Array  After Alphabet conversion
		System.out.print("j [] ={");
          
		
         for(char j:ch){      
			if(j>='A'&&j<='Z'){
				j = (char)(j+32);
				
				
			}else if(j>='a'&&j<='z'){
				j=(char)(j-32);
				

			}else{
				System.out.println("It is not a alphabet");
			}
			System.out.print(j+",");
		 }
		 System.out.println("}");		
	}
}
