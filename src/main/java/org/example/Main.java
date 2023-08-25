package org.example;

public class Main {
        public static int calcShipsCount(int[][] battleField) {
            int result = 0;

            for (int row = 0; row < battleField.length; row++) {
                for (int cell = 0; cell < battleField[row].length; cell++) {
                    if (battleField[row][cell] == 1) {
                        if ((cell == battleField[row].length - 1 || battleField[row][cell + 1] == 0)
                                && (row == battleField.length - 1 || battleField[row + 1][cell] == 0)) {
                            result++;
                        }
                    }
                }
            }
            return result;
        }

        public static boolean isValidField(int[][] battleField){

            for (int row = 0; row < battleField.length; row++) {
                for (int cell = 0; cell < battleField[row].length; cell++) {
                        if (battleField[row][cell] == 1) {

                            if (row == 0 && cell == 0) {
                                if (battleField[row][cell] == battleField[row + 1][cell + 1]) {
                                    return false;
                                }
                            } else if (row == battleField.length - 1
                                    && cell == battleField[row].length - 1) {
                                if (battleField[row][cell] == battleField[row - 1][cell - 1]) {
                                    return false;
                                }
                            } else if (row == 0 && cell == battleField[row].length - 1) {
                                if (battleField[row][cell] == battleField[row + 1][cell - 1]) {
                                    return false;
                                }
                            } else if (row == battleField.length - 1 && cell == 0) {
                                if (battleField[row][cell] == battleField[row - 1][cell + 1]) {
                                    return false;
                                }
                            } else if (cell == 0) {
                                if (battleField[row][cell] == battleField[row - 1][cell + 1]
                                        ||
                                        battleField[row][cell] == battleField[row + 1][cell + 1]) {
                                    return false;
                                }
                            } else if (cell == battleField[row].length - 1) {
                                if (battleField[row][cell] == battleField[row - 1][cell - 1]
                                        ||
                                        battleField[row][cell] == battleField[row + 1][cell - 1]) {
                                    return false;
                                }
                            } else if (row == 0) {
                                if (battleField[row][cell] == battleField[row + 1][cell + 1]
                                        ||
                                        battleField[row][cell] == battleField[row + 1][cell - 1]) {
                                    return false;
                                }
                            } else if (row == battleField.length - 1) {
                                if (battleField[row][cell] == battleField[row - 1][cell + 1]
                                        ||
                                        battleField[row][cell] == battleField[row - 1][cell - 1]) {
                                    return false;
                                }
                            } else {
                                if (battleField[row][cell] == battleField[row - 1][cell - 1]
                                        ||
                                        battleField[row][cell] == battleField[row + 1][cell + 1]
                                        ||
                                        battleField[row][cell] == battleField[row - 1][cell + 1]
                                        ||
                                        battleField[row][cell] == battleField[row + 1][cell - 1]) {
                                    return false;
                                }
                            }
                        }
                }
            }
            return true;
        }

    public static boolean isValidField1(int[][] battleField) {
        int[][] directions = {
                {-1, -1}, {-1, 0}, {-1, 1},
                {0, -1},           {0, 1},
                {1, -1}, {1, 0}, {1, 1}
        };

        for (int row = 0; row < battleField.length; row++) {
            for (int cell = 0; cell < battleField[row].length; cell++) {
                if (battleField[row][cell] == 1) {
                    for (int[] dir : directions) {
                        int newRow = row + dir[0];
                        int newCell = cell + dir[1];
                        if (newRow >= 0 && newRow < battleField.length &&
                                newCell >= 0 && newCell < battleField[row].length &&
                                battleField[newRow][newCell] == 1) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}