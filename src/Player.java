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
    public void setScore(String mod, int score) { // added functionality to subtract or add from the score instead only set
        if (mod == "sub") {
            this.score -= score;
        } else if (mod == "add") {
            this.score += score;
        } else {
            this.score = score;
        }
        if (this.score < 0) {
            this.score = 0;
        }
    }
}
