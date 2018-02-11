public class MyName {

//New Method
    public static void name(String name){
        System.out.println(name);

        }
        //Static method

        public static void address(String address){
        System.out.println (address);

        }
        //Non static method
         public void dob(String dob){
        System.out.println (dob);

         }





// Main Method can only be one
    public static void main(String[] args) {

      System.out.println("Myra");
      System.out.println("64,Heaven Court, Sudbury HA7 8GD");

      // object name(my name) should be the same in lower case, without word 'new' u cannot creaet new Method (MyName)

      MyName myname = new MyName();
      myname.dob("07/11/2013");


    }

}

