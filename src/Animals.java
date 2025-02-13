public class Animals {
    class Animal{
        private int age;
        private String gender;
        public Animal(int age, String gender){
            this.age = age;
            this.gender = gender;
        }
        public boolean isMammal() {
            System.out.println("This is a method isMammal() from class Animal");
            return true;
        }
        public void mate() {
            System.out.println("This is a method mate() from class Animal");
        }
    }

    class Fish extends Animal{
        private double sizeInFeet;
        public Fish(int age, String gender, double sizeInFeet){
            super(age,gender);
            this.sizeInFeet = sizeInFeet;
        }
        private void canEat(){
            System.out.println("This is a method canEat() from class Fish");
        }
    }

    class Zebra extends Animal{
        public boolean is_wild;
        public Zebra(int age, String gender, boolean is_wild){
            super(age,gender);
            this.is_wild = is_wild;
        }
        public void run(){
            System.out.println("This is method run() from class Zebra");
        }
    }

    public void main(String[] args) {
        Animal myAnimal = new Animal(5, "Male");
        Fish myFish = new Fish(2, "Female", 3.5);
        Zebra myZebra = new Zebra(4, "Male", true);

        myAnimal.isMammal();
        myAnimal.mate();
        myZebra.run();
    }

}
