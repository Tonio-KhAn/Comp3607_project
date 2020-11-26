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

    public CourseList getElectives(String s) {
        CourseList temp = new CourseList();
        for (int x = 0; x < electiveCourses.getSize(); x = x + 1) {
            if (electiveCourses.get(x).inSemester(s)) {
                temp.addCourse(electiveCourses.get(x));
            }
        }
        return temp;

    }

    public CourseList getCore(String s) {
        CourseList temp = new CourseList();
        for (int x = 0; x < coreCourses.getSize(); x = x + 1) {
            if (coreCourses.get(x).inSemester(s)) {
                temp.addCourse(coreCourses.get(x));
            }
        }
        return temp;
    }

    public CourseList getFoundations(String s) {
        CourseList temp = new CourseList();
        for (int x = 0; x < foundationCourses.getSize(); x = x + 1) {
            if (foundationCourses.get(x).inSemester(s)) {
                temp.addCourse(foundationCourses.get(x));
            }
        }
        return temp;

    }

    public Boolean compare(String name) {
        return this.degreeName.equals(name);
    }

}
