public class InstructorManager extends UserManager{

    public void broadcast(Instructor instructor){
        System.out.println(instructor.getUsername()+ ": "+instructor.getCourse() + " kursu yayınladı");
    }
    public void price(Instructor instructor){
        System.out.println(instructor.getCourse()+" kursu fiyatı: "+instructor.getCoursePrice());
    }
    public void discount(Instructor instructor){
        System.out.println(instructor.getCourse()+" kursu indirimli fiyatı: "+instructor.getDiscountPrice());
    }

}
