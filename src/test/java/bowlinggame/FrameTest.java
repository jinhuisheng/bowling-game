package bowlinggame;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class FrameTest {

    @Test
    void should_new_miss_one_ball_frame_success() {
        Frame frame = FrameFactory.create("9-");
        assertThat(frame.getBowlingPins()).isEqualTo(9);
        assertThat(frame.getFirstPinFall()).isEqualTo(9);
        assertThat(frame.getSecondPinFall()).isEqualTo(0);
    }

    @Test
    void should_new_miss_one_ball_frame_with_miss_ball_in_front_success() {
        Frame frame = FrameFactory.create("-9");
        assertThat(frame.getBowlingPins()).isEqualTo(9);
        assertThat(frame.getFirstPinFall()).isEqualTo(0);
        assertThat(frame.getSecondPinFall()).isEqualTo(9);
    }


    @Test
    void should_new_spare_frame_success() {
        Frame frame = FrameFactory.create("5/");
        assertThat(frame.getBowlingPins()).isEqualTo(10);
        assertThat(frame.getFirstPinFall()).isEqualTo(5);
        assertThat(frame.getSecondPinFall()).isEqualTo(5);
    }
}