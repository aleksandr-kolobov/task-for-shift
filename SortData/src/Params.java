import java.util.ArrayList;

public class Params {

    public static String resPath = "";
    public static String resFilePref = "";
    public static boolean rewriteResultFiles = true;
    public static boolean shortStatistics = true;
    public static ArrayList<String> inputFiles = new ArrayList<>();
    public static String outputIntegers;
    public static String outputFloats;
    public static String outputStrings;

    public static void initParams(String[] args) {

        int i = -1;
        while (++i < args.length) {
            if (args[i].equals("-o") && (args.length > ++i)) {
                resPath = args[i];
                continue;
            }
            if (args[i].equals("-p") && (args.length > ++i)) {
                resFilePref = args[i];
                continue;
            }
            if (args[i].equals("-a")) {
                rewriteResultFiles = false;
                continue;
            }
            if (args[i].equals("-f")) {
                shortStatistics = false;
                continue;
            }
            if (args[i].charAt(0) == '-') {
                continue;
            }
            inputFiles.add(args[i]);
        }

        if (!resPath.isEmpty()) {
            resPath = resPath.substring(1) + resPath.charAt(0);
        }

        outputIntegers = resPath + resFilePref + "integers.txt";
        outputFloats = resPath + resFilePref + "floats.txt";
        outputStrings = resPath + resFilePref + "strings.txt";

    }

}