import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringClassTest {

    public static final String COMMA = ",";

    @Nested
    @DisplayName("요구사항 1")
    class Requirement1 {
        @Test
        @DisplayName("\"1,2\"를 ,로 split하면 1과 2로 분리된다.")
        void split1() {
            final String input = "1,2";

            final String[] result = input.split(COMMA);

            assertThat(result).contains("1", "2");
        }

        @Test
        @DisplayName("\"1\"를 ,로 split하면 1만 포함하는 배열이 반환된다.")
        void split2() {
            final String input = "1";

            final String[] result = input.split(COMMA);

            assertThat(result).containsExactly("1");
        }
    }

    @Nested
    @DisplayName("요구사항 2")
    class Requirement2 {

        @Test
        @DisplayName("\"(1,2)\"가 주어졌을 때 substring() 메서드를 활용해 ()를 제거하면 \"1,2\"가 반환된다.")
        void substring() {
            final String input = "(1,2)";

            final String result = input.substring(1, input.length() - 1);

            assertThat(result).isEqualTo("1,2");
        }
    }

    @Nested
    @DisplayName("요구사항 3")
    class Requirement3 {

        @Test
        @DisplayName("\"abc\" 값이 주어졌을 때 String의 charAt() 메소드를 활용해 특정 위치의 문자를 가져올 수 있다.")
        void chartAt1() {
            final String input = "abc";

            final char result = input.charAt(1);

            assertThat(result).isEqualTo('b');
        }

        @Test
        @DisplayName("String의 charAt() 메소드를 활용해 특정 위치의 문자를 가져올 때 위치 값을 벗어나면 StringIndexOutOfBoundsException이 발생한다.")
        void charAt2() {
            final String input = "abc";

            assertThatThrownBy(
                    () -> input.charAt(input.length())
            ).isInstanceOf(StringIndexOutOfBoundsException.class)
                    .hasMessageContaining("String index out of range: %d".formatted(input.length()));
        }
    }
}
