public class Car {
    private boolean isCarGoing;
    private double carSpeed;
    private final double MAX_SPEED = 200.00;
    private final double MAX_REVERSE_SPEED = -15.00;

    public Car (){
        isCarGoing = false;
        carSpeed = 0;
    }

    public void start(){
        if (isCarGoing){
            System.out.println("The car is already going");
            return;
        }
        this.isCarGoing = true;
    }

    public void stop(){
        if(carSpeed != 0){
            System.out.println("You should stop the car before turning off the engine");
            return;
        }
        if (!isCarGoing){
            System.out.println("The engine is already stopped");
            return;
        }
        isCarGoing = false;
    }

    public double getSpeed(){
        return this.carSpeed;
    }

    /**
    This method sets the speed of the car to the value specified as the method argument.
     If the value is greater than the maximum speed of the car, it sets current speed equal to the maximum speed and
     prints out a warning to notify the user of the current speed.
     If the value is lower than the minimum speed of the car, it sets current speed equal to the minimum speed of the
     car and prints out a warning to notify the user of the current speed.
    */
    public void setSpeed(double speed){
        if (!isCarGoing){
            System.out.println("You should start the engine to get the car going");
            return;
        }
        if (speed > MAX_SPEED){
            System.out.println("The car is going at " + MAX_SPEED + " kmh because it's the maximum speed");
            carSpeed = MAX_SPEED;
            return;
        }
        if (speed < MAX_REVERSE_SPEED){
            System.out.println("The car is going backwards at " + MAX_REVERSE_SPEED +
                    " kmh because it's the maximum speed");
            carSpeed = MAX_REVERSE_SPEED;
            return;
        }
        carSpeed = speed;
    }
}
