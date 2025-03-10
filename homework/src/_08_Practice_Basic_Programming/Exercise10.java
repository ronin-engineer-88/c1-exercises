package _08_Practice_Basic_Programming;

public class Exercise10 {
    public static void main(String[] args) {
        int k = 1181775932;
        int[] array1D = {
                -1118695764, 253936797, 1295064699, -327282956, 1555113638,
                -1315991583, 648216999, 770772745, 713874256, 455299402,
                1358813637, 2091843618, -156036984, 1837041811, -2125395242,
                118654761, -47372797, -1462823794, 531069097, 1209960809,
                -1462348147, 779976684, 1323245109, -2096539217, -1519814521,
                498650504, -1488888866, 413310020, 193185533, 1063121171
        };

        boolean flag = false;
        for (int i = 0; i < array1D.length; i++) {
            for (int j = 0; j < array1D.length; j++) {
                if (array1D[i] + array1D[j] == k) {
                    System.out.printf("[i, j] = [%d, %d]\n", i, j);
                    System.out.printf("i + j = %d + %d = %d\n", i, j, i + j);
                    flag = true;
                    break;
                }
                if (flag) break;
            }
        }
    }
}
