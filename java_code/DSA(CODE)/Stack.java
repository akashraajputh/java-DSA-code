
/*1.Linear Data Structure:
//2.Last In First Out{LIFO};
Operation:
1.Push-->Insert
2.pop-->Delete
3.Display-->
void Display(){
    for(j=top;j<1;j--){
        sop(arr[j])
    }
}
4.OverFlow-->{
    void overflow(){
        if(top==size-1){
            System.out.println("OverFlow")
        }
    }
    void push(){
        overflow();
        sop("Enter the Data":);
        int i = sc.nextInt();
        top = top+1;
        a[top]= i;
    }
}
5.UnderFlow--pop{
    void underflow(){
        if(top==-1){
            print(UnderFlow);
        }
    }
    void pop(){
        underflow();
        top = top-1;
    }

    }
}
6.POinter is always at the top:

*/
import java.util.*;

//Implemetation of stack Using the Araays Concept:
class StacKimplementation {
    int n = 10;
    int a[] = new int[n];
    int top = -1;

    void push() {
        if (top == (n - 1)) {
            System.out.println("Overflow");
        } else {
            System.out.print("enter the daTA");
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            top = top + 1;
            a[top] = i;
            System.out.print("Data Is pushed");

        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Under Flow");

        } else {
            top = top - 1;
            System.out.println("Data is poped:");
        }
    }

    void Display() {
        for (int j = top; j >= 0; j--) {
            if (a[j] == 0) {
                System.out.println("Stack is Empty:");

            } else {
                System.out.println(a[j]);
            }
        }
    }

    public static void main(String args[]) {
        StacKimplementation s1 = new StacKimplementation();

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter 1 for Push:" + "Enter 2 for pop:-");
            // int n = sc.nexInt();
            switch (sc.nextInt()) {
                case 1:
                    s1.push();
                    s1.Display();
                    break;
                case 2:
                    s1.pop();
                    s1.Display();
                    break;
            }
            System.out.println("Press 1 For again Push and POP operation: ");
        } while (sc.nextInt() == 1);
        System.out.println("Reqired Data Is:-");
        s1.Display();

    }

}

class selectionsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name[] = new String[4];
        int roll[] = new int[4];
        String addr[] = new String[4];
        double cgpa[] = new double[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter the Details of " + (i + 1) + "Student");
            System.out.println("Enter the Name of the Student:");
            name[i] = sc.next();
            System.out.println("Enter  the RollNO:");
            roll[i] = sc.nextInt();
            System.out.println("Enter the Address;");
            addr[i] = sc.next();
            System.out.println("Entert the Cgpa:");
            cgpa[i] = sc.nextDouble();

        }
        for (int i = 0; i < 4; i++) {
            int min_idx = i;
            for (int j = i + 1; j < 4; j++) {
                if (cgpa[j] < cgpa[min_idx]) {
                    min_idx = j;
                }
            }
            double temp = cgpa[min_idx];
            cgpa[min_idx] = cgpa[i];
            cgpa[i] = temp;
            String tempname = name[min_idx];
            name[min_idx] = name[i];
            name[i] = tempname;
            int roll_temp = roll[min_idx];
            roll[min_idx] = roll[i];
            roll[i] = roll_temp;
            String add_temp = addr[min_idx];
            addr[min_idx] = addr[i];
            addr[i] = add_temp;
        }
        for (int i = 0; i < 4; i++) {
            System.out.println("Name: " + name[i] + "Rollno: " + roll[i] + "Address:" + addr[i] + "CGPA: " + cgpa[i]);
        }

    }

}