import Unit_Test.Lesson2.Car;
import Unit_Test.Lesson2.Motorcycle;
import Unit_Test.Lesson2.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VehicleTest {

    Car car;
    Motorcycle motorcycle;

    @BeforeEach
    void setUp() {
        car = new Car("Tesla", "Model X Plaid", 2022);
        motorcycle = new Motorcycle("Ducatti", "Diavel", 2023);
    }

    @Test
    void anInstanceOfACarObjectIsAlsoAnInstanceOfAVehicle(){
        assertTrue(car instanceof Vehicle);
    }

    @Test
    void aCarObjectIsCreatedWithFourWheels(){
        assertEquals(car.getNumWheels(), 4);
    }

    @Test
    void aMotorcycleObjectIsCreatedWithTwoWheels(){
        assertEquals(motorcycle.getNumWheels(), 2);
    }

    @Test
    void carObjectReachesSpeedSixtyInTestDrivingMode(){
        car.testDrive();
        assertEquals(car.getSpeed(), 60);
    }

    @Test
    void motorcycleObjectReachesSpeedOfSeventyFiveInTestDrivingMode(){
        motorcycle.testDrive();
        assertEquals(motorcycle.getSpeed(), 75);
    }

    @Test
    void inParkingModeTheCarStopsTheSpeedIsZero(){
        car.testDrive();
        car.park();
        assertEquals(car.getSpeed(), 0);
    }

    @Test
    void inParkingModeTheMotorcycleStopsTheSpeedIsZero(){
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(motorcycle.getSpeed(), 0);
    }

}