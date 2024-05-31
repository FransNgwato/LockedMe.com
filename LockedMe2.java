
public class LockedMe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		public static void fileOperations() {
		   
		    
		    int choice = scanner.nextInt();
		    scanner.nextLine(); // Consume newline
		    switch (choice) {
		        case 1:
		            System.out.print("Enter the name of the file to add: ");
		            String addFileName = scanner.nextLine();
		            addFile(addFileName);
		            break;
		        case 2:
		            System.out.print("Enter the name of the file to delete: ");
		            String deleteFileName = scanner.nextLine();
		            deleteFile(deleteFileName);
		            break;
		        case 3:
		            System.out.print("Enter the name of the file to search: ");
		            String searchFileName = scanner.nextLine();
		            searchFile(searchFileName);
		            break;
		        case 4:
		            return;
		        default:
		            System.out.println("Invalid choice. Please try again.");
		    }
		}

		public static void addFile(String fileName) {
		    File file = new File(fileName);
		    try {
		        if (file.createNewFile()) {
		            System.out.println("File created: " + fileName);
		        } else {
		            System.out.println("File already exists.");
		        }
		    } catch (IOException e) {
		        System.out.println("An error occurred while creating the file.");
		        e.printStackTrace();
		    }
		}

		public static void deleteFile(String fileName) {
		    File file = new File(fileName);
		    if (file.delete()) {
		        System.out.println("File deleted: " + LockedMe);
		    } else {
		        System.out.println("File not found.");
		    }
		}

		public static void searchFile(String fileName) {
		    File file = new File(fileName);
		    if (file.exists()) {
		        System.out.println("File found: " + LockedMe);
		    } else {
		        System.out.println("File not found.");
		    }
		}


	}

}
