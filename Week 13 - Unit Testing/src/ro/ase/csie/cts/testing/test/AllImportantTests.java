package ro.ase.csie.cts.testing.test;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.csie.cts.testing.test.categories.ImportantTest;
import ro.ase.csie.cts.testing.test.categories.PerformanceTest;

@RunWith(Categories.class)
@IncludeCategory({ImportantTest.class, PerformanceTest.class})
@SuiteClasses({ TestStudent.class, TestStudentNewTest.class })
public class AllImportantTests {

}
