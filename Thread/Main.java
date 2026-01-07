public class Main {
    public static void main(String args[]){
        MyThread obj1 = new MyThread("T1");
        MyThread obj2 = new MyThread("T2");
        obj1.start();
        obj2.start();
        System.out.println("Hello World");
    }
}
