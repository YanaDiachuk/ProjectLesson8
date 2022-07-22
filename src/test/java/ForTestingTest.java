import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ForTestingTest {


    static Stream<Arguments> DataProvider() {

        return Stream.of(
                Arguments.of(1, "Sunday"),
                Arguments.of(2, "Monday"),
                Arguments.of(3, "Tuesday"),
                Arguments.of(4, "Wednesday"),
                Arguments.of(5, "Thursday"),
                Arguments.of(6, "Friday"),
                Arguments.of(7, "Saturday")


        );
    }

    @ParameterizedTest
    @MethodSource("DataProvider")
    public void correctValuesReturn(int dayNumber, String expectedRes) {
        String actualRes = ForTesting.getDay(dayNumber);
        Assertions.assertEquals(expectedRes, actualRes);

    }

    @Test
    public void assertThrowsExcept() {
        Assertions.assertThrows(NullPointerException.class, () -> ForTesting.getDay(null));

    }

}



//    @ParameterizedTest
//    @ValueSource(ints = {0, -1, 5248})
//    public void assertNoException(int i) {
//        Assertions.assertThrows(IllegalArgumentException.class, () -> ForTesting.getDay(i));
//        Assertions.assertDoesNotThrow(IllegalArgumentException.class, ForTesting.getDay(-1));
//    }
//
//    @ParameterizedTest
//    @ValueSource(ints = {0, -1, 5248})
//    public void correctValues(int i) {
//
//        Assertions.assertThrows(System.out.println(), () -> {
//            ForTesting.getDay(i);
//        });
//    }



