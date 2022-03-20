public class SoftwareCourses {
    public  SoftwareCourses(){
        System.out.println("course entered");
    }
    public SoftwareCourses(String courseName,int courseId,String courseInfo){
        this();
        this.courseName = courseName;
        this.courseId = courseId;
        this.courseInfo = courseInfo;
    }
    String courseName;
    int courseId;
    String courseInfo;

}
