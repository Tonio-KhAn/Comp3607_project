
public class App {
    System newSystem;

    public App() {
        newSystem = new System();
    }

    public String recommend(String studentID, String semester) {
        return newSystem.requestRecommendation(studentID, semester);
    }
}
