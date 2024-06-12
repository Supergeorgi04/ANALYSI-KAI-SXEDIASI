import java.util.Vector;

public class Client {
	private String _full_Name;
	private long _date_of_Birth;
	private String _address;
	private long _drivers_License_Number;
	public Vector<Document> _unnamed_Document_ = new Vector<Document>();
	public Statistics _unnamed_Statistics_;
	public Vector<Client_Catalogue> _unnamed_Client_Catalogue_ = new Vector<Client_Catalogue>();
	public Vector<Contract> _unnamed_Contract_ = new Vector<Contract>();

	public Client(String aAFN, long aADofB, String aAnAddress, long aADLN) {
		throw new UnsupportedOperationException();
	}

	public void retrieve(Object aClient) {
		throw new UnsupportedOperationException();
	}

	public void retrieve_name() {
		throw new UnsupportedOperationException();
	}

	public void retrieve_date_of_birth() {
		throw new UnsupportedOperationException();
	}

	public void retrieve_address() {
		throw new UnsupportedOperationException();
	}

	public void retrieve_license_number() {
		throw new UnsupportedOperationException();
	}

	public String getFull_Name() {
		return this._full_Name;
	}

	public void setFull_Name(String aFull_Name) {
		this._full_Name = aFull_Name;
	}

	public long getDate_of_Birth() {
		return this._date_of_Birth;
	}

	public void setDate_of_Birth(long aDate_of_Birth) {
		this._date_of_Birth = aDate_of_Birth;
	}

	public String getAddress() {
		return this._address;
	}

	public void setAddress(String aAddress) {
		this._address = aAddress;
	}

	public long getDrivers_License_Number() {
		return this._drivers_License_Number;
	}

	public void setDrivers_License_Number(long aDrivers_License_Number) {
		this._drivers_License_Number = aDrivers_License_Number;
	}
}