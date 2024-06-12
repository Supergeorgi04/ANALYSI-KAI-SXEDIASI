import java.util.Vector;

public class Document {
	private int _id;
	private String _uRL;
	public Client _unnamed_Client_;
	public Vector<Documents_Catalogue> _unnamed_Documents_Catalogue_ = new Vector<Documents_Catalogue>();

	public Document(int aAnId, String aAURL) {
		throw new UnsupportedOperationException();
	}

	public void create(Object aId, Object aUrl) {
		throw new UnsupportedOperationException();
	}

	public void insert_document(Object aDocument) {
		throw new UnsupportedOperationException();
	}

	public int getId() {
		return this._id;
	}

	public void setId(int aId) {
		this._id = aId;
	}

	public String getURL() {
		return this._uRL;
	}

	public void setURL(String aURL) {
		this._uRL = aURL;
	}
}