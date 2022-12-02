package problems.math;

   public class Fibonacci {

    /*
     *
     * write 30 Fibonacci numbers with java
     * 0,1,1,2,3,5,8,13
     *
    */
        static int n1=0,n2=1,n3=0;
        static void fibonacciNumbers(int count){
            if(count>0){
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
                System.out.print(" "+n3);
                fibonacciNumbers(count-1);
            }
        }

    public static void main(String[] args) {

        //run your code here

                int count=30;
                System.out.print(n1+" "+n2);//printing 0 and 1
                fibonacciNumbers(count-2);//n-2 because 2 numbers are already printed
            }
        }


