import static java.lang.System.out;

	public class While {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	
			int i=0;
					
			do {
				if(i%400==0 || i%4==0 && i%100!=0) {
					out.println(i);				
				}
				i++;						
			}while (i<=2100);
		}
}
