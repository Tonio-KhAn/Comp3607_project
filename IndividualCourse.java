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

}
