class Stockprices
{
	public static void main(String[] args) 
	{

		int a[]={5,13,9,1,10,12,8};

		int profit=0;
		int buy =0;
		int sell=0;
      
		for (int i=0;i<a.length-1 ;i++ )
		{	
			
        for ( int j=i+1;j<=a.length-1 ;j++ )
        {
                 if(profit<a[j]-a[i])
			{       
				buy=a[i];
				sell=a[j];
				profit=a[j]-a[i];
				
		   }
		}
		}

		
		
		
		   

     System.out.println("Buy:"+ buy);
	 System.out.println("Sell:"+sell);
	 System.out.println(sell-buy);
}
}

