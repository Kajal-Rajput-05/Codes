 class Que1 {
    
    static final int no_of_char = 256;
    static char mostFreq(String str1) {
        int[] ctr = new int[no_of_char];
        int i;
        for ( i = 0; i < str1.length(); i++ ) {
            (ctr[str1.charAt(i)])++;
        }

        int ch1 = 0, ch2 = 0;
        for (i = 0; i < no_of_char; i++) {
            if (ctr[i] > ctr[ch1]) {
                ch2 = ch1;
                ch1 = i;
            } 
            else if (ctr[i] > ctr[ch2] && ctr[i] != ctr[ch1]) {
                ch2 = i;
            }
        }
        return (char) ch2;
    }
    public static void main(String args[]) {
        String str1 = "classrooms";
        System.out.println("Input : " + str1);

        char res = mostFreq(str1);

        if (res != '\0') {
            System.out.println("2nd most Frequent char : " + res);
        } else {
            System.out.println("Not such a case available");
        }
    }
}