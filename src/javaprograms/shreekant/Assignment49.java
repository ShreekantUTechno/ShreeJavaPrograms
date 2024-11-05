package shreekant;

class Assignment49 {

    void getVowelFreq(String name) {
        String toLowerCase = name.toLowerCase();
        int aCount = 0, eCount = 0, iCount = 0, uCount = 0, oCount = 0;
        for (int index = 0; index < toLowerCase.length(); index++) {
            char ch = toLowerCase.charAt(index);
            if (ch == 'a') {
                aCount++;
            } else if (ch == 'e') {
                eCount++;
            } else if (ch == 'i') {
                iCount++;
            } else if (ch == 'o') {
                oCount++;
            } else if (ch == 'u') {
                uCount++;
            }
        }
        if (aCount > 0) {
            System.out.println("a" + " --> " + aCount);
        }
        if (eCount > 0) {
            System.out.println("e" + " --> " + eCount);
        }
        if (iCount > 0) {
            System.out.println("i" + " --> " + iCount);
        }
        if (oCount > 0) {
            System.out.println("o" + " --> " + oCount);
        }
        if (uCount > 0) {
            System.out.println("u" + " --> " + uCount);
        }
    }

    public static void main(String[] args) {
    	Assignment49 hello = new Assignment49();
        hello.getVowelFreq("technocredits");
    }
}

/*

Assignment - 49 : 5th July'2024
 Print frequency of each vowel character in a given string.
 
 input : technocredits
 output : e -> 2
          o -> 1
          e -> 2
          i -> 1 
          
*/
