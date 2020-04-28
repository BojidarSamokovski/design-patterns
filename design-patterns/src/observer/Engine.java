package observer;

import java.util.ArrayList;
import java.util.List;

public class Engine implements IComputable {

	protected String type;
	boolean working = false;
	protected int id;
	protected  List<String> errors = new ArrayList<String>();
	
	public Engine()
	{

	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setWorking(boolean working) {
		this.working = working;
		System.out.println("vutututututu.");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public void check()
	{
		for (String val : this.errors) {
			System.out.println(val);
		}
	}

	@Override
	public void removeError(String problem)
	{
		if(this.errors.isEmpty())
		{
			this.errors.remove(problem);
		}

	}

	@Override
	public void updateSystem(String problem) {
		
		if(this.errors.isEmpty())
		{
			this.errors.add(problem);
		}
	}

}
