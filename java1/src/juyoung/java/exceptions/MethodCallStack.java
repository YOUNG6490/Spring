package juyoung.java.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MethodCallStack {  // checked Exception example
    public void go() { // "throws" is toss / sequence 3
        try (FileReader in = new FileReader("alphabet.txt");
             BufferedReader reader = new BufferedReader(in)) {   // try-with (if this phrase have error) remove red line
            String str = reader.readLine();
            System.out.println(str);
        } catch (IOException e) { // if catch some error print
            e.printStackTrace();       // print error
        }
    }
        /*
        BufferedReader reader = null;
        try {               // try catch (if this phrase have error) remove red line
            reader = new BufferedReader(
                    new FileReader("alphabet.txt"));
            String str = reader.readLine();
            System.out.println(str);
        } catch (IOException e) { // if catch some error print
            e.printStackTrace();       // print error
        } finally { // 자원의 해제는 반드시 finally 에서 해야한다.
                try {                // 자원 해제를 위해서 너무 많은 구문이 소요 -> try 대체
                    if (reader != null) // if this phrase don't exist, there is nullpointexception
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }
*/

    public void come() {   // sequence 2
            go();
    }

    public static void main(String[] args) {  // sequence 1
        new MethodCallStack().come();
    }
}
