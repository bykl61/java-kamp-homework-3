public class Instructor extends User {

    private double coursePrice;
    private double discount;

    public double getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(double coursePrice) {
        this.coursePrice = coursePrice;
    }

    public double getDiscountPrice() {
        return coursePrice -(coursePrice*discount/100);
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
