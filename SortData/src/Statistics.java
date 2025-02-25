public class Statistics {

    public static int amountIntegers = 0;
    public static int amountFloats = 0;
    public static int amountStrings = 0;
    public static long minInteger;
    public static long maxInteger;
    public static long sumInteger;
    public static double minFloat;
    public static double maxFloat;
    public static double sumFloat;
    public static int shortestString;
    public static int longestString;

    public static void printStatistics() {
        System.out.println("amountIntegers->" + amountIntegers);
        System.out.println("amountFloats->" + amountFloats);
        System.out.println("amountStrings->" + amountStrings);

        if (!Params.shortStatistics) {
            System.out.println("minInteger->" + minInteger);
            System.out.println("maxInteger->" + maxInteger);
            System.out.println("sumInteger->" + sumInteger);
            System.out.println("avgInteger->" + (double)sumInteger/amountIntegers);

            System.out.println("minFloat->" + minFloat);
            System.out.println("maxFloat->" + maxFloat);
            System.out.println("sumFloat->" + sumFloat);
            System.out.println("avgFloat->" + (double)sumFloat/amountFloats);

            System.out.println("shortestString->" + shortestString);
            System.out.println("longestString->" + longestString);
        }
    }

    public static void countInt(String str) {
        amountIntegers++;
        if (!Params.shortStatistics) {
            long l = minInteger;
            try {
                l = Long.parseLong(str);
            } catch (Exception ex) {
                System.out.println("Ошибка парсинга целого: " + str);
                sumInteger -= l;
            }
            if (amountIntegers == 1) {
                minInteger = l;
                maxInteger = l;
            } else {
                minInteger = Math.min(minInteger, l);
                maxInteger = Math.max(maxInteger, l);
            }
            sumInteger += l;
        }
    }

    public static void countFlt(String str) {
        amountFloats++;
        if (!Params.shortStatistics) {
            double d = minFloat;
            try {
                d = Double.parseDouble(str);
            } catch (Exception ex) {
                System.out.println("Ошибка парсинга не целого: " + str);
                sumFloat -= d;
            }
            if (amountFloats == 1) {
                minFloat = d;
                maxFloat = d;
            } else {
                minFloat = Math.min(minFloat, d);
                maxFloat = Math.max(maxFloat, d);
            }
            sumFloat += d;
        }
    }

    public static void countStr(String str) {
        amountStrings++;
        if (amountFloats == 1) {
            shortestString = str.length();
            longestString = str.length();
        } else {
            shortestString = Math.min(shortestString, str.length());
            longestString = Math.max(longestString, str.length());
        }
    }
}
