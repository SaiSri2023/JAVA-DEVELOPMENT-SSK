public class Child extends Parent {
    int childVr;

    Child(){
        childVr=2;
        super.parentVr=5;
        System.out.println(childVr);
        System.out.println(parentVr);

    }
    Child(int c){
        childVr=c;
        System.out.println(childVr);

    }
}
