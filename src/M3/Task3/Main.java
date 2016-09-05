package M3.Task3;


import java.util.Date;

/**
 * Created by asevruk on 8/31/2016.
 */
public class Main {



        Course qa = new Course(new Date(10, 10, 10), "qa");
        Course aqa = new Course(10, "Andrey", "Andrey");
        Course java = new Course(new Date(10, 12, 10), "Andrey", 10, "Andrey");
        Course php = new Course(11, "Vasya", "Ivan");
        Course cPlusPlus = new Course(10, "Petya", "Andrey");

        Course[] course = {qa, aqa, java, php, cPlusPlus};

        Student s1 = new Student("Andrey", "Sevru", 10);
        Student s2 = new Student("Andrey", course);

        CollegeStudent c1 = new CollegeStudent("a", "b", 10);
        CollegeStudent c2 = new CollegeStudent("b", course);
        CollegeStudent c3 = new CollegeStudent("a", 10, 1L);

        SpecialStudent sp1 = new SpecialStudent("af", "fa", 10);
        SpecialStudent sp2 = new SpecialStudent("ff", course);




    public static void main(String[] args) {
        Date fd = new Date(20,9,16);
        System.out.println(fd);
    }




    }


