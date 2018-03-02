
package com.infoshareacademy;

public class TennisGame2 implements TennisGame {

    //todo: pozbądź się metod: trzyLubMniej, powCzterech i remis używając tylko i wyłącznie menu refactoring
    // (jak zawsze - zakaz "ręcznej" edycji kodu)

    private int m_score1 = 0;
    private int m_score2 = 0;
    private String player1Name;
    private String player2Name;

    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName == "player1")
            m_score1 += 1;
        else
            m_score2 += 1;
    }

    public String getScore() {
        String score = "";
        int tempScore = 0;
        if (m_score1 == m_score2) {
            String score1;
            switch (m_score1) {
                case 0:
                    score1 = "Love-All";
                    break;
                case 1:
                    score1 = "Fifteen-All";
                    break;
                case 2:
                    score1 = "Thirty-All";
                    break;
                default:
                    score1 = "Deuce";
                    break;

            }
            score = score1;
        } else if (m_score1 >= 4 || m_score2 >= 4) {
            String score1;
            int minusResult = m_score1 - m_score2;
            if (minusResult == 1) score1 = "Advantage player1";
            else if (minusResult == -1) score1 = "Advantage player2";
            else if (minusResult >= 2) score1 = "Win for player1";
            else score1 = "Win for player2";
            score = score1;
        } else {
            String score1 = score;
            int tempScore1;
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore1 = m_score1;
                else {
                    score1 += "-";
                    tempScore1 = m_score2;
                }
                switch (tempScore1) {
                    case 0:
                        score1 += "Love";
                        break;
                    case 1:
                        score1 += "Fifteen";
                        break;
                    case 2:
                        score1 += "Thirty";
                        break;
                    case 3:
                        score1 += "Forty";
                        break;
                }
            }
            score = score1;
        }
        return score;
    }

}