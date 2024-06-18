public class Timer {

    private int hundredthSeconds;
    private int seconds;

    public Timer() {
        this.hundredthSeconds = 0;
        this.seconds = 0;
    }


    public String cleanSeconds() {
        if (this.seconds < 10) {
            return "0" + this.seconds;
        } else {
            return String.valueOf(this.seconds);
        }
    }

    public String cleanHundredthSeconds() {
        if (this.hundredthSeconds < 10) {
            return "0" + this.hundredthSeconds;
        } else {
            return String.valueOf(this.hundredthSeconds);
        }
    }

    @Override
    public String toString() {
        return this.cleanSeconds() + ":" + this.cleanHundredthSeconds();
    }

    public void advance() {
        this.hundredthSeconds = this.hundredthSeconds + 1;

        if (this.hundredthSeconds >= 100) {
            this.seconds = this.seconds + 1;
            this.hundredthSeconds = 0;
        }

        if (this.seconds >= 60) {
            this.seconds = 0;
        }
    }
}
