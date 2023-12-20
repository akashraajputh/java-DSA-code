import java.util.*;

class SecondLargestAndSmallest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the length of the arrays:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("ENTER THE ELEMENT OF THE ARRAYS:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // int largest = arr[0];
        // int secondLargest = arr[0];
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        // int smallest = arr[0];
        // int secondSmallest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] >= secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] <= secondSmallest && arr[i] != smallest) {
                secondLargest = arr[i];
            }

        }

        System.out.println("Second largest element: " + secondLargest);
        System.out.println("Second smallest element: " + secondSmallest);
    }
}

// Second method for finding the second largest and second smallest element
// elements from the arrays:
class SecondLargestSmallest {
    static void show(Integer a[]) {
        Integer smallest = Integer.MIN_VALUE;
        Integer secondsmallest = Integer.MIN_VALUE;
        Integer largest = Integer.MAX_VALUE;
        Integer secondlargest = Integer.MAX_VALUE;
        // Integer secondlargest =Integer.MAX_VALUE];
        // Integer smallest = a[0];
        // Integer secondsmallest = a[0];
        // Integer largest = a[0];
        // Integer secondlargest = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i].compareTo(smallest) < 0) {
                secondsmallest = smallest;
                smallest = a[i];

            } else if (a[i] < secondsmallest && a[i] != smallest) {
                secondsmallest = a[i];
            }

        }
        for (int i = 0; i < a.length; i++) {
            if (a[i].compareTo(largest) > 0) {
                secondlargest = largest;
                largest = a[i];
            } else if (a[i] > secondlargest && a[i] != largest) {
                secondlargest = a[i];
            }
        }
        System.out.println(secondsmallest);
        System.out.println(secondlargest);
    }

    public static void main(String args[]) {
        Integer arr[] = { 9, 4, 5, 6, 5 };
        show(arr);

    }
}

/*
 * Suppose you are working on a software project that involves creating a
 * simulation of a zoo.
 * As part of this project, you are tasked with implementing a system that can
 * handle different types of animals,
 * including lions, tigers, and bears. To accomplish this task, you decide to
 * use polymorphism,
 * a powerful object-oriented programming concept that allows different objects
 * to be treated as
 * if they are of the same type.
 * You create a base class called Animal, which contains common attributes and
 * methods that all animals share,
 * such as eat) and sleep(). You then create three derived classes:
 * Lion, Tiger, and Bear, each with its own unique attributes and methods
 * For example, the Lion class has a method called roar(),
 * while the Tiger class has a method called pounce).
 * The Bear class has a method called hibernate().
 * Now, imagine you need to write a function that takes an array of Animal
 * objects
 * as its parameter and calls the eat() method for each animal in the agay.
 * Can you write a function called feed_animals) that takes an array of Animal
 * objects and
 * calls the eat() method for each animal? How would you ensure that the
 * function can handle any type of animal
 * object, whether It is a Lion,
 * Tiger, or Bear?. (10 Marks).
 * 
 */
class Animal {
    void eat() {
        System.out.println("The Animal eats");
    }

    void sleep() {
        System.out.println("The Animal sleeps");
    }
}

class Lion extends Animal {
    void roar() {
        super.eat();
        System.out.println("Lion roars");
    }
}

class Tiger extends Animal {
    void pounces() {
        super.eat();
        System.out.println("Tiger pounces");
    }
}

class Bear extends Animal {
    void hibernates() {
        super.eat();
        System.out.println("Bear hibernates");
    }
}

class cat_1_papers {
    Animal arr[] = { new Lion(), new Tiger(), new Bear() };

    void feed_animal(Animal arr[]) {
        for (int i = 0; i < 3; i++) {
            if (i == 0)
                arr[i].roar();
            else if (i == 1)
                arr[i].pounces();
            else
                arr[i].hibernates();

        }

    }

    public static void main(String args[]) {
        Animal arr[] = { new Lion(), new Tiger(), new Bear() };
        cat_1_papers ob = new cat_1_papers();
        ob.feed_animal(arr);

    }
}