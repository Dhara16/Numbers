public class Numbers {

    int a=5;
    int b=2;
    int ans;

// static  method
    public static void addition (int a ,int b){
        int ans = a+b;
        System.out.println("my addition method "+ans);

    }
    public static void multiplication (int a ,int b){
        int ans = a*b;
        System.out.println("my multiplication method"+ans);

    }
    //non static method
    public void division (int a ,int b){
        int ans = a/b;
        System.out.println("my division method"+ans);

    }
    public void subtraction(int a ,int b){
        int ans = a-b;
        System.out.println("my subtraction method"+ans);
    }

// Main method
    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        numbers.division(6,7);
        numbers.subtraction(3,5);
        numbers.multiplication(3,5);
        numbers.addition(3,5);


    }


    }


