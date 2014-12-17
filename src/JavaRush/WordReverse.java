package JavaRush;

/**
 * User: КЕП Date: 16.12.14 Time: 19:43
 */
public class WordReverse {

    public String reverse (String word) {
        if (word=="") return word;
        else {
            String subProblem = word.substring(1,word.length());
            String subSolution = reverse(subProblem);
            String solution;
        } return null;
    }
}
