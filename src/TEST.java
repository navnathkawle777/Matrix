
public class TEST {
	
	public static void main(String[] args) {
		int in=10100;
		
		int b = in + 501;
		
		System.out.println(b );
		String s= String.format("%06d",b);
		System.out.println(s);
		
		String name="navnath";
		int i=1;int dup=0;
		
		do{
			System.out.println("do-----: " + i);
			dup=1;
			if(dup>0){
				System.out.println("dup found");
				name="navnath"+dup;
				i++;
			}
			
			
			
		}while(dup>0 && i<100);
		
		System.out.println(name);
		
	}
	
	

}
