package org.example;

public class Main {
        public static int calcShipsCount(int[][] battleField) {
            int result = 0;



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

//                            if (row == battleField.length - 1) {
//                                return true;
//                            } else if (cell == battleField[row].length - 1) {
//                                int i = row;
//                                while (battleField[i][cell] != 0) {
//                                    if (battleField[i][cell] == battleField[i][cell - 1]) {
//                                        return false;
//                                    }
//                                    i++;
//                                }
//                            } else {
//                                if (battleField[row][cell] == battleField[row][cell + 1]) {
//                                    int j = cell;
//                                    while (battleField[row][j] != 0) {
//                                        if (battleField[row][j] == battleField[row + 1][j]) {
//                                            return false;
//                                        }
//                                        j++;
//                                    }
//                                }
//                                else if (battleField[row][cell] == battleField[row + 1][cell]) {
//                                    int i = row;
//                                    while (battleField[i][cell] != 0) {
//                                        if (battleField[i][cell] == battleField[i][cell + 1]) {
//                                            return false;
//                                        }
//                                        i++;
//                                    }
//                                }
//                            }
                        }
                }
            }
            return true;
        }
}