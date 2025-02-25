public enum Kinds {
    INT, FLT, STR;

    public static Kinds checkKind(String str) {
        if (str.matches("[-+]?\\d+")) {
            return Kinds.INT;
        }
        if (str.matches("[-+]?\\d+[.]\\d+([Ee][-+])?\\d+")) {
            return Kinds.FLT;
        }
        return Kinds.STR;
    }
}
