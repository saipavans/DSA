package recursion.diskusage;

import java.io.File;

public class DiskUsage {
	
	private static long diskUsage(File path) {
		
		long length = path.length();
		
		if (path.isDirectory()) {
			File[] directoryContents = path.listFiles();
			
			for (File subPath : directoryContents) {
				length += diskUsage(subPath);
			}
			
			System.out.println(length + "\t" + path);
			
		} else {
			System.out.println(length + "\t" + path);
		}
		
		return length;
	}

	public static void main(String[] args) {
		
		diskUsage(new File("."));

	}

}
