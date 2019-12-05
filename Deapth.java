import java.io.File;
public class Deapth {
	public static File listFilesRecursive(File root, File largestFile) {
		File[] listOfFilesAndDirectory= root.listFiles();
		if(listOfFilesAndDirectory !=null)
		{
			for (File file: listOfFilesAndDirectory)
			{
				if (file.isDirectory()) {
					largestFile = listFilesRecursive(file, largestFile);
				}else {
					if (largestFile == null || file.length() > largestFile.length())
						largestFile = file;
				//System.out.println(file + " " + file.length());
			
				}
			
			}
		}
		return largestFile;
}
	public static void main(String[] args) {
		String dir = "/users/abdal/documents";
		File largestFile = null;
		File rootDir = new File(dir);
		largestFile = listFilesRecursive(rootDir, largestFile);

		if (largestFile != null)
		{
			System.out.println("Largest file was: " + largestFile);
			System.out.println("its Size is: " + largestFile.length() + " bytes");
		}
	}
}


