import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class BreadthTest {

	@Test
	public void testMain() {
	String rootDir = "/users/abdal/documents";
	File root = new File(rootDir);
	System.out.println("Finding largest file (Depth First)...");
	File depthLargest = Deapth.listFilesRecursive(root, null);
	System.out.println("Finding largest file (Breadth First)...");
	File breadthLargest = Breadth.findLargest(rootDir);
	Object FILE_SIZE;
	String LARGEST_FILE;
	assertTrue(depthLargest.equals(breadthLargest));
	System.out.println("Files are the same!");
}

	private void directory() {
		System.out.println();
		
	}

}
