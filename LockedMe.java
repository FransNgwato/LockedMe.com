
public class LockedMe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                listFiles();
                break;
            case 2:
                fileOperations();
                break;
            case 3:
                System.out.println("Exiting the application...");
                scanner.close();
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}

public static void listFiles() {
    // Implement the code to list files in ascending order
}

public static void fileOperations() {
    // Implement the code to handle add, delete, and search operations
}
}
Listing Files:
java
Copy code
import java.io.File;
import java.util.Arrays;

public static void listFiles() {
File directory = new File(".");
String[] fileList = directory.list();
if (fileList != null) {
    Arrays.sort(fileList);
    System.out.println("Files in ascending order:");
    for (String file : fileList) {
        System.out.println(file);
    }
} else {
    System.out.println("The directory is empty.");
}
}

	}

}
