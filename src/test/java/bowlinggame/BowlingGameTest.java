package bowlinggame;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class BowlingGameTest {
    @Test
    void should_be_300_when_frames_are_strike() {
        BowlingGame bowlingGame = new BowlingGame("X|X|X|X|X|X|X|X|X|X||XX");
        assertThat(bowlingGame.score()).isEqualTo(300);
    }

    @Test
    void should_be_90_when_frames_miss_one_ball() {
        BowlingGame bowlingGame = new BowlingGame("9-|9-|9-|9-|9-|9-|9-|9-|9-|9-||");
        assertThat(bowlingGame.score()).isEqualTo(90);
    }

    @Test
    void should_be_150_when_frames_are_spare() {
        BowlingGame bowlingGame = new BowlingGame("5/|5/|5/|5/|5/|5/|5/|5/|5/|5/||5");
        assertThat(bowlingGame.score()).isEqualTo(150);
    }

    @Test
    void should_be_167_when_frames_has_multiple_types() {
        BowlingGame bowlingGame = new BowlingGame("X|7/|9-|X|-8|8/|-6|X|X|X||81");
        assertThat(bowlingGame.score()).isEqualTo(167);
    }


}
