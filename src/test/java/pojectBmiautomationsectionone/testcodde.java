package pojectBmiautomationsectionone;


		
		import java.io.File;

		public class testcodde {

		    public static void main(String[] args) {
		        // Specify the directory path
		        String directoryPath = "/path/to/your/directory";
		        
		        // Check directory write access
		        if (checkDirectoryWriteAccess(directoryPath)) {
		            System.out.println("Program has write access to the directory: " + directoryPath);
		        } else {
		            System.out.println("Program does not have write access to the directory: " + directoryPath);
		        }
		    }
		    
		    public static boolean checkDirectoryWriteAccess(String directoryPath) {
		        // Create a File object
		        File directory = new File(directoryPath);
		        
		        // Check if the directory exists
		        if (!directory.exists()) {
		            System.out.println("Directory does not exist: " + directoryPath);
		            return false;
		        }
		        
		        // Check if it is a directory
		        if (!directory.isDirectory()) {
		            System.out.println("The specified path is not a directory: " + directoryPath);
		            return false;
		        }
		        
		        // Check for write access by attempting to create a temporary file
		        File tempFile = null;
		        try {
		            tempFile = File.createTempFile("temp", null, directory);
		            return true;
		        } catch (Exception e) {
		            return false;
		        } finally {
		            // Clean up the temporary file if it was created
		            if (tempFile != null && tempFile.exists()) {
		                tempFile.delete();
		            }
		        }
		    }
		}

