import java.util.*;

public class IndividualCourse {
    private String courseName;
    private ArrayList<String> prerequisits;
    private String semester;
    private String description;
    private String courseCode;
    private int year;

    public IndividualCourse(String name, ArrayList<String> prerequisits, String semester, String description,
            String courseCode, int year) {
        this.courseName = name;
        this.prerequisits = prerequisits;
        this.semester = semester;
        this.description = description;
        this.courseCode = courseCode;
        this.year = year;

    }

    public boolean inSemester(String s) {
        if (this.semester.equals("1 and 2")) {
            return true;
        }
        return this.semester.equals(s);
    }

    public boolean inYear(int year) {
        if (this.year <= year) {
            return true;
        }
        return false;
    }

    public boolean hasPrerequisits(ArrayList<String> passedCourses) {
        if (prerequisits.get(0).equals("none")) {
            return true;
        }
        for (int x = 0; x < prerequisits.size(); X = x + 1) {
            for (int y = 0; y < passedCourses.size(); y = y + 1) {
                if (passedCourses.get(y).equals(prerequisits.get(x))) {
                    return true;
                }
            }
        }
        return false;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String courseToString() {
        return courseCode + "  " + courseName;
    }

    @Override
    public String toString() {
        String text;
        text = courseCode + "\n" + courseName + "\nSEMESTER" + semester + "\nPRE-REQUISITES: " + prerequisits
                + "\nCOURSE DESCRIPTION \n" + description;
        return text;
    }

}
