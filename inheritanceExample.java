public class inheritanceExample {

    public static void main(String[] args) {
        
        // inhertiance = the process where one class aquires, the    attributes and methods of another

        car car  = new car();

        car.go();

        bicycle bike = new bicycle();

        bike.stop();

        System.out.println(car.speed);
        System.out.println(bike.speed);

        System.out.println(bike.pedals);
        System.out.println(car.doors);

    }
}