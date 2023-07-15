class A {
    public void say() {
        for (int i = 0; i <10; i++) {
            System.out.println("Hello Supun");
        }
    }
}


class B {
    public void say() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Good Bye");
        }
    }
}

    public class Example04 {
        public static void main(String[] args) {
            A obj1 = new A();
            obj1.say();

            B obj2 = new B();
            obj2.say();

        }
    }
