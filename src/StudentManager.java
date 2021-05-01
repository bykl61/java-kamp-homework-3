public class StudentManager extends UserManager{
    public void registerToCourse(Student student){
        System.out.println(student.getUsername()+ ": "+student.getCourse() + " kursuna kayıt oldu");
    }
    public void pay(Student student){
        System.out.println(student.getCourse() + " kursuna: "+student.getPay()+"₺ ödedi");
    }
    public void rate(Student student){
        System.out.println(student.getCourse() + " kursuna: "+student.getRate()+" puan verdi");
    }
    public void comment(Student student){
        System.out.println(student.getCourse() + " kursuna: \""+student.getComment()+"\" yorumunu yaptı");
    }
}
