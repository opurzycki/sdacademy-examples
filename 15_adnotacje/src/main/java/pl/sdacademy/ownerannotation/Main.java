package pl.sdacademy.ownerannotation;


import java.lang.reflect.InvocationTargetException;

public class Main {
        public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
                Test test = new Test();
                Benchmark benchmark = new Benchmark();
                benchmark.benchmark(test);



        }
}
