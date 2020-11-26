import java.util.*;

public class IndividualCourse {
    private String courseName;
    private ArrayList<String> prerequisits;
    private String semester;
    private String description;
    private String courseCode;

    public IndividualCourse(String name, ArrayList<String> prerequisits, String semester, String description,
            String courseCode) {
        this.courseName = name;
        this.prerequisits = prerequisits;
        this.semester = semester;
        this.description = description;
        this.courseCode = courseCode;

    }

    public boolean inSemester(String s) {
        return this.semester.equals(s);
    }

    @Override
    public String toString() {
        String text;
        text = courseCode + "\n" + courseName + "\nSEMESTER" + semester + "\nPRE-REQUISITES: " + prerequisits
                + "\nCOURSE DESCRIPTION \n" + description;
        return text;
    }

}
