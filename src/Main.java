
public class Main {
    public static void main(String[] args) {

        Player player = new Player("ST", 20250); // player object created with initials ST and score of 1

        //blank line to make output more readable
        System.out.println();

        // display initial info
        System.out.println(player.getInitials() + "'s high score: " + player.getScore());

        // increased score
        player.setScore("add", 12030);

        // display new info, pretending it's their personal high score
        System.out.println(player.getInitials() + "'s new high score: " + player.getScore());
        System.out.println(); // blank line to separate

        // changing values to show different player's info, pretending they have THE high score
        player.setInitials("PZ");
        player.setScore("set", 10000000);
        System.out.println(player.getInitials() + "'s high score: " + player.getScore());

        // blank line for space
        System.out.println();
    }
}