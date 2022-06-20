package com.synisys.BigO;

public class Examples {

    /*
     * Time complexity of O1 function is O(1)
     * */
    private void O1() {
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    /*
     * Time complexity of On function is O(n) because it will print "Hello World" n times.
     * */
    private void On(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Hello World!");
        }
    }

    /*
    * Time complexity of On2 function is O(n^2) because it will print "Hello World" n^2 times
    * */
    private void On2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Hello World!");
            }
        }
    }

    /*
    * Time complexity of Ologn function is O(logn) because it will print "Hello World" log2 times.
    * */
    private void Ologn(int n){
        for (int i = 0; i < n; i *= 2){
            System.out.println("Hello World!");
        }
    }

    /*
    * Time complexity of O2n_Fibonacci function is O(2^n) because
    * */
    private int O2n_Fibonacci(int n)  {
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return O2n_Fibonacci(n - 1) + O2n_Fibonacci(n - 2);
    }
}
