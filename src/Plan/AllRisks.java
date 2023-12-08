package Plan;

public class AllRisks extends Risk{
    @Override
    public float getPremium() {
        return 0.075f;
    }
    @Override
    public float getCoverage(){
        return 1f;
    }
    public float getCeiling(){
        return 10;
    }
    public String [] allRiskCovered = {
            "Third Party Damage ",
            "Vehicle Damage",
            "Driver Damage",
            "Fire",
            "Robbery",
            "Transport",
            "Car Replacement"
    };
}
