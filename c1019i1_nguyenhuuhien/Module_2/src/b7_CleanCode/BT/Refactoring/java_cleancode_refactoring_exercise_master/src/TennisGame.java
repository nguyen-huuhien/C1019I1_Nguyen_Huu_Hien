package b7_CleanCode.BT.Refactoring.java_cleancode_refactoring_exercise_master.src;

public class TennisGame {

    public static String getResult(String player1Name, String player2Name, int m_score1, int m_score2) {
        String result = "";
        int tempScore = 0;
        int scoreOfPlayer1 = m_score1;
        int scoreOfPlayer2 = m_score2;

        if (scoreOfPlayer1 == scoreOfPlayer2) {
            result = getResult(scoreOfPlayer1);
        } else if (scoreOfPlayer1 >= 4 || scoreOfPlayer2 >= 4) {
            result = getResult(scoreOfPlayer1, scoreOfPlayer2);
        } else {
            result = getResult(result, scoreOfPlayer1, scoreOfPlayer2);
        }
        return result;
    }

    private static String getResult(String result, int scoreOfPlayer1, int scoreOfPlayer2) {
        int tempScore;
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = scoreOfPlayer1;
            else {
                result += "-";
                tempScore = scoreOfPlayer2;
            }
            switch (tempScore) {
                case 0:
                    result += "Love";
                    break;
                case 1:
                    result += "Fifteen";
                    break;
                case 2:
                    result += "Thirty";
                    break;
                case 3:
                    result += "Forty";
                    break;
            }
        }
        return result;
    }

    private static String getResult(int scoreOfPlayer1, int scoreOfPlayer2) {
        String result;
        int minusResult = scoreOfPlayer1 - scoreOfPlayer2;
        if (minusResult == 1) result = "Advantage player1";
        else if (minusResult == -1) result = "Advantage player2";
        else if (minusResult >= 2) result = "Win for player1";
        else result = "Win for player2";
        return result;
    }

    private static String getResult(int scoreOfPlayer1) {
        String result;
        switch (scoreOfPlayer1) {
            case 0:
                result = "Love-All";
                break;
            case 1:
                result = "Fifteen-All";
                break;
            case 2:
                result = "Thirty-All";
                break;
            case 3:
                result = "Forty-All";
                break;
            default:
                result = "Deuce";
                break;

        }
        return result;
    }
}
