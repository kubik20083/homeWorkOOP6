package module;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

public class TeacherGroupIterator implements Iterator<Teacher> {

    private int counter;
    private final List<Teacher> teachers;

    public TeacherGroupIterator(TeacherGroup teacherGroup) {
        this.teachers = teacherGroup.getTeachers();
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < teachers.size() - 1;
    }

    @Override
    public Teacher next() {
        if (!hasNext()){
            return teachers.get(counter++);
        }

        throw new IllegalArgumentException();
    }

    @Override
    public void remove() {
        teachers.remove(counter);
    }

    public int searchTeacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth){
        for (int i = 0; i < teachers.size(); i++) {
            if(teachers.get(i).getFirstName().equalsIgnoreCase(firstName) &&
                    teachers.get(i).getLastName() == secondName &&
                    teachers.get(i).getFirstName() == patronymic &&
                    teachers.get(i).getId() == counter){
                return i;
            }
        }
        System.out.println("Student " + firstName + " not found!");
        return -1;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }
    public void reset(){
        counter = 0;
    }
}