import java.util.*;
import java.io.*;

public class Degree {
    private CourseList electiveCourses;
    private CourseList coreCourses;
    private CourseList foundationCourses;
    private String degreeName;

    public Degree(String core, String elective, String foundation, String name) {
        this.degreeName = name;
        this.coreCourses = courseAdder(core);
        this.electiveCourses = courseAdder(elective);
        this.foundationCourses = courseAdder(foundation);
    }

    public CourseList sendcore() {
        return this.coreCourses;
    }

    public CourseList getElectives(String s, int year) {
        CourseList temp = new CourseList();
        for (int x = 0; x < electiveCourses.getSize(); x = x + 1) {
            if (electiveCourses.get(x).inSemester(s) && electiveCourses.get(x).inYear(year)) {
                temp.addCourse(electiveCourses.get(x));
            }
        }
        return temp;

    }

    public CourseList getCore(String s, int year) {
        CourseList temp = new CourseList();

        for (int x = 0; x < coreCourses.getSize(); x = x + 1) {
            if (coreCourses.get(x).inSemester(s) && coreCourses.get(x).inYear(year)) {
                temp.addCourse(coreCourses.get(x));
            }
        }
        return temp;
    }

    public CourseList getFoundations(String s, int year) {
        CourseList temp = new CourseList();
        for (int x = 0; x < foundationCourses.getSize(); x = x + 1) {
            if (foundationCourses.get(x).inSemester(s)) {
                temp.addCourse(foundationCourses.get(x));
            }
        }
        return temp;

    }

    public boolean compare(String name) {
        return this.degreeName.equals(name);
    }

    public CourseList courseAdder(String name) {
        IndividualCourse newcourse;
        CourseList temp = new CourseList();
        try {
            File compFile = new File(name + ".txt");
            Scanner input = new Scanner(compFile);
            input.useDelimiter("\\?");

            while (input.hasNext()) {
                input.next();
                String courseName = input.next();
                String semester = input.next();
                String description = input.next();
                String courseCode = input.next();
                ArrayList<String> prereq = new ArrayList<String>();
                String tempPrereq = input.next();
                while (!tempPrereq.equals("$")) {
                    prereq.add(tempPrereq);
                    tempPrereq = input.next();
                }
                int year = input.nextInt();
                newcourse = new IndividualCourse(courseName, prereq, semester, description, courseCode, year);
                temp.addCourse(newcourse);
            }
            input.close();
        } catch (FileNotFoundException e) {
            return temp;
        }
        return temp;
    }

    public String teString() {
        return degreeName;
    }

}
