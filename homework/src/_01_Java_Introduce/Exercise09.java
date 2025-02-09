package _01_Java_Introduce;

public class Exercise09 {
    public static void main(String[] args) {
        System.out.println("Dân số hiện nay là 312.032.486");
        System.out.printf("Dân số sau một năm sẽ là: %.2f\n", (312_032_486 + 1 * (365 * 24 * 60 * 60) * (1.0 / 6 - 1.0 / 15 + 1.0 / 40)));
        System.out.printf("Dân số sau hai năm sẽ là: %.2f\n", (312_032_486 + 2 * (365 * 24 * 60 * 60) * (1.0 / 6 - 1.0 / 15 + 1.0 / 40)));
        System.out.printf("Dân số sau ba năm sẽ là: %.2f\n", (312_032_486 + 3 * (365 * 24 * 60 * 60) * (1.0 / 6 - 1.0 / 15 + 1.0 / 40)));
        System.out.printf("Dân số sau bốn năm sẽ là: %.2f\n", (312_032_486 + 4 * (365 * 24 * 60 * 60) * (1.0 / 6 - 1.0 / 15 + 1.0 / 40)));
        System.out.printf("Dân số sau năm năm sẽ là: %.2f\n", (312_032_486 + 5 * (365 * 24 * 60 * 60) * (1.0 / 6 - 1.0 / 15 + 1.0 / 40)));
    }
}
