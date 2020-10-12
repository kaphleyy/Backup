// ! Name : Amrit Kafle 
// ! Regd : 19410121179

class Student {
    int roll;
    String name;
    int marks[] = new int[5];
    int totalMarks = 0;

    Student() {
    };

    Student(int roll, String name, int[] marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
        for (int mark : marks) {
            totalMarks += mark;
        }
    }

    void display() {
        System.out.println("Roll : " + roll + " , Name : " + name + " , Total Marks : " + totalMarks);
    }

    public String toString() {
        return ("Roll : " + roll + " , Name : " + name + ", Marks:  " + getString(marks) + ", Total Marks : "
                + totalMarks);
    }

    public String getString(int[] marks) {
        return ("[ " + marks[0] + ", " + marks[1] + ", " + marks[2] + ", " + marks[3] + ", " + marks[4] + " ]");
    }
}

class Section {
    int size;
    Student[] sec;

    Section() {
        size = 0;
        sec = new Student[100];
    }

    void insert(int roll, String name, int[] marks) {
        sec[size] = new Student(roll, name, marks);
        size++;
    }

    Student search(int roll) {
        for (int i = 0; i < size; i++) {
            if (sec[i].roll == roll)
                return sec[i];
        }
        return null;
    }

    void display_student() {
        Student s = new Student();
        for (int i = 0; i < size; i++) {
            System.out.println("Roll: " + sec[i].roll + " , Name: " + sec[i].name + ", Marks : "
                    + s.getString(sec[i].marks) + ", TotalMarks: " + sec[i].totalMarks);
        }
        System.out.println();

    }

    Student highest() {
        Student high = sec[0];
        for (int i = 0; i < size; i++) {
            if (sec[i].totalMarks > high.totalMarks)
                high = sec[i];
        }
        return high;
    }

    Student lowest() {
        Student low = sec[0];
        for (int i = 0; i < size; i++) {
            if (sec[i].totalMarks < low.totalMarks)
                low = sec[i];
        }
        return low;
    }

}

public class StudentApp {
    public static void main(String[] args) {
        int[] marks1 = { 90, 78, 89, 88, 87 };
        int[] marks2 = { 34, 64, 75, 76, 54 };
        int[] marks3 = { 99, 64, 75, 87, 54 };
        int[] marks4 = { 34, 90, 75, 99, 54 };

        Section secObj = new Section();
        secObj.insert(1, "Ram", marks1);
        secObj.insert(2, "Shyam", marks2);
        secObj.insert(3, "Hari", marks3);
        secObj.insert(4, "Sita", marks4);

        secObj.display_student();

        System.out.println(secObj.highest());
        System.out.println(secObj.lowest());
        System.out.println(secObj.search(3));

    }
}
