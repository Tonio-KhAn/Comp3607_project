import java.util.*;

public class CourseList {
    private ArrayList<IndividualCourse> courses;

    public CourseList() {
        courses = new ArrayList<>();
    }

    public void addCourse(IndividualCourse c) {
        courses.add(c);
    }

    public IndividualCourse get(int x) {
        return courses.get(x);
    }

    public int getSize() {
        return courses.size();
    }

    public String toString() {
        String text = "";
        for (int x = 0; x < courses.size(); x = x + 1) {
            text = text + courses.get(x).toString() + "\n";
        }
        return text;
    }
}
