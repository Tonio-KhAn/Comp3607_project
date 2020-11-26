public class GetCourses {
    private CourseList electives;
    private CourseList core;
    private CourseList foundation;

    public String execute(String semester, IndividualStudent student, Degree currentDegree) {

    }

    public void getCoursesInSemester(Degree currentDegree, String semester, int year) {
        this.core = currentDegree.getCore(semester, year);
        this.electives = currentDegree.getElectives(semester, year);
        this.foundation = currentDegree.getFoundations(semester, year);
    }
}
