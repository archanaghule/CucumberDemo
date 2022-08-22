package arrays.com;

public class FibbnoicsSeries {

	public static void main(String[] args) {
		
		// 0, 1,1,2,3,5,8,13,21,34
		int count=10,f1=0,f2=1,f3;
        
        System.out.print(f1+" "+f2+" ");
        
        for(int i=2;i<count;i++)
        {
        	f3 = f1+f2;
        	System.out.print(f3+ " ");
        	f2=f3;
        	f1=f2;
        }
        
      
	}

}
