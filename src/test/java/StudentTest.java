import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import javax.naming.Name;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;
public class StudentTest {

	private Student acctualStudent;
	private Student emptyStudent;
	private ArrayList<Integer> emptyArrayList;



	@Before
	public void setup() {
		acctualStudent = new Student(1L, "Steve");
		emptyArrayList = new ArrayList<>();
	}

	@Test
	public void testStudentConstructor() {
		assertNull(emptyStudent);
		assertNotNull(acctualStudent);

	}

	@Test
	public void testStudentGetters() {
		assertEquals(acctualStudent.getName(), "Steve");
		assertEquals(acctualStudent.getId(), 1L);

		assertNotNull(acctualStudent.getGrade());
		assertEquals(acctualStudent.getGrades(), emptyArrayList);
	}


	@Test
	public void testStudentAddGrade(){
		acctualStudent.addGrade(50);
		acctualStudent.addGrade(75);
		acctualStudent.addGrade(100);

		ArrayList<Integer> expectedGrades = new ArrayList<>(Arrays.asList(50, 75, 100));

		assertEquals(acctualStudent.getGrades(), Arrays.asList(50, 75, 100));


	}

	@Test
	public void testStudentGetGradeAverage() {
		acctualStudent.addGrade(50);
		acctualStudent.addGrade(75);
		acctualStudent.addGrade(100);

		assertEquals(acctualStudent.getGradeAverage(), 75, 0.000001);
	}


}
