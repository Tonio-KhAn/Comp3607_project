import java.util.*;

public class System {
    private Degree currentDegree;
    private ArrayList<Degree> degrees;
    private GetCourses getCourses;
    private IndividualStudent currentStudent;
    private StudentList studentList;

    public System() {
        degrees = new ArrayList<Degree>();
        Degree infotech = new Degree("ITcore", "ITelective", "Foun", "B.Sc. Information Technology (Special)");
        degrees.add(infotech);
        Degree compsci = new Degree("CSCore", "CSelective", "Foun", "B.Sc. Computer Science (Special)");
        degrees.add(compsci);
        studentList = new StudentList("Student");
        getCourses = new GetCourses();

    }

    public String requestRecommendation(String studentID, String semester) {

        if (!setCurrentStudent(studentID)) {
            return ("error");
        }
        setCurrentDegree(currentStudent.getDegree());
        this.currentStudent = getCourses.execute(semester, this.currentStudent, this.currentDegree);
        return currentStudent.getRecommendedCourses();
    }

    private boolean setCurrentStudent(String id) {
        for (int x = 0; x < studentList.getSize(); x = x + 1) {
            java.lang.System.out.println(studentList.get(x).compare(id));
            if (studentList.get(x).compare(id)) {
                currentStudent = studentList.get(x);
                return true;
            }
        }
        return false;
    }

    private void setCurrentDegree(String name) {
        for (int x = 0; x < degrees.size(); x = x + 1) {
            if (degrees.get(x).compare(name)) {
                currentDegree = degrees.get(x);
            }
        }
    }

    public Degree tess() {
        return currentDegree;
    }
}
