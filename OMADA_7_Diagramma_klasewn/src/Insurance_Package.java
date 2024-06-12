import java.util.Vector;

public class Insurance_Package {
	private String _name;
	private double _cost;
	private String _state;
	public Vector<Contract> _unnamed_Contract_ = new Vector<Contract>();
	public Vector<Insurance_Package_Catalogue> _unnamed_Insurance_Package_Catalogue_ = new Vector<Insurance_Package_Catalogue>();
	public Vector<Insurance_Cover> _unnamed_Insurance_Cover_ = new Vector<Insurance_Cover>();

	public Insurance_Package(String aAName, double aACost, String aAState) {
		throw new UnsupportedOperationException();
	}

	public void select(Object aEdit) {
		throw new UnsupportedOperationException();
	}

	public void deny_edit() {
		throw new UnsupportedOperationException();
	}

	public void retrieve() {
		throw new UnsupportedOperationException();
	}

	public void set(Object aName, Object aCost, Object aState, Object aIns_cover) {
		throw new UnsupportedOperationException();
	}

	public void retrieve_info(Object aInsurance_package) {
		throw new UnsupportedOperationException();
	}

	public String getName() {
		return this._name;
	}

	public void setName(String aName) {
		this._name = aName;
	}

	public double getCost() {
		return this._cost;
	}

	public void setCost(double aCost) {
		this._cost = aCost;
	}

	public String getState() {
		return this._state;
	}

	public void setState(String aState) {
		this._state = aState;
	}
}