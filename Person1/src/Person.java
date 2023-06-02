abstract public class Person {

        int age;
        float weight;
        int height;

        double calculateBMI() {

            return weight / (height * weight);
        }
    abstract void dance();
        public void walk(){
            System.out.println("Person is walking");
        }

}
