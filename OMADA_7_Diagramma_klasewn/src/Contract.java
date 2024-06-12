import java.util.Vector;

public class Contract {
	private long _start_of_Insurance;
	private long _expiration_of_Insurance;
	private double _cost;
	private String _state;
	public Client _unnamed_Client_;
	public Vehicle _unnamed_Vehicle_;
	public Insurance_Company _unnamed_Insurance_Company_;
	public Vector<Accident> _unnamed_Accident_ = new Vector<Accident>();
	public Statistics _unnamed_Statistics_;
	public Agent _unnamed_Agent_;
	public Insurance_Package _unnamed_Insurance_Package_;

	public void retrieve_info(Object aContract) {
		throw new UnsupportedOperationException();
	}

	public void insert_info() {
		throw new UnsupportedOperationException();
	}

	public void retrieve_id() {
		throw new UnsupportedOperationException();
	}

	public Contract(long aASofI, long aAnEofI, double aACost, String aAState) {
		throw new UnsupportedOperationException();
	}

	public long getStart_of_Insurance() {
		return this._start_of_Insurance;
	}

	public void setStart_of_Insurance(long aStart_of_Insurance) {
		this._start_of_Insurance = aStart_of_Insurance;
	}

	public long getExpiration_of_Insurance() {
		return this._expiration_of_Insurance;
	}

	public void setExpiration_of_Insurance(long aExpiration_of_Insurance) {
		this._expiration_of_Insurance = aExpiration_of_Insurance;
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