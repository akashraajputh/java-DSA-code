
//Write a Java Program to define a class, define instance methods for setting and Retrieving values of instance variables and instantiate its object
import java.util.*;

class Person {
    private String name;
    private int age;

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public int getAge() {
        return age;
    }
}

class Code {
    public static void main(String args[]) {
        Person person = new Person();
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int a = sc.nextInt();
        person.setName(name);
        person.setAge(a);
        System.out.println(person.getName() + " is " + person.getAge() + " years old.");
    }
}

class myname {

    public static void main(String args[]) {
        final int a = 6;
        System.out.println(a);
        a = 4;
        System.out.println(a);
    }
}