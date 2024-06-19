import java.util.ArrayList;

public class GradeRegister {

    private final ArrayList<Integer> grades;
    private final ArrayList<Integer> examPoints;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.examPoints = new ArrayList<>();
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.examPoints.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public int gradeSum() {
        int sum = 0;
        for (int grade : this.grades) {
            sum += grade;
        }
        return sum;
    }

    public double averageOfGrades() {
        if (this.grades.size() > 0) {
            return (double) gradeSum() / this.grades.size();
        }
        return -1;
    }

    public int examPointsSum() {
        int sum = 0;
        for (int points : this.examPoints) {
            sum += points;
        }
        return sum;
    }

    public double averageOfPoints() {
        if (this.examPoints.size() > 0) {
            return (double) examPointsSum() / this.examPoints.size();
        }
        return -1;
    }
}
