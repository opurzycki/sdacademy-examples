package pl.sdacademy.clock;

public class ClockTest {
        public static void main(String[] args) throws InterruptedException {
                Clock clock = new Clock();

                clock.start();
                Thread.sleep(3000);

                clock.stop();



        }

}
