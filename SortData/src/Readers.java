import java.io.*;
import java.util.ArrayList;

public class Readers {

    public static ArrayList<BufferedReader> listBufRead  = new ArrayList<>();

    public static void initReaders() {
        for (int i = 0; i < Params.inputFiles.size(); i++) {
            String name = Params.inputFiles.get(i);
            try {
                listBufRead.add(new BufferedReader(new FileReader(name)));
            } catch (FileNotFoundException ex) {
                System.out.println("Указанный файл не найден: " + name);
            }
        }
        if (listBufRead.isEmpty()) {
            System.out.println("Нет файлов с исходными данными!");
            System.exit(0);
        }
    }

    public static String readOneElement(int i) {
        String str = null;
        try {
            do {
                str = Readers.listBufRead.get(i).readLine();
            } while ((str != null) && str.isBlank());
            if (str == null) {
                Readers.listBufRead.get(i).close();
            }
        } catch (IOException ex) {
            System.out.println("Ошибка чтения входных данных");
        }
        return str;
    }

}