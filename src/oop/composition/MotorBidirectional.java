package oop.composition;

public class MotorBidirectional {
     boolean isOn = false;
     double injectionFactor = 1;

     // Yes, this does not make a lot of sense...
     CarBidirectional car;
     MotorBidirectional(CarBidirectional car) {
         this.car = car;
     }

     int spins() {
         if (!isOn) {
             return 0;
         }
         return (int) Math.round(injectionFactor *  3000);
     }
}
