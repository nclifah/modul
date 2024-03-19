import java.util.Scanner;

class Main {
    private static Book[] bookList = {
            new Book("123", "The Great Gatsby", "F. Scott Fitzgerald", 10),
            new Book("456", "To Kill a Mockingbird", "Harper Lee", 15),
            new Book("789", "1984", "George Orwell", 20)
    };

    private static User[] userStudent = {
            new User("123456789", "John Doe"),
            new User("987654321", "Jane Smith")
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Library System");
        System.out.println("1. Login as Admin");
        System.out.println("2. Login as Student");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            Admin admin = new Admin();
            admin.menuAdmin();
        } else if (choice == 2) {
            Student student = new Student();
            student.menuStudent();
        } else {
            System.out.println("Invalid choice!");
        }
    }

    static class Student {
        public void menuStudent() {
            displayBooks();
            logout();
        }

        private void displayBooks() {
            System.out.println("Available Books:");
            for (Book book : bookList) {
                System.out.println(book);
            }
        }

        private void logout() {
            System.out.println("Logged out from student account.");
        }
    }

    static class Admin {
        public void menuAdmin() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            if (choice == 1) {
                addStudent();
            } else if (choice == 2) {
                displayStudent();
            } else {
                System.out.println("Invalid choice!");
            }
        }

        private void addStudent() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            System.out.print("Enter student nim: ");
            String nim = scanner.nextLine();
            if (nim.length() != 15) {
                System.out.println("Invalid nim! Must be 15 characters long.");
                return;
            }
            System.out.print("Enter student faculty: ");
            String faculty = scanner.nextLine();
            System.out.print("Enter student study program: ");
            String studyProgram = scanner.nextLine();
            System.out.println("Student added successfully!");
        }

        private void displayStudent() {
            System.out.println("List of Students:");
            for (User user : userStudent) {
                System.out.println(user);
            }
        }
    }

    static class Book {
        private String id;
        private String title;
        private String author;
        private int stock;

        public Book(String id, String title, String author, int stock) {
            this.id = id;
            this.title = title;
            this.author = author;
            this.stock = stock;
        }


        public String toString() {
            return "Book [id=" + id + ", title=" + title + ", author=" + author + ", stock=" + stock + "]";
        }
    }

    static class User {
        private String nim;
        private String name;

        public User(String nim, String name) {
            this.nim = nim;
            this.name = name;
        }


        public String toString() {
            return "User [nim=" + nim + ", name=" + name + "]";
        }
    }
}