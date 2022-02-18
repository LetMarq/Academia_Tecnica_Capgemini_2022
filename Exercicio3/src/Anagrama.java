import java.util.Scanner;

public class Anagrama {
    public static boolean compareStrings(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }
        int init_window = 0, j = 0;
        while (true) {

            if (first.charAt(init_window) == second.charAt(j)) {
                first = first.substring(0, init_window)
                        + ((init_window == first.length() - 1) ? "" : first.substring(init_window + 1));
                second = second.substring(0, j) + ((j == second.length() - 1) ? "" : second.substring(j + 1));
                if (init_window > first.length() - 1) {
                    break;
                } else if (j > second.length() - 1) {
                    j = 0;
                }
            } else if (j < second.length() - 1) {
                j++;
            } else if (init_window < first.length() - 1) {
                init_window++;
                j = 0;
            } else
                break;

        }
        if (first.length() == second.length() && first.length() == 0) {
            System.out.println("Deu certo");
            return true;

        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira a String a ser testada:  ");
        String text = sc.nextLine();
        int count = 0;
        int text_len = text.length();
        sc.close();
        for (int window_size = 1; window_size <= text_len - 1; window_size++) {
            for (int init = 0; init < (text_len - window_size); init++) {
                System.out.println("Tamanho da janela: " + window_size);
                System.out.println("Inicio da varredura: " + init);
                for (int init_window = (init + 1); init_window <= (text_len - window_size); init_window++) {
                    if (init != init_window) {
                        System.out.println("Tentando com " + text.substring(init, init + window_size) + " "
                                + text.substring(init_window, init_window + window_size));
                        System.out.println("Intervalos " + init + "," + (init + window_size) + " - "
                                + (init_window) + "," + (init_window + window_size));
                        if (compareStrings(text.substring(init, init + window_size),
                                text.substring(init_window, init_window + window_size))) {
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }

}