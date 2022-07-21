package Operators_01;

public class Arithmetic_03 {

    public static void main(String[] args)
    {
        int a = 20;
        int b = 50;
        float add, sub, mul,div, mod, inc1, inc2,  dec1  ,dec2;
        inc1  = a++;
        //inc2 = --a;
        add = a +b;
        dec1 = --a;
        sub = a-b;
        dec2= b--;

        mul = a*b;
        inc2 = ++b;
        div = b/a;
        mod = b%a;
        // dec1 = b--;
        //dec2 = ++b;
        System.out.println("Value of a = "+ a);
        System.out.println("Value of b = "+ b);
        System.out.println("a+b = " + add);
        System.out.println("a-b = " + sub);
        System.out.println("a*b = "+ mul);
        System.out.println("b /a = " + div);
        System.out.println("b % a = " + mod);

        //System.out.println(dec1);


        // System.out.println();
    }
}
