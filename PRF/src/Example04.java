
class A implements Runnable {
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



class B implements  Runnable{
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
        Thread ob1 = new Thread(obj1);
        ob1.start();

        B obj2 = new B();
        Thread ob2 = new Thread(obj2);
        ob2.start();
    }
}
