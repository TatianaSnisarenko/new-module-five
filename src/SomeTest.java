public class SomeTest {
    public static void main(String[] args) {
        final int k = 0;
        method(new Runnable(){

            public void run(){

                System.out.println(k);
            }
        });

    }

    public static void method(Runnable ref) {
        final int k = 4;
        ref.run();
    }
}
