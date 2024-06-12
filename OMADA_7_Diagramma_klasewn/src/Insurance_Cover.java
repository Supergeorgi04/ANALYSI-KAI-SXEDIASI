import java.util.Vector;

public class Insurance_Cover {
	private int _id;
	private String _name;
	public Vector<Insurance_Package> _unnamed_Insurance_Package_ = new Vector<Insurance_Package>();

	public Insurance_Cover(int aAnId, String aAName) {
		throw new UnsupportedOperationException();
	}

	public int getId() {
		return this._id;
	}

	public String getName() {
		return this._name;
	}
}