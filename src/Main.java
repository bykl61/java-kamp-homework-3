public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setId(1);
        student.setUsername("Mehmet");
        student.setPassword("123");
        student.setEmail("abc@gmail.com");
        student.setCourse("Java");
        student.setPay(1350);
        student.setRate("5");
        student.setComment("Elinize Sağlık");

        Instructor instructor = new Instructor();
        instructor.setId(1);
        instructor.setUsername("Engin");
        instructor.setPassword("123");
        instructor.setCourse("Java");
        instructor.setCoursePrice(1500);
        instructor.setDiscount(10);

        UserManager userManager = new UserManager();
        userManager.register(student);
        userManager.login(student);


        System.out.println();

        userManager.register(instructor);
        userManager.login(instructor);


        System.out.println();

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.broadcast(instructor);
        instructorManager.price(instructor);
        instructorManager.discount(instructor);

        System.out.println();

        StudentManager studentManager = new StudentManager();
        studentManager.registerToCourse(student);
        studentManager.pay(student);
        studentManager.rate(student);
        studentManager.comment(student);

        System.out.println();

        userManager.logout(student);
        userManager.logout(instructor);


    }
}
