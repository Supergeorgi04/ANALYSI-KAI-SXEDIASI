import java.util.ArrayList;

public class SafeCar {

    private static ArrayList<SafeCar> customers = new ArrayList<SafeCar>();

    protected String Name;
    private String LastName;
    private String Phone;
    private String Email;
    private String Arithmos_Taftotitas;

    public void Customer(String Name, String LastName, String Phone, String Email, String Arithmos_Taftotitas)
            throws Exception {
        if (isIdInList(Arithmos_Taftotitas)) {
            throw new Exception("Ο αριθμός ταυτότητας (" + Arithmos_Taftotitas + ") υπάρχει ήδη");
        }
        this.Arithmos_Taftotitas = Arithmos_Taftotitas;
        this.Name = Name;
        this.LastName = LastName;
        this.Phone = Phone;
        this.Email = Email;
        customers.add(this);
    }

    public String getName() {
        return Name;
    }

    public String getLastName() {
        return LastName;
    }

    public String getPhone() {
        return Phone;
    }

    public String getEmail() {
        return Email;
    }

    public String getArithmos_Taftotitas() {
        return Arithmos_Taftotitas;
    }

    public static ArrayList<SafeCar> getSafeCars() {
        return customers;
    }

    private static boolean isIdInList(String Arithmos_Taftotitas) {
        for (SafeCar customer : customers) {
            if (customer.getArithmos_Taftotitas().equals(Arithmos_Taftotitas)) {
                return true;
            }
        }
        return false;
    }

}
