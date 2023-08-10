/* Method Overloading - It happens when two methods have same name.
*  At compile Time, It will decide which method to run.*/

public class MethodOverloading {
    public static void main(String[] args) {
        int res = sum(5,8);
        System.out.println(res);


        //fun();

    }
        /*  This will lead to method overloading

        static void fun(){
            System.out.println("Hello");
        }
        static void fun(){
        System.out.println("Hello");
        }

        */

        // Having Same method name with different arguments

        static int sum(int a, int b){   // Taking two arguments
            return a+b;
        }

         static int sum(int a, int b, int c){   //Taking Three arguments
              return a+b;
         }

    }
