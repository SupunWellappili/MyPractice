
class A extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello Supun");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}



class B extends  Thread{
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Good Bye");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}



public class Example04 {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.start();

        B obj2 = new B();
        obj2.start();
    }
}
