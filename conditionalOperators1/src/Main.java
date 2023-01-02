public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int age1 = 18;
                if (age1 >= 18) {
                    System.out.println("если возраст человека равен " + age1 + " он совершеннолетний");
                }
        int age2 = 16;
                if (age2 < 18) {
                    System.out.println("если возраст человека равен " + age2 + " он не достиг совершеннолетия, ему надо подождать");
                }

    }

    public static void task2 () {
        System.out.println("Задача 2");
        int temp1 = 6;
        if (temp1 >= 5) {
            System.out.println("На улице " + temp1 + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + temp1 + " градусов, нужно надеть шапку");
        }
        int temp2 = 4;
        if (temp2 >=5) {
            System.out.println("На улице " + temp2 + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + temp2 + " градусов, нужно надеть шапку");
        }


    }

    public static void task3 () {
        System.out.println("Задача 3");
        int speed1 = 50;
        if (speed1 >= 60) {
            System.out.println("если скорость " + speed1 + " придётся заплаить штраф");
        } else {
            System.out.println("если скорость " + speed1 + " можно ездить спокойно");
        }
        int speed2 = 70;
        if (speed2 >=60) {
            System.out.println("если скорость " + speed2 + " придётся заплаить штраф");
        } else {
            System.out.println("если скорость " + speed2 + " можно ездить спокойно");
        }

    }

    public static void task4 () {
        System.out.println("Задача 4");
        int age = 10;
        boolean kindergarten = age >= 2 && age <= 6;
        boolean school = age >= 7 && age <= 18;
        boolean university = age > 18 && age <= 24;
        boolean work = age > 24;
        if (kindergarten) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходит в садик");
        }
        else if (school) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходит в школу");
        }
        else if (university) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходит в университет");
        }
        else if (work) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходит на работу");
        }
        else {
            System.out.println("введен некорректный возраст");
        }

    }

    public static void task5 () {
        System.out.println("Задача 5");
        int ageChild = 16;
        boolean noAttractions = ageChild < 5;
        boolean accompaniedBy = ageChild >=5 && ageChild <= 14;
        if (noAttractions) {
            System.out.println("Если возраст ребенка равен " + ageChild + " , то ему нельзя кататься на атракционах");
        }
        else if (accompaniedBy) {
            System.out.println("Если возраст ребенка равен " + ageChild + " , то можно кааться на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + ageChild + " , то можно кааться на аттракционе без сопровождения взрослого");
        }


    }

    public static void task6 () {
        System.out.println("Задача 6");
        int totalSeats = 102;
        int seatingPlaces = 60;
        int standingPlaces = totalSeats - seatingPlaces;
        int seat = 60;
        int stand = 20;
        int totalOccupied = (stand + seat);
        int freePlaces = (totalSeats - totalOccupied);
        int freeStand = standingPlaces - stand;
        int freeSeat = seatingPlaces - seat;
        if (totalOccupied >= 102) {
            System.out.println("Вагон уже полностью забит");
        } else if (seat >= seatingPlaces && stand <= standingPlaces) {
            System.out.println("количество свободных мест " + freePlaces + " , есть только стоячие места - " + freeStand + " мест");
        } else if (seat <= seatingPlaces && stand >= seatingPlaces) {
            System.out.println("количество свободных мест " + freePlaces + " , есть только сидячие места - " + freeSeat + " мест");
        } else {
            System.out.println("количество свободных мест " + freePlaces + " , количество сидячих мечт " + freeSeat + " , количество стоячих мест " + freeStand);
        }


    }

    public static void task7 () {
        System.out.println("Задача 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if ( one > two && one > three) {
            System.out.println("one" + " большее число");
        } else if (two > one && two > three) {
            System.out.println("two" + " большее число");
        } else {
            System.out.println("three" + " большее число");
        }

    }


}