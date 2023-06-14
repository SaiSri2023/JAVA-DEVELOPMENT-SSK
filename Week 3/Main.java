public class Main {
    public static void main(String[] args){
        Pthread thread=new Pthread();
        PRunnable pr=new PRunnable();
        Thread t1=new Thread(pr);
        thread.start();
        t1.start();
    }
}
