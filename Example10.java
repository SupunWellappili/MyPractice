public class Example10 {
    public static void main(String[] args) {
        Animal animal = new dog();
        animal.run();
    }
}

class Animal {
    void run() {
        System.out.println("Run of Animal");
    }
}

class dog extends Animal {
    void run() {
        System.out.println("Run of Dog");
    }
}
