import java.util.*;
import java.io.*;

public class InformationTechnology implements Degree {
    private CourseList electiveCourses;
    private CourseList coreCourses;
    private CourseList foundationCourses;
    private String degreeName;

    public InformationTechnology() {
        try {
            File compFile = new File("InformationTechnologySpecialCourses.txt");
            Scanner input = new Scanner(compFile);
            input.useDelimiter("?");

            while (input.hasNext()) {
                String courseName = input.next();
                String semester = input.next();
                String description = input.next();
                String courseCode = input.next();
                int year = input.nextInt();
                ArrayList<String> prereq = new ArrayList<String>();
                prereq.add(input.next());
                IndividualCourse newcourse = new IndividualCourse(courseName, prereq, semester, description, courseCode,
                        year);
                coreCourses.addCourse(newcourse);
            }
            input.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

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
            if (coreCourses.get(x).inSemester(s) && electiveCourses.get(x).inYear(year)) {
                temp.addCourse(coreCourses.get(x));
            }
        }
        return temp;
    }

    public CourseList getFoundations(String s, int year) {
        CourseList temp = new CourseList();
        for (int x = 0; x < foundationCourses.getSize(); x = x + 1) {
            if (foundationCourses.get(x).inSemester(s) && electiveCourses.get(x).inYear(year)) {
                temp.addCourse(foundationCourses.get(x));
            }
        }
        return temp;

    }

    public boolean compare(String name) {
        return this.degreeName.equals(name);
    }

}
