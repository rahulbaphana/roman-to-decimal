import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Roman to Decimal converter")
class RomanToArabicConverterTest {

    @ParameterizedTest(name = "\"{0}\" should be {1}")
    @CsvSource({
            "I, 1",
            "II, 2",
            "III, 3",
            "IV, 4",
            "V, 5",
            "VI, 6",
            "XL, 40",
            "IX, 9",
            "CM, 900",
            "MCMIV, 1904"
    })
    void should_convert_roman_number_to_arabic(String romanNumber, int expectedDecimal) {
        int actualDecimalNumber = RomanToArabicConverter.convert(romanNumber);

        assertEquals(expectedDecimal, actualDecimalNumber);
    }
}
