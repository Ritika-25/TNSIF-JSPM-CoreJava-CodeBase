public class decisionMakingStatement {

    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=5;

        System.out.println("largest num is");

        if(a>b)
        {
            if(a>c){
                System.out.println("a is largest");
            }
            else{
                System.out.println("c is largest");
            }
        }
        else{
            System.out.println("b is largest");
        }
    }
}