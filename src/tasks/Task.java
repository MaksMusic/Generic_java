package tasks;
/**
 Написать классы (абстрактный человек ) от него наследуются студент учитель класс поступающий наследуется от класса студент
 Создать листы для данных объектов

 Так же создать тип листа в который можно присвоить лист с объектами человек , лист с объектами студент ,
 лист с объектами учитель ,  лист с объектами поступающий

 Так же создать тип листа в который можно присвоить лист с объектами человек , лист с объектами студент ,
 лист с объектами поступающий

 Map который принимает в качестве ключа всех людей и принимает в виде значения лист который может быть лист студентов или лист поступаюбщих
*/


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

abstract class Human {
    protected String name;
    protected int age;
    protected String gender;

    public Human(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}

class Student extends Human{
    private int group;

    public Student(String name, int age, String gender, int group) {
        super(name, age, gender);
        this.group = group;
    }

    public int getGroup() {
        return group;
    }
}

class Teacher extends Human {
    private String subject;

    public Teacher(String name, int age, String gender, String subject) {
        super(name, age, gender);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }
}

class Applicant extends Student {
    private String specialty;

    public Applicant(String name, int age, String gender, int group, String specialty) {
        super(name, age, gender, group);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }
}

public class Task {
    public static void main(String[] args) {
        List<Human> allHumans = new ArrayList<>();

        Student s1 = new Student("John", 20, "male", 101);
        Teacher t1 = new Teacher("Jane", 35, "female", "Math");
        Applicant a1 = new Applicant("Jack", 18, "male", 107, "Computer Science");
        //Human h1 = new Human("Jack", 18, "male");

        List<Human> humans = new ArrayList<>();
        List<Applicant> applicantsOnly = new ArrayList<>();
        List<Student> students = new ArrayList<>();
        List<Teacher> teachers = new ArrayList<>();

        List<? extends Human> listExtends = new ArrayList<>();
        listExtends = teachers;
        listExtends = students;
        listExtends = humans;
        listExtends = applicantsOnly;

        List<? super Applicant> listSuper = new ArrayList<>();
        listSuper = applicantsOnly;
        listSuper = students;
        //listSuper = teachers; ошибка компиляции
        listSuper = applicantsOnly;

        allHumans.add(s1);
        allHumans.add(t1);
        allHumans.add(a1);

        List<Human> teachersOnly = new ArrayList<>();



        Map<Human, List<? extends Student>> studentsMap = new HashMap<>();
        studentsMap.put(s1, applicantsOnly);
        studentsMap.put(a1, students);
    }
}