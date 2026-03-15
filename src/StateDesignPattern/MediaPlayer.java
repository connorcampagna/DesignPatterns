package StateDesignPattern;

// 3. The Context (The object the client actually uses)
public class MediaPlayer {
    private State currentState;

    public MediaPlayer() {
        this.currentState = new PausedState(); // Default state
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public void pressPlay() {
        // Delegates the action to whatever the current state is
        currentState.pressPlay(this);
    }
}