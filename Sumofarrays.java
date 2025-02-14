class Sumofarrays 
{
	public static void main(String[] args) 
	{
		int a[] ={2,6,5,4,1};
		int b[] ={2,9,-4,-1,-3};

		int c[] = new int[a.length];
		for(int i=0;i<=(c.length)-1;i++){
			c[i]=a[i]+b[i];
	}
	System.out.print("result[] = {");

	for(int d :c){
		System.out.print(d+",");
	}
	System.out.println("}");

}
}
