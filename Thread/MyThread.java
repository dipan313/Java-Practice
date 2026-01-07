public class MyThread extends Thread{
    String name;
    MyThread(String name){
        this.name = name;
    }
    int n=10;
    public void run(){
        for (int i=1; i<=n; i++){
            System.out.println(name+":"+i);
        }
    };
}
