
public class ExplicitlyTypeConversionExample {

	public static void main(String[] args) {
		byte b=2;
		short s=3;
		int i=256;
		long l=5492836782l;
		float f=10.4f;
		double d=11.5;
		System.out.println("short to byte -->"+(byte)s);
		System.out.println("int to short -->"+(short)i);
		System.out.println("long to int -->"+(int)l);
		System.out.println("float to int -->"+(int)f);
		System.out.println("double to float -->"+(float)d);
	}

}
