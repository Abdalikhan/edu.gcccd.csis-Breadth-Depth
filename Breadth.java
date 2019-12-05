import java.io.File;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;
public class Breadth {
	public static void main(String[] args) {
		String rootDir = "/users/Abdal/documents";
		File largestFile = findLargest(rootDir);
		if (largestFile != null)
			System.out.println("Largest file was: " + largestFile);
		System.out.println("its Size is: " + largestFile.length() + " bytes");
	}
	
	static File findLargest(String rootDir)
	{
		File largestFile = null;
		Queue<File> queue = new LinkedList<>();
		queue.add(new File(rootDir));
		while (!queue.isEmpty())
		{
			File current = queue.poll();
			File[] listOfFilesAndDirectory = current.listFiles();
			if(listOfFilesAndDirectory != null)
			{
				for (File file : listOfFilesAndDirectory)
				{
					if(file.isDirectory()) {
						queue.add(file);
					}
					else {
							if (largestFile == null || file.length() > largestFile.length())
								largestFile = file;
						//	System.out.println(file);
						}
					}
					
				}
		}
		return largestFile;
	}
}


