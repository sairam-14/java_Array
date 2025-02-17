class  Firstright_Secondleft
{
	public static void main(String[] args) 
	{
		char a[] = {'a','b','c','d','e','f','g','h'}; //{d ,a , b, c, f,g,h,e}

		char halflast =  a[(a.((length/2)-1))];
		char half1first = a[(a.(length/2))];

		int j=3;
		for(int i=1;i<(a.length)-1;i++){

			if(i>=a.length/2&&i<(a.length)-1){

				a[i]=a[i+1];

			}else{
				a[j] =a[j-1];
				j--;
			}
		}
		a[0] = halflast;
		a[7] = half1first;
		System.out.print("a [] ={");

		for(char m:a){
			System.out.print(m+",");
		}
		System.out.println("}");


	}
}
