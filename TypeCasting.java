public class TypeCasting {
    public static void main(String[] args) {
        //widening //implicit type casting

        byte b=10;
        int i=b;
        System.out.println(i);

        float f=22.14f;
        double d=f;
        System.out.println(d);

        char ch='a';
        int i1=ch;
        System.out.println(i1);


        //narrowing //explicit type casting

        double f1=10.52d;
        long l1=(long) f1;
        System.out.println(l1);

        int i2=130;
        byte b1=(byte)i2;
        System.out.println(b1);

    }
}







