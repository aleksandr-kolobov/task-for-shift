public class Main {
    public static void main(String[] args) {

        Params.initParams(args);
        Readers.initReaders();

        for (int i = 0; i < Readers.listBufRead.size(); i++) {
            do {
                String str = Readers.readOneElement(i);
                if (str == null) break;
                switch (Kinds.checkKind(str)) {
                    case INT -> {
                        Datas.stringBuilderInt.append(str).append(System.lineSeparator());
                        Statistics.countInt(str);
                    }
                    case FLT -> {
                        Datas.stringBuilderFlt.append(str).append(System.lineSeparator());
                        Statistics.countFlt(str);
                    }
                    case STR -> {
                        Datas.stringBuilderStr.append(str).append(System.lineSeparator());
                        Statistics.countStr(str);
                    }
                }
            } while (true);
        }
        Statistics.printStatistics();
        Writers.saveData();
    }
}

//java -jar out\SortData.jar -o \data -p result_ -s data\in1.txt data\in2.txt data\in3.txt data\in4.txt
//java -jar out\SortData.jar -s -o \data\res -a -p sample- data\in1.txt data\in2.txt data\in3.txt