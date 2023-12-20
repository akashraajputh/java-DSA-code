import java.uti.*;

//1.nested inner class
class outer {
    void myfile() {
        System.out.println("akash singh");
    }

    class inner {
        public void show() {
            System.out.println("inner class");
        }
    }

}

class exam {
    public static void main(String args[]) {
        outer ob2 = new outer();
        ob2.myfile();
        outer.inner ob1 = new outer().new inner();
        ob1.show();

    }
}
// 2.Method Local inner classes

class outer1 {
    void myfile1() {
        System.out.println("singh");
        class inner {
            public void show() {
                System.out.println("inner class");
            }

        }
        inner obj = new inner();
        obj.show();
    }

}

class exam2 {
    public static void main(String args[]) {
        outer1 ob3 = new outer1();
        ob3.myfile1();

    }
}

// 3.Static nested class
// Static nested classes are not technically inner classes.
// They are like a static member of outer class.
class outer3 {
    public static void display() {
        System.out.println("outer class");
    }

    public static class inner {
        public static void show() {
            System.out.println("inner class");
            display();
        }

    }

}

class Display_details {
    public static void main(String args[]) {
        // outer3.display();
        outer3.inner.show();

    }
}
// 4.Anonymous inner class
// Anonymous inner classes are declared without any name at all.
// They are created in two ways.

// As a subclass of the specified type
// As an implementer of the specified interface
// Way 1: As a subclass of the specified type
// helper class
class outer4 {
    void show() {
        System.out.println("outer class");
    }
}

// Driver or main class
class Display2 {
    // an anonymous class with demo as a base class
    static outer4 ob3 = new outer4() {

        void show() {

            super.show();
            System.out.println("inner class");

        }
    };

    // Mian driver method

    public static void main(String args[]) {

        ob3.show();
    }
}

// 2.As a implementer of the specified interface:
interface Info {
    void show();

}

class Showdata {
    static Info ob1 = new Info() {
        public void show() {
            System.out.println("anonymous class");

        }
    };

    public static voiod main(String args[]) {
        ob1.show();
    }
}
