
public class NextPerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(isPerfectSquare(10));
	}
	
	private static int isPerfectSquare(int n) {
	 int half = n/2;
	 int ret = 0;
	   //special condition or exception
            if(n == 1) {
		return 1;	
		}
	   for (int i= 0; i< half; i++) {
		if(i*i >= n) {
		  ret = i*i;
		     break;
		  }
	   }
	   return ret;
       }
  }
