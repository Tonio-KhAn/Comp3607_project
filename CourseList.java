import java.util.*;

public class CourseList {
    private ArrayList<IndividualCourse> courses;

    public void addCourse(IndividualCourse c) {
        courses.add(c);
    }

    public IndividualCourse get(int x) {
        return courses.get(x);
    }

    public int getSize() {
        return courses.size();
    }
}
