package com.company;

public class Human {
    private String firstName;
    private String lastName;
    private String gender;
    private int year;


    public Human(String firstName, String lastName, String gender, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.year = year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    //fifth function
    public void ifHumanIsMaleOrFemale(Human human) {
        if (human.getGender().equals("m")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    //seventh function
    public void printFullName() {
        System.out.print( firstName +" "+ lastName+ ", ");

    }

}
