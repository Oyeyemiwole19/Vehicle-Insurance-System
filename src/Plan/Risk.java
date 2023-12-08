package Plan;

public abstract class Risk {
    float premium;
    float coverage;
    float ceiling;

    public boolean isCovered(String [] claimed, String [] riskCovered){

        for (String s : claimed) {
            for (int j = 0; j < riskCovered.length; j++) {
                if (s == riskCovered[j]) {
                    break;
                } else if (j == riskCovered.length) {
                    return false;
                }
            }
        }
        return true;
    }
    public abstract float getPremium();

    public abstract float getCoverage();
    public abstract float getCeiling();
}
