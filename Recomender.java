public class Recomender {

    public IndividualStudent execute(CourseList core, CourseList elective, CourseList foundation,
            IndividualStudent student) {
        String recommendation;
        recommendation = getNumOfCoursesAllowed(student.getGpa());
        recommendation = recommendation + coreToString(core);
        recommendation = recommendation + electiveToString(student.getGpa(), elective, core, foundation);
        student.setRecommendedCourses(recommendation);
        return student;
    }

    private String getNumOfCoursesAllowed(double gpa) {
        if (gpa >= 2.0) {
            return "Pick atleast 4 courses no more than 5 courses if you whish to do 6 courses you must request an override\n";
        }
        return "Pick three courses in total\n";
    }

    private String coreToString(CourseList core) {
        return "Core Courses\n" + core.toString();
    }

    private String electiveToString(double gpa, CourseList elective, CourseList core, CourseList foundation) {
        if (gpa >= 2.0) {
            return overThreeElectives(elective, core, foundation);
        }
        return underThreeElectives(elective, core, foundation);
    }

    private String overThreeElectives(CourseList elective, CourseList core, CourseList foundation) {
        if (core.getSize() > 5) {
            return "You cannot choose any more coureses";
        }
        if (core.getSize() == 5) {
            return "Choose an elective if you which to do a 6th course\n" + "Electives\n" + elective.toString()
                    + "Foundation\n " + foundation.toString();
        }
        return "Choose " + otherCourses(core.getSize())
                + " more coures to make up 5 courses either from Electives of Foundation Courses\n" + "Electives\n"
                + elective.toString() + "Foundation\n " + foundation.toString();

    }

    private String underThreeElectives(CourseList elective, CourseList core, CourseList foundation) {
        if (core.getSize() >= 3) {
            return "You cannot choose any more coureses";
        }
        return "Choose " + otherCourses(core.getSize())
                + " more coures to make up 3 courses either from Electives of Foundation Courses\n" + "Foundation\n "
                + "Electives\n" + elective.toString() + foundation.toString();

    }

    private String otherCourses(int size) {
        return Integer.toString(5 - size);
    }
}
