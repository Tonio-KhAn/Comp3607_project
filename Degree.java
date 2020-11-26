public interface Degree {
    public abstract CourseList getElectives(String s, int year);

    public abstract CourseList getCore(String s, int year);

    public abstract CourseList getFoundations(String s, int year);

    public abstract Boolean compare(String s);

}
