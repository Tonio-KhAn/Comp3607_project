import java.util.*;

public class IndividualStudent {
    private String studentID;
    private int studentYear;
    private String studentSemester;
    private String degree;
    private ArrayList<String> passedCourses;
    private double gpa;
    private String recommendedCourses;

    public IndividualStudent(String studentID, int studentYear, String studentSemester, String degree, double gpa) {
        this.studentID = studentID;
        this.studentYear = studentYear;
        this.studentSemester = studentSemester;
        this.passedCourses = new ArrayList<>();
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

    public String getStudentSemester() {
        return this.studentSemester;
    }

    public boolean compare(String id) {
        return this.studentID.equals(id);
    }

    public ArrayList<String> getPassedCourses() {
        return passedCourses;
    }
}
