package oop.composition.bidirectional.oneToOne;

public class Motor {
     boolean isOn = false;
     double injectionFactor = 1;

     // Yes, this does not make a lot of sense...
     Car car;
     Motor(Car car) {
         this.car = car;
     }

     int spins() {
         if (!isOn) {
             return 0;
         }
         return (int) Math.round(injectionFactor *  3000);
     }
}
