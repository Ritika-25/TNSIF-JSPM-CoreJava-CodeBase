// public class ConditionStatement {
//     public static void main(String[] args) {
//         for(int i=0;i<=100;i++){
//         System.out.print(i+" ");
//         }
//     }
// }

//<----------------------------while loop------------------------->
public class ConditionStatement {

    public static void main(String[] args) {
        int i=9167;
        while(i<=100){
            System.out.print(i+" ");
            i++;
        }
        //<------------------do while--------------------->

        int j=6;
        do{
            System.out.println(j);
            j++;
        }
        while(i<=10);

        //<--------------for each loop------------>

        // int a[]={1,2,3,4,5,6};

        // for (int k:a)
        // {
        //     System.out.print(k+" ");          //\t-->  6 digit space
        // }

        char ch []={'a','b','c','d','e'};
        for(char c:ch){
            System.out.print(c);
        }
    }

}