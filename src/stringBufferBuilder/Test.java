package stringBufferBuilder;

public class Test {
    public static void main(String[] args) throws Exception {

        // String

//        String text1 = "Hello";
//        String text2 = "World";
//
//        String result = text1 + " " + text2;
//
//        String part = result.substring(0, 5);
//
//        System.out.println(result);
//        System.out.println(part);

        //StringBuilder

//        StringBuilder builder = new StringBuilder("Hello World!");
//
//        builder.append(" - Aytac Agazade");
//
//        int currentYear = 2025;
//        builder.insert(0, currentYear + ": ");
//
//        System.out.println("Final Quote: " + builder.toString());

        //

        StringBuffer stringBuffer = new StringBuffer("StringBuffer: ");

        StringBuilder stringBuilder = new StringBuilder("StringBuilder: ");

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                stringBuffer.append("Thread 1 ");
                stringBuilder.append("Thread 1 ");
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                stringBuffer.append("Thread 2 ");
                stringBuilder.append("Thread 2 ");
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                stringBuffer.append("Thread 3 ");
                stringBuilder.append("Thread 3 ");
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println("StringBuffer (Thread-safe): " + stringBuffer.toString());
        System.out.println("StringBuilder (Non-thread-safe): " + stringBuilder.toString());

    }
}
