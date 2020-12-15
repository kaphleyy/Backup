package Questions;

import java.util.Comparator;
import java.util.TreeSet;


public class Q4 {
    public static void main(String[] args) {
        TreeSet<Student> set = new TreeSet(new Student());
        set.add(new Student("ram", 98));
        set.add(new Student("shyam", 34));
        set.add(new Student("hari", 76));
        set.add(new Student("sita", 99));
        set.add(new Student("gita", 12));
        set.add(new Student("rita", 86));
         System.out.println(set);

         Comparator c = set.comparator();
System.out.println(c);
    }
    }
    

class Student implements Comparator<Student> {
    String name;
    double percentage;

    Student(String name , double percentage) {
        this.name = name;
        this.percentage = percentage;
    }

    public String toString() {
        return ("Name : " + name + ",percentage : " + percentage);
    }

    @Override
    public int compare(Student s1, Student s2) {
    return s1.percentage>s2.percentage? 1 : s1.percentage<s2.percentage? -1 : 0;

}


}
