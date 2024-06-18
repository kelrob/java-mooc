public class SimpleDate {

    private int year;
    private int month;
    private int day;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        return this.year == compared.year && this.month == compared.month &&
                this.day < compared.day;
    }

    public void advance() {
        this.advance(1);
    }

    public void advance(int howManyDays) {
        int remainingDays = 0;
        this.day += howManyDays;

        if (this.day > 30) {
            remainingDays = this.day - 30;
        }

        if (remainingDays > 0 && this.month < 12) {
            this.day = remainingDays;
            this.month++;
        }

        if (remainingDays > 0 && this.month == 12) {
            this.day = remainingDays;
            this.month = 1;
            this.year++;
        }

    }

    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
        newDate.advance(days);
        return newDate;
    }
}
