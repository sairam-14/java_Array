class  Dividearr
{
	public static void main(String[] args) 
	{
		int a[]={4,6,3,2,7,9,1,6};

           int[] arr1 =new int[a.length/2];
		   int[] arr2 = new int [a.length/2];
		     int j=0;
		   for (int i=0;i<=a.length-1 ;i++ )
		   {
			   if (i>=0&&i<=(a.length/2)-1)
			   {
				   arr1[i]=a[i];
                   
				   
				   
			   }else{
				   arr2[j]=a[i];
				  
				    
					 j++;
			   }
		   }
		    System.out.print("arr1[]= {");

			for(int m:arr1){
				System.out.print(m+",");
			}
			System.out.println("}");

			System.out.print("arr2[]= {");

			for(int m:arr2){
				System.out.print(m+",");
			}
			System.out.println("}");



	}
}
