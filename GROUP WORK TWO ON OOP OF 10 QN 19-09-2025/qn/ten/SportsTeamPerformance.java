/**GROUP MEMBERS NAME & REG NUMBER
RAMBA Rwibutso Leonore                    223011322
TUYISHIMIRE Vedaste                       223010552
CYEZAMUTIMA Emeraude                      223023054
NAMARA Jolly                              223015547
MPUMURE Esperance                         223013760
IRADUKUNDA Epiphanie                      223015618
IRASUBIZA Benyse                          223013344 
**/

package qn.ten;

public class SportsTeamPerformance {
	public static void main(String[] args) {
        Team teamA = new Team("Red Devils");
        teamA.addPlayer(new Player("Inyange", 20));
        teamA.addPlayer(new Player("Merci", 15));
        teamA.addPlayer(new Player("Charlie", 25));

    
        Team teamB = new Team("Citizens");
        teamB.addPlayer(new Player("Mucyo", 30));
        teamB.addPlayer(new Player("Eve", 18));
        teamB.addPlayer(new Player("Ishimwe", 22));

       
        Team[] teams = {teamA, teamB};
        for (Team t : teams) {
            System.out.println("Team: " + t.getTeamName());
            System.out.println("Total Score: " + t.getTotalScore());
            Player topPlayer = t.getHighestScoringPlayer();
            if (topPlayer != null) {
                System.out.println("Top Player: " + topPlayer.getName() + " (" + topPlayer.getScore() + ")");
            }
            System.out.println();
        }


        Team bestTeam = teamA.getTotalScore() > teamB.getTotalScore() ? teamA : teamB;
        System.out.println("Team with the highest total score: " + bestTeam.getTeamName()
                + " (Score: " + bestTeam.getTotalScore() + ")");
    }


	}


