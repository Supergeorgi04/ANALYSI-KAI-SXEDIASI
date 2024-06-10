import java.util.ArrayList;

public class InsuranceContract {

    SafeCar customer = new SafeCar();
    Vehicle vehicle = new Vehicle();
    InsurancePolicy policy = new InsurancePolicy();
    double cost;
    double sum_cost;

    private static ArrayList<InsuranceContract> insurance_contract = new ArrayList<InsuranceContract>();

    public void Contracts(SafeCar customer, Vehicle vehicle, InsurancePolicy policy, double cost) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.policy = policy;
        this.cost = cost;
        insurance_contract.add(this);
    }

    public static ArrayList<InsuranceContract> getiInsuranceContracts() {
        return insurance_contract;
    }

    public String printData1() {
        return "InsuranceContract{" +
                "customer=" + customer.Name +
                ", vehicle=" + vehicle.Pinakida +
                ", policy=" + policy.perigrafi +
                ", cost=" + cost +
                '}';

    }

}
