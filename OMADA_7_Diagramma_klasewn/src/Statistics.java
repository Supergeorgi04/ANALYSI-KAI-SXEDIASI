import java.util.Vector;

public class Statistics {
	private String _name;
	private double _price;
	private double _difference;
	public Vector<Statistics_catalogue> _unnamed_Statistics_catalogue_ = new Vector<Statistics_catalogue>();
	public Vector<Contract> _unnamed_Contract_ = new Vector<Contract>();
	public Vector<Client> _unnamed_Client_ = new Vector<Client>();
	public Vector<Accident> _unnamed_Accident_ = new Vector<Accident>();

	public Statistics(String aAName, double aAPrice, double aADiff) {
		throw new UnsupportedOperationException();
	}

	public void retrieve_name() {
		throw new UnsupportedOperationException();
	}

	public void retrieve_price() {
		throw new UnsupportedOperationException();
	}

	public void retrieve_difference() {
		throw new UnsupportedOperationException();
	}

	public void receive_name() {
		throw new UnsupportedOperationException();
	}

	public String getName() {
		return this._name;
	}

	public void setName(String aName) {
		this._name = aName;
	}

	public double getPrice() {
		return this._price;
	}

	public void setPrice(double aPrice) {
		this._price = aPrice;
	}

	public double getDifference() {
		return this._difference;
	}

	public void setDifference(double aDifference) {
		this._difference = aDifference;
	}
}