
public class StringBuilderDemo {
public static void main(String[] args) {
	StringBuilder sb= new StringBuilder("IBM");
	sb.append(",Banglaore");
	System.out.println(sb);
	System.out.println(sb.indexOf("B"));
	System.out.println(sb.lastIndexOf("B"));
	String str = new String("IBM,Bangalore");
	System.out.println( str= sb.toString());
	
	sb.append(str);
	System.out.println(sb);
	System.out.println(sb.substring(3));
}
}