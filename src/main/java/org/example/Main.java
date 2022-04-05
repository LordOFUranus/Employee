package org.example;

public class Main {
    public static void main(String[] args) {
        Employee firstMan = new Employee("Иван Иванов", "Кассир","x@gmail.com", "+777777777", 40000, 20);
        firstMan.getInfo();

        System.out.println("Массив");
        Employee[] arrayEmployee = new Employee[5];
        arrayEmployee[0] = new Employee("Andrew Rayan", "CEO","ar@direct.com", "550331",100000,54);
        arrayEmployee[1] = new Employee("Maxim A","Security","security@site.com","102",20000,24);
        arrayEmployee[2] = new Employee("Anna B","Analyst","annabols@mail.ru","8(701)222398",50000,33);
        arrayEmployee[3] = new Employee("Petr Petrov","Accountant","petrov_1974@gmail.com","71213213213",35000,48);
        arrayEmployee[4] = new Employee("Andrey Andreev","Janitor","andrey-andreev@gmail.com","767643454",10000,21);

        for (int i= 0; i<arrayEmployee.length;i++){
            if (arrayEmployee[i].getAge()>=40){
                arrayEmployee[i].getInfo();
            }
        }
    }
}
