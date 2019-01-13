package pl.sdacademy.tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringCalculatorTest {

        @DisplayName("Given empty string then expected is 0")
        @Test

        void test() throws Exception{

                //given
                String number = "";

                //when
                int add = StringCalculator.add(number);

                //then
                assertThat(add).isEqualTo(0);

        }

        @DisplayName("Given number equal to 1, then expected is 1")
        @Test

        void test0() throws Exception{

                //given
                String number = "1";

                //when
                int add = StringCalculator.add(number);

                //then
                assertThat(add).isEqualTo(1);

        }

        @DisplayName("Given number equal to 2, then expected is 2")
        @Test

        void test1() throws Exception{

                //given
                String number = "2";

                //when
                int add = StringCalculator.add(number);

                //then
                assertThat(add).isEqualTo(2);

        }

        @DisplayName("Given two numbers then expected is sum of those numbers")
        @Test

        void test2() throws Exception{

                //given
                String number = "1,2";

                //when
                int add = StringCalculator.add(number);

                //then
                assertThat(add).isEqualTo(3);

        }

        @DisplayName("Given three numbers then expected is sum of those numbers")
        @Test

        void test3() throws Exception{

                //given
                String number = "1,2,3";

                //when
                int add = StringCalculator.add(number);

                //then
                assertThat(add).isEqualTo(6);

        }

        @DisplayName("Given unknown amount of numbers then expected is sum of those numbers")
        @Test

        void test4() throws Exception{

                //given
                String number = "1,2,3,4,5,6,7";

                //when
                int add = StringCalculator.add(number);

                //then
                assertThat(add).isEqualTo(28);

        }

        @DisplayName("Given unknown amount of numbers then expected is sum of those numbers "+
                "and separators can be ',' or '\n'")
        @Test

        void test5() throws Exception{

                //given
                String number = "1,2\n3\n4,5,6\n7";

                //when
                int add = StringCalculator.add(number);

                //then
                assertThat(add).isEqualTo(28);


        }

        @DisplayName("Given unknown amount of numbers then expected is sum of those numbers "+
                "with optional custom delimiter e.g ';'")
        @Test

        void test6() throws Exception{

                //given
                String number = "//;\n1;2";

                //when
                int add = StringCalculator.add(number);

                //then
                assertThat(add).isEqualTo(3);

        }

        @DisplayName("Calling Add with a negative number will throw an exception " +
                "“negatives not allowed” - and the negative that was passed." +
                "if there are multiple negatives, show all of them in the exception message")
        @Test

        void test7() throws Exception{

                //given
                String number = "-1000";

                //when
                IllegalArgumentException ex = catchThrowableOfType(() -> StringCalculator.add(number),
                        IllegalArgumentException.class);

                //then
                assertThat(ex).hasMessage("negative number not allowed");

        }
}
