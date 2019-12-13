package com.company;


public class Main {

    public static void main(String[] args) {
        FunctionManager function = new FunctionManager();
        //first function
        int sumOfTwoNumbers = function.sum(12, 23);
        System.out.println("Sum of the numbers a and b is: " + sumOfTwoNumbers);

        //second function
        double multipleOfTwoNumbers = function.multipleValueOfTwoNumbers(12.2d, -28.4d);
        System.out.println("Multiple Value of the numbers x and y is: " + multipleOfTwoNumbers);

        //third function
        System.out.print("Is the first number greater than the second: ");
        function.comparisionOfTwoFloatNumbers(43.2F, -12.3F);

        //fourth function
        System.out.print("Print the biggest long number:");
        function.compareThreeLongNumbers(125, -346, 3465566);

        //fifth function
        Human human = new Human("Ani", "Amiryan", "f", 1995);
        System.out.print("Is Ani Amiryan's gender male: ");
        human.ifHumanIsMaleOrFemale(human);

        Human human1 = new Human("Armen", "Karapetyan", "m", 1990);
        Human human2 = new Human("Mihran", "Petrosyan", "m", 1993);

        //sixth function
        FunctionManager functionManager=new FunctionManager();
        System.out.println("The name of the biggest human is: " + functionManager.biggestName(new Human[] {human,human1, human2}));

        //seventh function
        System.out.print("Human's names are: ");
        functionManager.humansNames(human1, human2);

        System.out.println();
        //eighth function
        System.out.print("FirstName or LastName: ");
        functionManager.firstNameOrLastName(true, human);

        //ninth function
        int [] array= {2, 5, 6, 7, 45, 676};
        System.out.println("Max value of the given array is: "+ functionManager.maxValueOfArray(array));

        //tenth function
        float [] array1= {12F, 23.6F, 34.1F, -76.5F};
        System.out.println("Index of Minimal Value of the given array is: " +functionManager.indexOfMinimalValue(array1));

        //eleventh function
        System.out.print("Sort humans in ascending order by the year of birth: ");
        functionManager.sortByAscendingOrder(new Human[]{human, human1, human2});
    }




}
