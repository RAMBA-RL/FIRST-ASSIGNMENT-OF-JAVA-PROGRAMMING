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

import java.util.ArrayList;

public class Team {
	    String teamName;
	    ArrayList<Player> players;

	    // Constructor
	    public Team(String teamName) {
	        this.teamName = teamName;
	        this.players = new ArrayList<Player>();
	    }

	    // Add player to team
	    public void addPlayer(Player player) {
	        players.add(player);
	    }

	    // Calculate total score
	    public int getTotalScore() {
	        int total = 0;
	        for (Player p : players) {
	            total += p.score;
	        }
	        return total;
	    }

	    // Find highest scoring player
	    public Player getHighestScoringPlayer() {
	        Player highest = players.get(0);
	        for (Player p : players) {
	            if (p.score > highest.score) {
	                highest = p;
	            }
	        }
	        return highest;
	    }

		public String getTeamName() {
			// TODO Auto-generated method stub
			return teamName;
		}
	}
