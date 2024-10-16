package com.omsprog.algorithms;

import java.util.List;
import java.util.Map;

public class ConnectFour {

    static char calculateWinner(int rowNumber, int colNumber, char currentPiece, char[][] pieces) {
        //Below
        for(int i = 1; i <= 3; i++) {
            int auxRowNumber = rowNumber + i;
            if((auxRowNumber < 0 || auxRowNumber > 5) || pieces[auxRowNumber][colNumber] != currentPiece) {
                break;
            }
            if(i == 3)
                return currentPiece;
        }

        //Left-Right
        int leftRightCoincidences = 0;

        for(int i = 1; i <= 3; i++) {
            int auxColNumber = colNumber + i;
            if ((auxColNumber < 0 || auxColNumber > 6) || pieces[rowNumber][auxColNumber] != currentPiece) {
                break;
            } else {
                leftRightCoincidences++;
            }
        }

        for(int i = 1; i <= 3; i++) {
            int auxColNumber = colNumber - i;
            if ((auxColNumber < 0 || auxColNumber > 6) || pieces[rowNumber][auxColNumber] != currentPiece) {
                break;
            } else {
                leftRightCoincidences++;
            }
        }

        if(leftRightCoincidences == 3) {
            return  currentPiece;
        }

        //Anti-diagonal
        int antiDiagonalCoincidences = 0;

        for(int i = 1; i <= 3; i++) {
            int auxColNumber = colNumber + i;
            int auxRowNumber = rowNumber - i;
            if ((auxColNumber < 0 || auxColNumber > 6) || (auxRowNumber < 0 || auxRowNumber > 5) || pieces[auxRowNumber][auxColNumber] != currentPiece) {
                break;
            } else {
                antiDiagonalCoincidences++;
            }
        }

        for(int i = 1; i <= 3; i++) {
            int auxColNumber = colNumber - i;
            int auxRowNumber = rowNumber + i;
            if ((auxColNumber < 0 || auxColNumber > 6) || (auxRowNumber < 0 || auxRowNumber > 5) || pieces[auxRowNumber][auxColNumber] != currentPiece) {
                break;
            } else {
                antiDiagonalCoincidences++;
            }
        }

        if(antiDiagonalCoincidences == 3) {
            return  currentPiece;
        }

        //Diagonal
        int diagonalCoincidences = 0;

        for(int i = 1; i <= 3; i++) {
            int auxColNumber = colNumber + i;
            int auxRowNumber = rowNumber + i;
            if ((auxColNumber < 0 || auxColNumber > 6) || (auxRowNumber < 0 || auxRowNumber > 5) || pieces[auxRowNumber][auxColNumber] != currentPiece) {
                break;
            } else {
                diagonalCoincidences++;
            }
        }

        for(int i = 1; i <= 3; i++) {
            int auxColNumber = colNumber - i;
            int auxRowNumber = rowNumber - i;
            if ((auxColNumber < 0 || auxColNumber > 6) || (auxRowNumber < 0 || auxRowNumber > 5) || pieces[auxRowNumber][auxColNumber] != currentPiece) {
                break;
            } else {
                diagonalCoincidences++;
            }
        }

        if(diagonalCoincidences == 3) {
            return  currentPiece;
        }

        return 'E';
    }

    public static String whoIsWinner(List<String> piecesPositionList) {
        char[][] pieces = new char[][] {
            {'E','E','E','E','E','E','E'},
            {'E','E','E','E','E','E','E'},
            {'E','E','E','E','E','E','E'},
            {'E','E','E','E','E','E','E'},
            {'E','E','E','E','E','E','E'},
            {'E','E','E','E','E','E','E'}
        };

        Map<String, Integer> columnMapping = Map.of(
            "A", 0,
            "B", 1,
            "C", 2,
            "D", 3,
            "E", 4,
            "F", 5,
            "G", 6
        );

        for(String ele : piecesPositionList) {
            String[] currentPosition = ele.split("_");
            String column = currentPosition[0];
            String color = currentPosition[1];
            int columnNumber = columnMapping.get(column);
            int rowNumber;
            // Place position
            for(int i = 5; i >= 0; i--) {
                if(pieces[i][columnNumber] == 'E') {
                    rowNumber = i;
                    char currentPiece = color.equals("Yellow") ? 'Y' : 'R';
                    pieces[rowNumber][columnNumber] = currentPiece;
                    char winner = calculateWinner(rowNumber, columnNumber, currentPiece, pieces);
                    if(winner != 'E') {
                        return winner == 'R' ? "Red" : "Yellow";
                    }
                    break;
                }
            }
        }

        return "Draw";
    }
}
