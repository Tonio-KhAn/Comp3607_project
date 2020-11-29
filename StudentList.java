import java.util.*;
import java.io.*;

public class StudentList {
    private ArrayList<IndividualStudent> students;

    public StudentList(String file) {
        students = new ArrayList<>();
        studentAdder(file);

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

    public void studentAdder(String name) {
        IndividualStudent newStudent;
        try {
            File compFile = new File(name + ".txt");
            Scanner input = new Scanner(compFile);
            input.useDelimiter("\\?");

            while (input.hasNext()) {
                String studentID = input.next();
                String studentName = input.next();
                int studentYear = input.nextInt();
                ArrayList<String> passed = new ArrayList<String>();
                String tempPassed = input.next();
                while (!tempPassed.equals("$")) {
                    passed.add(tempPassed);
                    tempPassed = input.next();
                }
                String degree = input.next();
                double gpa = input.nextDouble();
                newStudent = new IndividualStudent(studentID, studentName, studentYear, passed, degree, gpa);
                this.students.add(newStudent);
            }
            input.close();
        } catch (FileNotFoundException e) {
            int a = 0;
        }
    }

    public String toString() {
        String text = "";
        for (int x = 0; x < students.size(); x = x + 1) {
            text = text + students.get(x).getDegree() + "\n";
        }
        return text;
    }

}
