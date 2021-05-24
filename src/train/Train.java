package train;


public class Train {
    public static void main(String[] args) {
        new Train().go();
    }
    public void go(){
        Runnable r=new Runnable(){
            public void run(){
                System.out.print("foo");
            }
        };
        Thread t=new Thread(r);
        t.start();
    }
}
