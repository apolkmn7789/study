import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatException;


public class JUnitQuiz {
    @Test
    public void junitQuiz1(){
        String name1 = "홍길동";
        String name2 = "홍길동";
        String name3 = "홍길은";

        // 1 모든 변수가 null이 아닌지 확인
        assertThat(name1).isNotNull();
        assertThat(name2).isNotNull();
        assertThat(name3).isNotNull();

        // 2 name1 == name2 비교하기
        assertThat(name1).isEqualTo(name2);

        // 3 name1 != name3 비교하기
        assertThat(name1).isNotEqualTo(name3);
    }
    @Test
    public void junitTest2(){
        int number1 = 15;
        int number2 = 0;
        int number3 = -5;

        // 1 number1은 양수인지
        assertThat(number1).isPositive();
        // 2 number2는 0인지
        assertThat(number2).isZero();
        // 3 number3은 음수인지
        assertThat(number3).isNegative();
        // 4 number1 > number2 확인
        assertThat(number1).isGreaterThan(number2);
        // 5 number3 < number2 확인
        assertThat(number3).isLessThan(number2);

    }
}
