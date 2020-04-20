public class C2_13 {
    public static void main(String[] args) {
        Animal dog1 = new Animal();
        Animal dog2 = new Animal();
        Animal chicken = new Animal();

        dog1.weight = 15;
        dog2.weight = 37;
        chicken.weight = 3;

        dog1.feet = 4;
        dog2.feet = 4;
        chicken.feet = 2;

        System.out.printf("The weight of dog1 is " + dog1.weight);
        System.out.printf("The weight of dog2 is " + dog2.weight);
        System.out.printf("The weight of chicken is "+ chicken.weight);

    }
}
