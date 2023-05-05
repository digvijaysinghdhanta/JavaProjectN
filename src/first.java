public class first {
    int x= 17;
    String hello = "I am first Class Object";
    void  concatination(String name) {
        System.out.println(hello+" "+ name);
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        first obj1 = new first();
        obj1.x = 3;
        //changing variable value by creating object
        first obj2 = new first();
        obj2.concatination("Digvijay");
        // we need to create object to access non static method


    }
}
