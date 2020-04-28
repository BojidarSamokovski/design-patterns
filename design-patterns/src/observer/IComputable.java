package observer;

public interface IComputable {

	void check();
	void removeError(String problem);
	void updateSystem(String problem);
}
