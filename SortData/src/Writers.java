import java.io.FileWriter;
import java.io.IOException;

public class Writers {

    public static FileWriter fileWriter;

    public static void saveData() {
        try {
            if (Statistics.amountIntegers > 0) {
                fileWriter = new FileWriter(Params.outputIntegers, !Params.rewriteResultFiles);
                fileWriter.write(Datas.stringBuilderInt.toString());
                fileWriter.flush();
                fileWriter.close();
            }
            if (Statistics.amountFloats > 0) {
                fileWriter = new FileWriter(Params.outputFloats, !Params.rewriteResultFiles);
                fileWriter.write(Datas.stringBuilderFlt.toString());
                fileWriter.flush();
                fileWriter.close();
            }
            if (Statistics.amountStrings > 0) {
                fileWriter = new FileWriter(Params.outputStrings, !Params.rewriteResultFiles);
                fileWriter.write(Datas.stringBuilderStr.toString());
                fileWriter.flush();
                fileWriter.close();
            }
        } catch (IOException ex) {
            System.out.println("Ошибка записи выходных данных");
            System.exit(1);
        }
    }
}
