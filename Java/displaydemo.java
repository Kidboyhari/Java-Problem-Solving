package threading.demo;
public class MyThread extends Thread{
    MyThread(String name){
        setName(name);
    }
}
public void run(){
    try {
        System.out.println(getName());
        Thread.sleep(5000);
    System.out.println(getName() + " finished ")
    } catch (Exception e) {
        System.out.println(e);
    }
}