package example;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class ExampleTest {
    @Test
    void demo() {
        Example example = new Example();
        assertThat(example.test()).isEqualTo(true);
    }
}
