import java.util.ArrayList;

public class Vehicle {

    private String Marka;
    private String Modelo;
    private String Year;
    protected String Pinakida;
    private String Arithmos_Plaisiou;

    private static ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

    public void Vehicles(String Marka, String Modelo, String Year, String Pinakida, String Arithmos_Plaisiou)
            throws Exception {
        if (isIdInList(Arithmos_Plaisiou)) {
            throw new Exception("Ο αριθμός πλαισίου (" + Arithmos_Plaisiou + ") υπάρχει ήδη");
        }
        this.Arithmos_Plaisiou = Arithmos_Plaisiou;
        this.Marka = Marka;
        this.Modelo = Modelo;
        this.Year = Year;
        this.Pinakida = Pinakida;
        vehicles.add(this);
    }

    public String getMarka() {
        return Marka;
    }

    public String getModelo() {
        return Modelo;
    }

    public String getYear() {
        return Year;
    }

    public String getPinakida() {
        return Pinakida;
    }

    public String getArithmos_Plaisiou() {
        return Arithmos_Plaisiou;
    }

    public static ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public String toString() {
        return Pinakida;
    }

    private static boolean isIdInList(String Arithmos_Plaisiou) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getArithmos_Plaisiou().equals(Arithmos_Plaisiou)) {
                return true;
            }
        }
        return false;

    }
}
