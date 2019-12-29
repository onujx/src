public class test1 {
     String m1() {
         m4();
         return "hi";
     }

     String m2() {
         m1();
       return "it's me";
     }

     String m3() {
         m2();
         return "Thank you.";
     }

     void m4() {
         System.out.println("end");
     }
}

class TestExecute {
    public static void main(String[] args) {
        test1 t1 = new test1();
        t1.m3();
    }
}