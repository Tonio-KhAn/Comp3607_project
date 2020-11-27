import java.util.*;

public class System {
    private Degree currentDegree;
    private ArrayList<Degree> degrees;
    private GetCourses getCourses;
    private IndividualStudent currentStudent;
    private StudentList studentList;

    public System() {
        Degree infotech = new InformationTechnology();
        degrees.add(infotech);
    }

    public String requestRecommendation(String studentID, String semester) {
        setCurrentStudent(studentID);
        setCurrentDegree(currentStudent.getDegree());
        this.currentStudent = getCourses.execute(semester, this.currentStudent, this.currentDegree);
        return currentStudent.getRecommendedCourses();
    }

    private void setCurrentStudent(String id) {
        for (int x = 0; x < studentList.getSize(); x = x + 1) {
            if (studentList.get(x).compare(id)) {
                currentDegree = degrees.get(x);
            }
        }
    }

    private void setCurrentDegree(String name) {
        for (int x = 0; x < degrees.size(); x = x + 1) {
            if (degrees.get(x).compare(name)) {
                currentDegree = degrees.get(x);
            }
        }
    }

}
