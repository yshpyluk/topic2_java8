package refactoring;

/**
 * Created by yshpyluk on 3/23/17.
 */
class Student {
	String name;
	String group;

	public Student(String name, String group) {
		this.name = name;
		this.group = group;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}
}
