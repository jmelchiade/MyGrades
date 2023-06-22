//BLUEPRINT

public class MyGrades

{
    private double avg, total;
    private int test;
    private String result;

    public MyGrades(String id) {
        result = "Student is " + id + "\nTest #\tTest score\n";
    }

    public void add(double score) {
        total += score;
        test++;
        result += " " + test + "\t\t\t" + score + "\n";
    }

    public void average() {
        avg = total / test;
    }

    public String toString()

    {
        return result + " Average score is " + Math.round(avg) + "\n";
    }

}
