public class Player {
    private String initials;
    private int score;

    // almost immediately intelliJ was basically doing everything.
    // I pretty much was just hitting enter and tab, and it knew what I was wanting to do.

    public Player(String initials, int score) {
        this.initials = initials; // sets the initials to the ones received as an argument
        this.score = score; // same with score
    }
    public String getInitials() {
        return initials;
    }
    public void setInitials(String initials) {
        this.initials = initials;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
}
