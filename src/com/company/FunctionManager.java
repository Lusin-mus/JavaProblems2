package com.company;

public class FunctionManager {


    //first function
    public int sum(int a, int b) {
        return a + b;
    }

    //second function
    public double multipleValueOfTwoNumbers(double x, double y) {
        return x * y;
    }

    //third function
    public void comparisionOfTwoFloatNumbers(float a, float b) {
        if (a > b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    //fourth function
    public void compareThreeLongNumbers(long a, long b, long c) {
        System.out.println(a > b ? (a > c ? a : c) : (b > c ? b : c));
    }

    //sixth function
    public String biggestName(Human[] humans) {
        Human biggest = humans[0];
        for (int i = 1; i < humans.length; i++) {
            if (biggest.getYear() > humans[i].getYear()) {
                biggest = humans[i];
            }
        }
        return biggest.getFirstName();
    }

    //seventh function
    public void humansNames(Human human, Human human1) {
        human.printFullName();
        human1.printFullName();
    }

    //eighth function
    public void firstNameOrLastName(boolean x, Human human) {
        if (x) {
            System.out.println(human.getFirstName());
        } else {
            System.out.println(human.getLastName());

        }
    }

    //ninth function
    public static int maxValueOfArray(int[] array) {
        int max = array[0];
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    //tenth function
    public static int indexOfMinimalValue(float[] array) {
        int index = 0;
        float min = array[index];

        for (int i = 1; i < array.length; i++) {

            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    //eleventh function
    public void sortByAscendingOrder(Human[] humans) {
        for (int i = humans.length - 1; i >= 0; i--) {
            for (int j = 0; j <i; j++) {
                if (humans[j].getYear() > humans[j + 1].getYear()) {
                    Human temp = humans[j];
                    humans[j] = humans[j + 1];
                    humans[j + 1] = temp;
                }
            }
           humans[i].printFullName();
        }
    }

}
