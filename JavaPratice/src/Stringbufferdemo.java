
public class Stringbufferdemo {
	public static void main(String args[])
	{
		StringBuffer sb=new StringBuffer();
		System.out.println("Old capacity:"+sb.capacity());
		sb.append("Hello");
		sb.append("GoodMorning");
		sb.append("GoodEvening");
		System.out.println("New capacity:"+sb.capacity());
	}

}
