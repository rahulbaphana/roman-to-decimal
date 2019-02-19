import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum RomanToArabicConverter {
    ;

    public static int convert(String romanNumber) {
        String[] romanChars = romanNumber.split("");
        List<RomanSymbols> romanSymbols = Stream.of(romanChars)
                .map(RomanSymbols::valueOf)
                .collect(Collectors.toList());

        return toDecimal(romanSymbols);
    }

    private static int toDecimal(List<RomanSymbols> romanSymbols) {
        int previousValue = 0;
        int sum = 0;
        for (int i = romanSymbols.size() - 1; i >= 0; i--) {
            int currentValue = romanSymbols.get(i).toDecimal();
            if(currentValue < previousValue) sum-=currentValue;
            else sum+=currentValue;
            previousValue = currentValue;
        }
        return sum;
    }
}
