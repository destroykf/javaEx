package cars;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver("John Doe", 55, 30);
        Engine engine = new Engine(200, "Toyota");
        Car car = new Car("Toyota Camry", "Sedan", driver, engine);

        Lorry lorry = new Lorry("Volvo", "Truck", driver, engine, 5000);
        SportCar sportCar = new SportCar("Ferrari", "Coupe", driver, engine, 300);

        car.start();
        car.turnLeft();
        car.stop();

        System.out.println("\n");

        System.out.println(lorry.toString());
    }
}
