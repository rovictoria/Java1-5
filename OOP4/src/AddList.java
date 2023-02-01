package OOP4.src;

import OOP4.src.Model.Student;
import OOP4.src.Model.Teacher;
import OOP4.src.Service.UserService;
import OOP4.src.impls.UserServiceImpl;

public class AddList {
    /**
     * Доделать проект(Использовать параметризацию)
     * Сохранение в файл, редактирование, чтение и удаление
     * Заготовка: https://github.com/besSmertniyKoder/untitled9
     * Дженерики и вайлдкардс:
     * https://skillbox.ru/media/base/dzheneriki-v-java-dlya-samykh-malenkikh/
     * 
     * @param args
     */
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.add(new Student("Roman", 4.9f, 4, new Teacher("Антонина Петровна")));
        userService.add(new Student("Andrew", 4.2f, 1, new Teacher("Валентина Петровна")));
        userService.add(new Student("Nicolas", 3.3f, 1, new Teacher("Анастасия")));
        userService.add(new Student("Jeffrey", 5.00f, 2, new Teacher("Павел Иванович")));
        userService.add(new Student("Angela", 4.11f, 3, new Teacher("Петр Павел")));
        userService.add(new Student("Rose", 3.92f, 3, new Teacher("Антон")));
        userService.add(new Student("Jenny", 4.94f, 4, new Teacher("Крис")));
        userService.add(new Teacher("Bella"));

    }

}