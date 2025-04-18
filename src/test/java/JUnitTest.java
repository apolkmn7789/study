import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JUnitTest {
    @DisplayName("1 + 2는 3이다") // 테스트 이름
    @Test // 테스트 메서드
    public void junitTest(){
        int a = 1;
        int b = 2;
        int sum = 3;

        // 값이 같은지 확인
        Assertions.assertEquals(sum , a+b);

    }
//    @DisplayName("1 + 3은 4다.")
//    @Test
//    public void junitFailedTest(){
//        int a = 1;
//        int b = 3;
//        int sum = 3;
//        // 실패를 기대 하는 테스트
//        Assertions.assertEquals(sum,a + b);
//    }
}
