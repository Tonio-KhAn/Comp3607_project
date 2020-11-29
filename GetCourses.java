import java.util.*;

public class GetCourses {
    private CourseList electives;
    private CourseList core;
    private CourseList foundation;
    private Recomender recomender;

    public GetCourses() {
        this.electives = new CourseList();
        this.core = new CourseList();
        this.foundation = new CourseList();
        this.recomender = new Recomender();
    }

    public IndividualStudent execute(String semester, IndividualStudent student, Degree currentDegree) {
        getCoursesInSemester(currentDegree, semester, student.getStudentYear());
        getLegibleCourses(student.getPassedCourses());
        getAllCoursesToDo(student.getPassedCourses());
        java.lang.System.out.println(this.core);
        java.lang.System.out.println(this.electives);
        java.lang.System.out.println(this.foundation);

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
        boolean check = false;
        for (int x = 0; x < list.getSize(); x = x + 1) {
            for (int y = 0; y < passedCourses.size(); y = y + 1) {
                if (passedCourses.get(y).equals(list.get(x).getCourseCode())) {
                    check = true;
                }
            }
            if (!check) {
                temp.addCourse(list.get(x));

            }
            check = false;
        }
        return temp;
    }
}
