package stringAdder;

import java.util.*;

public class StringProcessResult {
    private final List<String> splitToken;
    private final String numString;

    public StringProcessResult(String customDelimiter, String numString) {
        this.splitToken = new ArrayList<>();
        this.splitToken.add(",");
        this.splitToken.add(":");
        if (splitToken != null) {
            this.splitToken.add(customDelimiter);
        }
        this.numString = numString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StringProcessResult that = (StringProcessResult) o;
        return splitToken.equals(that.splitToken) && numString.equals(that.numString);
    }

    @Override
    public int hashCode() {
        return Objects.hash(splitToken, numString);
    }
}
