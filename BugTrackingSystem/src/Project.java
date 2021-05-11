import java.util.Date;

public class Project {
	private static int id;
	private static String name;
	private String type;
//	private Date startDate = new Date();;
//	private Date endDate = new Date();
//	Project project = new Project = new Project();

	public static void main(String[] args) {
		addProject(id, name);
	}

	public static void addProject(int id, String name) {
		Tester tester = new Tester();
		tester.testing();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
