public class C2_12 {
    public static Student stu = new Student(97001, "Lin Lin", 'F', 19);

    public static void main(String[] args) {
        System.out.printf("%7d%20s%3c%3d", stu.num, stu.name, stu.sex, stu.age);
    }
}
