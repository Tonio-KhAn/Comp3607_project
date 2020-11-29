import java.util.*;

public class IndividualStudent {
    private String studentID;
    private String studentName;
    private int studentYear;
    private String degree;
    private ArrayList<String> passedCourses;
    private double gpa;
    private String recommendedCourses;

    public IndividualStudent(String studentID, String studentName, int studentYear, ArrayList<String> passedCourses,
            String degree, double gpa) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentYear = studentYear;
        this.passedCourses = passedCourses;
        this.recommendedCourses = "";
        this.gpa = gpa;
        this.degree = degree;
    }

    public String getDegree() {
        return this.degree;
    }

    public void addPassedCourse(String courseCode) {
        this.passedCourses.add(courseCode);
    }

    public double getGpa() {
        return this.gpa;
    }

    public void setRecommendedCourses(String recommendedCourses) {
        this.recommendedCourses = recommendedCourses;
    }

    public String getRecommendedCourses() {
        return this.recommendedCourses;
    }

    public int getStudentYear() {
        return this.studentYear;
    }

    public boolean compare(String id) {
        return this.studentID.equals(id);
    }

    public ArrayList<String> getPassedCourses() {
        return passedCourses;
    }

    public String toString() {
        return this.studentID;
    }
}
