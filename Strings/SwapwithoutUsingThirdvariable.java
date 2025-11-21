package Strings;

public class SwapwithoutUsingThirdvariable {

	public static void main(String[] args) {

        String a="java";
        String b="hello";
        a=a+b;
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());
        System.out.println(a);
		System.out.println(b);

	}

}
