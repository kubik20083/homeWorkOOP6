import java.util.ArrayList;
import java.util.List;

public class TeacherService {
    private List<Teacher> teachers = new ArrayList<>();

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void add(Teacher teacher) {
        teachers.add(teacher);
    }

    public void update(Teacher teacher) {
        for (Teacher l : teachers) {
            if (l.getId() == teacher.getId()) {
                l.setFirstName(teacher.getFirstName());
                l.setLastName(teacher.getLastName());

                break;
            }
        }
    }

    public void remove(Teacher teacher) {
        for (Teacher l : teachers) {
            if (l.getId() == teacher.getId()) {
                teachers.remove(l);
                break;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder teacher = new StringBuilder();
        for (Teacher l : teachers) {
            teacher.append(l.getId()).append(" ").append(l.getLastName()).append(" ").append(l.getFirstName())
                    .append(" ").append(l.getId()).append("\n");
        }
        return teacher.toString();
    }

}
