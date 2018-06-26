/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rise;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author RadioactiveScript
 */
public class IPL {

    static class Player {

        private String name;
        private String role;
        private String country;

        public Player(String name, String role, String country) {
            this.name = name;
            this.role = role;
            this.country = country;
        }

        public String getName() {
            return name;
        }

        public String getRole() {
            return role;
        }

        public String getCountry() {
            return country;
        }

        @Override
        public String toString() {
            return "Player{" + "name=" + name + ", role=" + role
                    + ", country=" + country + '}';
        }
    }

    private String teamName;
    private String homeGroundName;
    private String teamOwner;

    public IPL(String teamName, String homeGroundName, String teamOwner,
            int playerCount, String playerName, String playerRole, String playerCountry) {
        this.teamName = teamName;
        this.homeGroundName = homeGroundName;
        this.teamOwner = teamOwner;
        IPL.Player[] p = new IPL.Player[playerCount];
        for (int loop = 0; loop < playerCount; loop++) {
            p[loop] = new Player(playerName, playerRole, playerCountry);
        }
    }

    @Override
    public String toString() {
        return "IPL{" + "teamName=" + teamName + ", homeGroundName="
                + homeGroundName + ", teamOwner=" + teamOwner + '}';

    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many Teams? ");
        int limit = scanner.nextInt();

        System.out.println("How Many Players: ");
        int playerCount = scanner.nextInt();

        IPL[] ipl = new IPL[limit];
        IPL.Player[] player = new IPL.Player[playerCount];

        for (int loop = 0; loop < limit; loop++) {
            System.out.println("Enter team name: ");
            String teamName = scanner.next();

            System.out.println("Enter team home-ground: ");
            String teamHomeGround = scanner.next();

            System.out.println("Enter team-owner: ");
            String teamOwner = scanner.next();

            boolean captainFlag = false;
            boolean wicketKeeperFlag = false;
            int awayPlayersCount = 0;

            for (int loop2 = 0; loop2 < playerCount; loop2++) {

                System.err.println("[Away player count: " + awayPlayersCount
                        + ", Captain Available: " + captainFlag
                        + ", Wicket-keeper Available: " + wicketKeeperFlag + "]");

                System.out.println("Enter " + (loop2 + 1) + " Name: ");
                String playerName = scanner.next();

                System.out.println("Enter " + playerName + "'s Role: ");
                String playerRole = scanner.next();

                System.out.println("Enter " + playerName + "'s Country: ");
                String playerCountry = scanner.next();

                // set flags and values
                if (!playerCountry.equalsIgnoreCase(teamHomeGround)) {
                    awayPlayersCount++;
                }

                if (playerRole.equalsIgnoreCase("Captain")) {
                    captainFlag = true;
                }

                if (playerRole.equalsIgnoreCase("Wicket-keeper")) {
                    wicketKeeperFlag = true;
                }

                // Validate flag and values
                System.out.println("\n*************************************");
                if (awayPlayersCount < 4) {
                    System.out.println((4 - awayPlayersCount)
                            + " away player requires.");
                }
                if (!captainFlag) {
                    System.out.println("Add captain to team");
                }
                if (!wicketKeeperFlag) {
                    System.out.println("Add Wicket-keeper to team");
                }
                System.out.println("\n*************************************");

                if (loop2 == playerCount - 1) {
                    if (awayPlayersCount >= 4 && captainFlag && wicketKeeperFlag) {
                        ipl[loop] = new IPL(teamName, teamHomeGround, teamOwner,
                                playerCount, playerName, playerRole, playerCountry);
                    } else {
                        System.err.println("Validation is not satisfied");
                        System.err.println("Re-Enter the data for team: " + loop);
                        loop2 = -1;
                    }
                }
            }
        }
        // Print team and player info - Pending.
    }
}
