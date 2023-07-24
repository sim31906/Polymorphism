public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Cow cow = new Cow();
        Duck donald = new Duck();
        Owl owl = new Owl();
        Pig pig = new Pig();

        // Calling sound method for each animal
        cow.sound();
        donald.sound();
        owl.sound();
        pig.sound();
          // Demonstrating the clean method
          donald.clean(cow);

          // Creating an instance of PekingDuck
          PekingDuck daisy = new PekingDuck();
  
          // Calling the clean method of PekingDuck
          daisy.clean(donald);
    }
}
