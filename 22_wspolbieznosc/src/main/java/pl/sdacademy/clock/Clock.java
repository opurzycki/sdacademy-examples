package pl.sdacademy.clock;

import java.time.LocalTime;

public class Clock {


        void start() {
                new Thread(this::work).start();
        }

        private void work() {
                        while (isWorking()) {
                                try {
                                        Thread.sleep(1000);
                                } catch (InterruptedException e) {
                                        throw new RuntimeException(e.getMessage(), e);
                                }
                                System.out.println(LocalTime.now());
                        }
                }


        private boolean isWorking() {
                return working;
        }

        private boolean working = true;

        void stop(){
                working = false;
        }
}
