class Student {
    private String name;
    private int age;
    private double marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
}

class Example01 {
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.setName("Supun chandana");
        std1.setAge(22);
        std1.setMarks(76.56);
        System.out.println(std1.getName());
        System.out.println(std1.getAge());
        System.out.println(std1.getMarks());
        System.out.println();


        Student std2 = new Student();
        std2.setName("Hasanthi Kumuditha");
        std2.setAge(24);
        std2.setMarks(89.78);
        System.out.println(std2.getName());
        System.out.println(std2.getAge());
        System.out.println(std2.getMarks());
    }
}