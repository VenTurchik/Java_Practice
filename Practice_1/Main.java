package Practice_1;

public class Main {
    public static void main(String[] args) {
        Car car_1 = new Car();
        Car car_2 = new Car("Mustang GT 5.0");
        Car car_3 = new Car("Range Rover", "Л110ОЛ", "Dark Green", 1974);

        System.out.print("Obj car_1: ");
        car_1.To_String();

        updataCar("Car 1", car_1);

        System.out.print("Obj car_1 after update: ");
        car_1.To_String();

        System.out.print("Obj car_2: ");
        car_2.To_String();

        updataCar("Car 2", car_2);

        System.out.print("Obj car_2 after update: ");
        car_2.To_String();

        System.out.print("Obj car_3: ");
        car_3.To_String();

        updataCar("Car 3", car_3);

        System.out.print("Obj car_3 after update: ");
        car_3.To_String();

        System.out.println("An example of using a getter: " + car_3.getLicense());


        System.out.println("Возраст car_3: " + car_3.getCarAge());

        

    }

    private static void updataCar(String Whom, Car Obj) {
        System.out.println("\nОбновление полей объекта " + Whom + "\n");

        switch (Whom) {
            case "Car 1":
                Obj.setModel("BMW");
                Obj.setLicense("И1825КБО");
                Obj.setColor("Gray");
                Obj.setYear(2025);
                break;

            case "Car 2":
                Obj.setLicense("А2025БК");
                Obj.setColor("White");
                Obj.setYear(2018);
                break;
            
            case "Car 3":
                Obj.setColor("Red");
                break;

            default:
                System.out.println(Whom + " - такое не предусмотрено <:(");
        }
    }
}
