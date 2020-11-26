public interface Degree {
    public abstract CourseList getElectives(String s);

    public abstract CourseList getCore(String s);

    public abstract CourseList getFoundations(String s);

    public abstract Boolean compare(String s);

}
