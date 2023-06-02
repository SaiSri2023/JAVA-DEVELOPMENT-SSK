public class Male extends Person {
   public void dance(){}
    @Override
        public void walk() {
            super.walk();
            System.out.println("Male walking diffrently");
        }

        Male(){
        walk();
        }

}
