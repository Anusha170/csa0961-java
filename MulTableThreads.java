public class MulTableThreads {

    public static void main(String[] args) {
        Thread thread9 = new Thread(new MultiplicationTableTask(9));
        Thread thread11 = new Thread(new MultiplicationTableTask(11));

        thread9.start(); 
        thread11.start(); 
    }

    static class MultiplicationTableTask implements Runnable {
        private int number;

        public MultiplicationTableTask(int number) {
            this.number = number;
        }

        public void run() {
            System.out.println("Multiplication table for " + number + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " X " + i + " = " + (number * i));
                try {
                    Thread.sleep(100); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
