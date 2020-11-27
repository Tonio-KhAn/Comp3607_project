import java.util.*;

public class StudentList {
    private ArrayList<IndividualStudent> students;

    public StudentList() {
        students = new ArrayList<>();
    }

    public void addCourse(IndividualStudent s) {
        students.add(s);
    }

    public IndividualStudent get(int x) {
        return students.get(x);
    }

    public int getSize() {
        return students.size();
    }
}
