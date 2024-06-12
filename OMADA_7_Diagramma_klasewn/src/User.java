import java.util.Vector;

public class User {
	private String _email;
	private String _password;
	public Vector<User_Catalogue> _unnamed_User_Catalogue_ = new Vector<User_Catalogue>();

	public User(String aAnEmail, String aPwd) {
		throw new UnsupportedOperationException();
	}

	public void retrieve_mail_pass() {
		throw new UnsupportedOperationException();
	}

	public String getEmail() {
		return this._email;
	}

	public String getPassword() {
		return this._password;
	}
}