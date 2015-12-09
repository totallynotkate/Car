public class Main {

    public static void main(String[] args) {
	    Car myCar = new Car();
        myCar.start();
        System.out.println(myCar.getSpeed());
        myCar.start();
        myCar.setSpeed(15);
        System.out.println("The car speed is " + myCar.getSpeed()+ "kmh");
        myCar.setSpeed(1000);
        myCar.setSpeed(-70);
        myCar.stop();
        myCar.setSpeed(0);
        myCar.stop();
        myCar.stop();
    }
}
