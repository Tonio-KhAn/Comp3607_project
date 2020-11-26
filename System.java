import java.util.*;

public class System {
    private Degree currentDegree;
    private ArrayList<Degree> degrees;


    public String requestRecommendation(String studentID, String semester){
       setStudent(studentID);
       setDegree(currentStudent.getDegree);
       getCourses();
       
        }

    private void setCurrentDegree(String name) {
        for (int x = 0; x < degrees.size(); x = x + 1) {
            if (degrees.get(x).compare(name)) {
                currentDegree = degrees.get(x);
            }
        }
    }

}