import java.util.Scanner;
public class Main {
    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "admin";
    private static final int MAHASISWA_NIM_LENGTH = 15;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di Library Login System");

        while (true) {
            System.out.println("\nSilakan pilih jenis user:");
            System.out.println("1. Admin");
            System.out.println("2. Mahasiswa");
            System.out.println("3. Exit");
            System.out.print("Pilihan Anda: ");
            int userType = scanner.nextInt();

            if (userType == 1) {
                adminLogin(scanner);
            } else if (userType == 2) {
                mahasiswaLogin(scanner);
            } else if (userType == 3) {
                System.out.println("Terima kasih telah menggunakan Library Login System.");
                break;
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private static void adminLogin(Scanner scanner) {
        System.out.print("Masukkan username: ");
        String username = scanner.next();
        System.out.print("Masukkan password: ");
        String password = scanner.next();

        if (username.equals(ADMIN_USERNAME) && password.equals(ADMIN_PASSWORD)) {
            System.out.println("Login admin berhasil.");
            // Tambahkan aksi yang sesuai setelah login admin berhasil
        } else {
            System.out.println("Username atau password admin salah.");
        }
    }

    private static void mahasiswaLogin(Scanner scanner) {
        System.out.print("Masukkan NIM: ");
        String nim = scanner.next();
        System.out.print("Masukkan password: ");
        String password = scanner.next();

        if (nim.length() == MAHASISWA_NIM_LENGTH && nim.equals(password)) {
            System.out.println("Login mahasiswa berhasil.");
            // Tambahkan aksi yang sesuai setelah login mahasiswa berhasil
        } else {
            System.out.println("NIM atau password salah.");
        }
    }
}
