import java.util.*;

public class InformationTechnology implements Degree {
    private CourseList electiveCourses;
    private CourseList coreCourses;
    private CourseList foundationCourses;
    private String degreeName;

    public InformationTechnology() {
        String courseName = "Introduction to Computing Concepts";
        String sem = "1";
        String description = "This course presents an overview of computing technology and the field of computer science. Discussion topics will include the organisation of modern computers, operating systems, algorithms, programming languages and database systems.";
        String code = "COMP 1600";
        ArrayList<String> prereq = new ArrayList<String>();
        prereq.add("none");
        IndividualCourse newcourse = new IndividualCourse(courseName, prereq, sem, description, code);
        coreCourses.addCourse(newcourse);
    }

    public CourseList getElectives() {

    }

    public CourseList getCore() {
    }

    public CourseList getFoundations() {

    }

    public newCourse(){

    }

}
