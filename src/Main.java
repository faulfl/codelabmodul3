import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Pertanyaan Pilihan Ganda ===");
        System.out.println("testtt");
        System.out.println("Siapa yang paling ganteng?");
        System.out.println("a. Kipli");
        System.out.println("b. King Henry");
        System.out.println("c. Ronaldo Wati");
        System.out.print("Jawaban kamu (a/b/c): ");

        String jawaban = input.nextLine().trim();

        if (jawaban.equalsIgnoreCase("a")) {
            System.out.println("Kamu memilih: Kipli 😎 — Jawaban benar!");
        } else if (jawaban.equalsIgnoreCase("b")) {
            // Melempar exception sesuai permintaan
            throw new RuntimeException("jawaban anda salah, coba lagi");

        } else if (jawaban.equalsIgnoreCase("c")) {
            // Melempar exception sesuai permintaan
            throw new RuntimeException("jawaban anda salah, coba lagi");
        } else if (jawaban.equalsIgnoreCase("D")) {
            // Melempar exception sesuai permintaan
            throw new RuntimeException("jawaban anda salah, coba lagi");
        } else {
            System.out.println("Pilihan tidak valid! Harus a atau b.");
        }

        input.close();
    }
}
