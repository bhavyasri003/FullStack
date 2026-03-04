package Multilevelinheritance;

//Parent class
class Vehicle {
 void vehicleType() {
     System.out.println("Vehicle is starting");
 }
}

//Child class
class Car extends Vehicle {
 void carBrand() {
     System.out.println("Car is driving");
 }
}

//Child of Car (multilevel inheritance)
public class ElectricCar extends Car {

 void batteryType() {
     System.out.println("Electric car battery is charging");
 }

 public static void main(String[] args) {
     ElectricCar ec = new ElectricCar();

     ec.vehicleType();   // from Vehicle
     ec.carBrand();      // from Car
     ec.batteryType();   // from ElectricCar
 }
}