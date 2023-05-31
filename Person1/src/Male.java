public class Male extends Person {
    @Override
        public void walk() {
            super.walk();
            System.out.println("Male walking diffrently");
        }

        Male(){
        walk();
        }

}
