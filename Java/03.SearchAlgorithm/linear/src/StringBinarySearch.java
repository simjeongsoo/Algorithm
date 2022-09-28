// 실습 3-6
// 자연 정렬이 된 배열에서 검색하기
// 문자열의 배열(자바의 키워드) 에서 검색

import java.util.Arrays;
import java.util.Scanner;
public class StringBinarySearch {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        String[] x = {    // 자바에서 사용하는 키워드(알파벳 순)
                "abstract",   "assert",       "boolean",   "break",      "byte",
                "case",       "catch",        "char",      "class",      "const",
                "continue",   "default",      "do",        "double",     "else",
                "enum",       "extends",      "final",     "finally",    "float",
                "for",        "goto",         "if",        "implements", "import",
                "instanceof", "int",          "interface", "long",       "native",
                "new",        "package",      "private",   "protected",  "public",
                "return",     "short",        "static",    "strictfp",   "super",
                "switch",     "synchronized", "this",      "throw",      "throws",
                "transient",  "try",          "void",      "volatile",   "while"
        };

        System.out.print("원하는 키워드를 입력하세요 : "); // 키값 입력
        String ky = stdIn.next();

        int idx = Arrays.binarySearch(x, ky); // 배열 x에서 값이 ky인 요소를 검색

        if (idx < 0) {
            System.out.println("search fail");
        }else System.out.println("x["+idx+"]");

    }
}
