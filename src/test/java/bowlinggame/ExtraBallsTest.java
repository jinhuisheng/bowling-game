package bowlinggame;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ExtraBallsTest {

    @Test
    void should_new_extraBalls_with_one_ball_score_success() {
        ExtraBalls extraBalls = new ExtraBalls("5");
        assertThat(extraBalls.getFirstPinFall()).isEqualTo(5);
    }
}