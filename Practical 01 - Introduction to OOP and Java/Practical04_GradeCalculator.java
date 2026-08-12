/**
 * Practical 04: Control Flow — if/else and switch
 * 
 * Concept: Decision-making constructs direct program flow based on conditions.
 * 
 * Question: Grade a student's score using both if-else chains and a switch expression.
 * 
 * Sample Output:
 * Score 82 -> Grade: B
Band 9 -> Grade: A
 */

public class GradeCalculator {
    static String gradeWithIfElse(int score) {
        if (score >= 90) return "A";
        else if (score >= 75) return "B";
        else if (score >= 60) return "C";
        else return "F";
    }

    static String gradeWithSwitch(int scoreBand) {
        return switch (scoreBand) {
            case 9, 10 -> "A";
            case 7, 8 -> "B";
            case 6 -> "C";
            default -> "F";
        };
    }

    public static void main(String[] args) {
        System.out.println("Score 82 -> Grade: " + gradeWithIfElse(82));
        System.out.println("Band 9 -> Grade: " + gradeWithSwitch(9));
    }
}

/*
 * Viva Q&A:
 * 1. Q: When is a switch preferable to if-else? A: When comparing one variable against many discrete constant values, switch is clearer and can be more efficient.
 * 2. Q: Does Java's modern switch expression need `break`? A: No — the arrow (`->`) form does not fall through, so `break` is unnecessary.
 */
