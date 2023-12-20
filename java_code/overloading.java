
//write the java program to create employy class with fields, empt name ,epid ,emp adderess and method dispplay to print the fields
import java.util.*;

class field {
    String emptname;
    int empid;
    String empadd;

    public void displayinfo(String emptyname) {
        System.out.println(emptyname);

    }

    public void displayinfo(int empid) {
        System.out.println(empid);
    }

    public void displayinfo(String empadd, String emptname) {
        System.out.println(empadd + emptname);

    }

}

class Mianmethod {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name of the name of the employies:");
        String emptname = sc.next();
        System.out.println("enter the employies Id:");
        int empid = sc.nextInt();
        System.out.println("enter the employies address:");
        String empadd = sc.next();
        field s1 = new field();
        System.out.println("required outout is:");
        s1.displayinfo(emptname);
        s1.displayinfo(empid);
        s1.displayinfo(empadd);

    }

}
