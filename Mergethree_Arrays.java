class Mergethree_Arrays 
{
	public static void main(String[] args) 
	{
		int a[]={1,2,3,4,};
		int b[] ={5,6,7};
		int c[] ={8,9};
		int output[]=new int[a.length+b.length+c.length];
           int j=0;
		   int k=0;
		for (int i=0;i<=output.length-1;i++ )
		{
			if(i<=a.length-1){
			output[i]=a[i];

			}else if(j<=b.length-1){
				output[i]=b[j];
				j++;
			}else{
				output[i]=c[k];
				k++;
			}
		}
		System.out.print("output [] = {");
		for(int s:output){
			System.out.print(s+",");
	}
	System.out.println(" }");
}
}