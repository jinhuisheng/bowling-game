package bowlinggame;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FrameTest {

    @Test
    void should_get_bowlingPins_success_given_miss_frame() {
        Frame frame = new Frame("9-");
        assertThat(frame.getBowlingPins()).isEqualTo(9);
    }
}
