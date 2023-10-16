import java.util.Scanner;

public class TeacherController {
    private final TeacherService storage;

    public TeacherController(TeacherService storage) {
        this.storage = storage;

    }

    public void addTeacher() {

        System.out.println("Введите фамилию учителя: ");
        Scanner n = new Scanner(System.in);
        String secondName = n.next();

        System.out.println("Введите имя учителя: ");
        String firstName = n.next();

        int id = storage.getTeachers().size() + 1;

        Teacher teacher = new Teacher(id, firstName, firstName);

        storage.add(teacher);
        System.out.println(storage);

    }

    public void modifyTeacher() {

        System.out.println(storage.toString());
        System.out.println("Введите id учителя для редактирования: ");
        Scanner n = new Scanner(System.in);
        int id = Integer.parseInt(n.next());

        for (Teacher l : storage.getTeachers()) {
            if (l.getId() == id) {
                System.out.println("Введите измененную фамилию: ");
                String secondName = n.next();

                System.out.println("Введите измененное имя: ");
                String firstName = n.next();

                Teacher teacher = new Teacher(id, firstName, firstName);

                storage.update(teacher);
                System.out.println(storage);
                return;
            }
        }
        System.out.println("Учитель с таким id не найден, повторите операцию!");
    }

    public void removeTeacher() {
        System.out.println(storage.toString());
        System.out.println("Введите id учителя для удаления: ");
        Scanner n = new Scanner(System.in);
        int id = Integer.parseInt(n.next());

        for (Teacher l : storage.getTeachers()) {
            if (l.getId() == id) {
                storage.remove(l);
                System.out.println(storage);
                return;
            }
        }
        System.out.println("Учитель с таким id не найден, повторите операцию!");
    }
}
