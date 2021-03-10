package test.q22;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<StudentDTO> set = new HashSet<StudentDTO>();
		
		set.add(new StudentDTO(1, "hong"));
		set.add(new StudentDTO(2, "shin"));
		set.add(new StudentDTO(1, "jo"));
		
		Iterator<StudentDTO> iterator = set.iterator();
		while(iterator.hasNext()) {
			StudentDTO student = iterator.next();
			System.out.println(student.studentNum + ":" + student.name);
		}
	}
}
