import java.util.ArrayList;

public class InsurancePolicy {

    private static ArrayList<InsurancePolicy> insurances = new ArrayList<InsurancePolicy>();

    private String kodikos_paketou;
    protected String perigrafi;
    private String diarkeia;

    public void Insurance(String kodikos_paketou, String perigrafi, String diarkeia) {
        this.kodikos_paketou = kodikos_paketou;
        this.perigrafi = perigrafi;
        this.diarkeia = diarkeia;
        insurances.add(this);
    }

    public String getKodikos_paketou() {
        return kodikos_paketou;
    }

    public String getPerigrafi() {
        return perigrafi;
    }

    public String getDiarkeia() {
        return diarkeia;
    }

    public static ArrayList<InsurancePolicy> getInsurances() {
        return insurances;
    }
}
