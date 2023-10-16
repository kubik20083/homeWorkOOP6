package module;


import java.util.List;

public class TeacherGroup implements Iterable<Teacher>{
    private List<Teacher> teachers;
    private String teacher;

    public TeacherGroup(String teacher, List<Teacher> teachers) {
        this.teachers = teachers;
        this.teacher = teacher;

    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    @Override
    public TeacherGroupIterator iterator() {
        return new TeacherGroupIterator(this);
    }

    @Override
    public String toString() {
        return "\nTeacherGroup: " +
                "\nTeachers: " + teachers +
                "\nTeacherNameGroup: " + teacher + '\'' +
                '}';
    }
}
