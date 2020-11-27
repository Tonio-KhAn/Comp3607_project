import java.util.*;

public class GetCourses {
    private CourseList electives;
    private CourseList core;
    private CourseList foundation;
    private Recomender recomender;

    public IndividualStudent execute(String semester, IndividualStudent student, Degree currentDegree) {
        getCoursesInSemester(currentDegree, semester, student.getStudentYear());
        getLegibleCourses(student.getPassedCourses());
        getAllCoursesToDo(student.getPassedCourses())
        return recomender.execute(this.core, this.electives, this.foundation, student);
    }

    private void getCoursesInSemester(Degree currentDegree, String semester, int year) {
        this.core = currentDegree.getCore(semester, year);
        this.electives = currentDegree.getElectives(semester, year);
        this.foundation = currentDegree.getFoundations(semester, year);
    }

    private void getLegibleCourses(ArrayList<String> passedCourses) {
        core = getSinglelegibleCourses(passedCourses, core);
        electives = getSinglelegibleCourses(passedCourses, electives);
        foundation = getSinglelegibleCourses(passedCourses, foundation);
    }

    private CourseList getSinglelegibleCourses(ArrayList<String> passedCourses, CourseList list) {
        CourseList temp = new CourseList();
        for (int x = 0; x < list.getSize(); x = x + 1) {
            if (list.get(x).hasPrerequisits(passedCourses)) {
                temp.addCourse(list.get(x));
            }
        }
        return temp;
    }

    public void getAllCoursesToDo(ArrayList<String> passedCourses) {
        core = getCoursesToDo(passedCourses, core);
        electives = getCoursesToDo(passedCourses, electives);
        foundation = getCoursesToDo(passedCourses, foundation);
    }

    public CourseList getCoursesToDo(ArrayList<String> passedCourses, CourseList list) {
        CourseList temp = new CourseList();
        for (int x = 0; x < list.getSize(); x = x + 1) {
            for (int y = 0; y < passedCourses.size(); y = y + 1) {
                if (passedCourses.get(y).equals(list.get(x).getCourseCode())) {
                    temp.addCourse(list.get(x));
                }
            }
        }
        return temp;
    }
}
