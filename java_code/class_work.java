import java.util.*;

class class_work {
    int id;
    String name;

    // creating a parameterized constructor
    class_work(int i, String n) {
        id = i;
        name = n;
    }

    // method to display the values
    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String args[]) {
        class_work s1 = new class_work(11, "akash");
        class_work s2 = new class_work(222, "nischal");
        // calling method to display the values of the object
        s1.display();
        s2.display();
    }

}

class Student {
    String name;
    int rollNo;
    String address;
    double cgpa;

    public Student(String name, int rollNo, String address, double cgpa) {
        this.name = name;
        this.rollNo = rollNo;
        this.address = address;
        this.cgpa = cgpa;
    }

    public String toString() {
        return "Name: " + name + ", Roll No: " + rollNo + ", Address: " + address + ", CGPA: " + cgpa;
    }
}

class StudentSort {
    public static void selectionSort(Student[] students) {
        int n = students.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (students[j].cgpa < students[minIndex].cgpa) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                Student temp = students[minIndex];
                students[minIndex] = students[i];
                students[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Student[] students = new Student[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Roll No: ");
            int rollNo = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Address: ");
            String address = scanner.nextLine();
            System.out.print("CGPA: ");
            double cgpa = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            students[i] = new Student(name, rollNo, address, cgpa);
        }

        selectionSort(students);

        System.out.println("\nStudents sorted by CGPA (non-decreasing order):");
        for (Student student : students) {
            System.out.println(student);
        }

        scanner.close();
    }
}





