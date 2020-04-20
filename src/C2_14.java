public class C2_14 {
    public static Aircraft fighter = new Aircraft();
    public static Aircraft bomber = new Aircraft();
    public static Aircraft transport = new Aircraft();

    public static void main(String[] args) {
        fighter.wingspan = 40;
        fighter.passengers = 1;
        fighter.fuelLoad = 12000.0f;

        bomber.wingspan = 90;
        bomber.passengers = 12;
        bomber.bombLoad = 14000.0f;

        transport.wingspan = 106;
        transport.passengers = 4;
        transport.pallets = 42;

        transport.fuelLoad = 18000.0f;
        fighter.pallets = 4;

        System.out.println("The fighter carries " + fighter.pallets + " pallets.");
        System.out.println("The bomber bomb load is " + bomber.bombLoad);

    }
}
