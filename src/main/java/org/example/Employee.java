package org.example;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phoneNum;
    private int salary;
    private int age;

    Employee(String name, String position,String email, String phoneNum, int salary, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNum = phoneNum;
        this.salary = salary;
        this.age = age;
    }
    public void printInfo(){
        System.out.printf("Имя - %s; Должность - %s; Номер - %s; Зарплата - %s; Возраст - %s \n", name,position,phoneNum,salary, age);
    }
    public int getAge(){
        return age;
    }
}
