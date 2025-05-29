import lld.Driver;
import lld.parkinglot.ParkingLotDriver;
import lld.stackoverflow.StackOverflowDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Driver driver = new ParkingLotDriver();

        Driver driver = new StackOverflowDriver();

        driver.start();

    }
}