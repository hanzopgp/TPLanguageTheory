package TP1;

/**
 * Pour itérer sur les codePoint Unicode d'une chaîne.
 * Si le codePoint correspond à 2 char, il faut avancer l'index 2 fois.
 */
final class CodePointIterator {
    private final String sequence;
    private int index = 0;

    public CodePointIterator(String sequence) {
        this.sequence = sequence;
    }

    public boolean hasNext() {
        return index < sequence.length();
    }

    public int next() {
        int codePoint = sequence.codePointAt(index++);
        if (Character.charCount(codePoint) == 2) {
            index++;
        }
        return codePoint;
    }
}