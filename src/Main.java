import Transport.Car;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 2");
        Car lada = new Car("Лада", "Гранта", "2015", "Россия", 5, "Хетчбэк", "изумрудный","1,5 л", "Автомат", "х000хх000",false);
        lada.setTypeOfRubber(true);
        lada.changeTiresForSeasonalOnes();
        System.out.println(lada);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", "2020", "Германия",  5, " ","чёрный", "3,0 л", "", "х000хх000",true);
        System.out.println(audi);
        Car bmw = new Car("BMW", "Z8", "2021", "Германия", 5, "Хетчбэк", "чёрный", "3,0 л", "Автомат", "х000хх000",false);
        System.out.println(bmw);
        Car kia = new Car("Kia", "Sportage 4-го поколения", "2018", "Южная Корея",  5, " ", "красный", "2,4 л", "", "х000хх000",true);
        System.out.println(kia);
        Car hyundai = new Car("Hyundai", "Avante", "2016", "Южная Корея", 5, "Хетчбэк", "оранжевый", "1,6 л","Автомат", "х000хх000",false);
        System.out.println(hyundai);

    }
}