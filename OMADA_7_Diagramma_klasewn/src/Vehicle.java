import java.util.Vector;

public class Vehicle {
	private String _vehicle_Registration_Number;
	private String _brand;
	private String _model;
	private int _cubic_Meters;
	private String _colour;
	public Vector<Contract> _unnamed_Contract_ = new Vector<Contract>();

	public Vehicle(String aAVRN, String aABrand, String aAModel, int aACM, String aAColour) {
		throw new UnsupportedOperationException();
	}

	public void retrieve_info(Object aVehicle) {
		throw new UnsupportedOperationException();
	}

	public String getVehicle_Registration_Number() {
		return this._vehicle_Registration_Number;
	}

	public void setVehicle_Registration_Number(String aVehicle_Registration_Number) {
		this._vehicle_Registration_Number = aVehicle_Registration_Number;
	}

	public String getBrand() {
		return this._brand;
	}

	public void setBrand(String aBrand) {
		this._brand = aBrand;
	}

	public String getModel() {
		return this._model;
	}

	public void setModel(String aModel) {
		this._model = aModel;
	}

	public int getCubic_Meters() {
		return this._cubic_Meters;
	}

	public void setCubic_Meters(int aCubic_Meters) {
		this._cubic_Meters = aCubic_Meters;
	}

	public String getColour() {
		return this._colour;
	}

	public void setColour(String aColour) {
		this._colour = aColour;
	}
}