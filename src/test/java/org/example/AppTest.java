package org.example;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class AppTest {

    @Test
    public void testCalcShipsCount() {
        int[][] battleField1 = {};
        assertThat(Main.calcShipsCount(battleField1)).isEqualTo(0);

        int[][] battleField2 = {{1}};
        assertThat(Main.calcShipsCount(battleField2)).isEqualTo(1);

        int[][] battleField3 = {{0}};
        assertThat(Main.calcShipsCount(battleField3)).isEqualTo(0);

        int[][] battleField4 = {
                {0, 0, 1},
                {0, 0, 0},
                {1, 1, 0},
        };
        assertThat(Main.calcShipsCount(battleField4)).isEqualTo(2);

        int[][] battleField5 = {
                {1, 1, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 1},
                {0, 0, 0, 0, 0, 0},
                {0, 1, 1, 1, 0, 1},
                {0, 0, 0, 0, 0, 1},
                {1, 1, 0, 1, 0, 0},
        };
        assertThat(Main.calcShipsCount(battleField5)).isEqualTo(6);
    }

    @Test
    public void testValidateField() {
        int[][] battleField1 = {};
        assertThat(Main.isValidField(battleField1)).isTrue();

        int[][] battleField2 = {
                {0, 1, 0, 0},
                {1, 0, 0, 1},
                {0, 0, 0, 0},
                {0, 1, 1, 1},
        };
        assertThat(Main.isValidField(battleField2)).isFalse();

        int[][] battleField3 = {
                {0, 1, 1, 0},
                {0, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 1, 0, 1},
        };
        assertThat(Main.isValidField(battleField3)).isTrue();

        int[][] battleField4 = {
                {1, 1, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 1},
                {0, 0, 0, 0, 0, 0},
                {0, 1, 1, 1, 0, 1},
                {0, 0, 0, 0, 0, 1},
                {1, 1, 0, 1, 0, 0},
        };
        assertThat(Main.isValidField(battleField4)).isTrue();

        int[][] battleField5 = {
                {1, 1, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 1},
                {0, 0, 0, 0, 0, 0},
                {0, 1, 1, 0, 0, 1},
                {0, 0, 1, 0, 0, 1},
                {1, 0, 0, 1, 0, 0},
        };
        assertThat(Main.isValidField(battleField5)).isFalse();

        int[][] battleField6 = {
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 1}
        };

        assertThat(Main.isValidField(battleField6)).isFalse();
    }
}
