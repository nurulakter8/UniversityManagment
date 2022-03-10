import java.util.ArrayList;
import java.util.Iterator;

public class University_Management {
	private String univ_name;

	public void do_the_Work(ArrayList<Integer> empList) {
		Iterator<Integer> iterator = empList.iterator();
		Iterator<Integer> it = iterator;

		while (it.hasNext()) {
			Object emp = it.hasNext();
			if (emp instanceof Faculty) {
				((Faculty) it).teach();
			} else if (emp instanceof Staff) {
				((Staff) emp).assist();
			} else if (emp instanceof Student) {
				((Student) emp).study();
			}
		}

	}

	public String getUniv_name() {
		return univ_name;
	}

	public void setUniv_name(String univ_name) {
		this.univ_name = univ_name;
	}
}
