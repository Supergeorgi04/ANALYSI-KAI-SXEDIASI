import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, CustomerInfo> customerInfoMap = new HashMap<>();

        try {
            SafeCar Customer1 = new SafeCar();
            SafeCar Customer2 = new SafeCar();
            SafeCar Customer3 = new SafeCar();

            Customer1.Customer("Maria", "Papadopoulou", "2310264368", "maria.papadopoulou@gmail.com", "AO79432");
            Customer2.Customer("Evanthia", "Papagianni", "2310245368", "evanthia.papagianni@gmail.com", "AO77813");
            Customer3.Customer("Vasilis", "Karagiannis", "2310245668", "ioannis.karagiannis@gmail.com", "AO45698");

            Vehicle Vehicle1 = new Vehicle();
            Vehicle Vehicle2 = new Vehicle();
            Vehicle Vehicle3 = new Vehicle();

            Vehicle1.Vehicles("Mercedes", "GLC", "2020", "XKR8923", "7C3FR76A515072256");
            Vehicle2.Vehicles("Subaru", "Forester", "2018", "NII4269",
                    "7C3FR76A555071465");
            Vehicle3.Vehicles("Ford", "Ranger", "2022", "KOH4681",
                    "7C3FR76A55504645");

            InsurancePolicy insurance1 = new InsurancePolicy();
            InsurancePolicy insurance2 = new InsurancePolicy();
            InsurancePolicy insurance3 = new InsurancePolicy();

            insurance1.Insurance("MI93", "Mikti asfalisi", "6");
            insurance2.Insurance("B56", "Basiki asfalisi", "6");
            insurance3.Insurance("O58", "Me odiki", "6");

            InsuranceContract Policy1 = new InsuranceContract();
            InsuranceContract Policy2 = new InsuranceContract();
            InsuranceContract Policy3 = new InsuranceContract();

            List<InsuranceContract> contracts = new ArrayList<>();

            Policy1.Contracts(Customer1, Vehicle1, insurance2, 60.0);
            Policy2.Contracts(Customer2, Vehicle2, insurance1, 120.0);
            Policy3.Contracts(Customer2, Vehicle3, insurance3, 80.0);

            contracts.add(Policy1);
            contracts.add(Policy2);
            contracts.add(Policy3);

            for (InsuranceContract contract : contracts) {
                String customerName = contract.customer.Name;
                CustomerInfo info = customerInfoMap.getOrDefault(customerName, new CustomerInfo());
                info.totalCost += contract.cost;
                info.vehicles.add(contract.vehicle);
                customerInfoMap.put(customerName, info);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        for (InsuranceContract Policy : InsuranceContract.getiInsuranceContracts()) {
            System.out.println(Policy.printData1());

        }

        for (Map.Entry<String, CustomerInfo> entry : customerInfoMap.entrySet()) {
            String vehicles = entry.getValue().vehicles.toString().replaceAll("[\\[\\]]", "");
            System.out.println("Customer:" + entry.getKey() + ", Total Cost: " + entry.getValue().totalCost
                    + ",Vehicle:" + vehicles);
        }

    }

}

class CustomerInfo {
    double totalCost;
    List<Vehicle> vehicles;

    public CustomerInfo() {
        this.totalCost = 0;
        this.vehicles = new ArrayList<>();
    }
}