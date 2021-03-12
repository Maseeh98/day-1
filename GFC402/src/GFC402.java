
class GFC402 {
	  static int x=1;
	  void m1(int i) {x++; i++;}
	  public static void main (String[] args) {
	    int y=3; m1(y);
	    System.out.println(x + "," + y);
	}}