/* Problem Text:

------------------------------------------
** Take an Array List of String Type
** Add Your Friends Name
** Create a method Which Checks every Name of that Array-List and
** Print if the Name Ends with a Vowel or, Not
 */
package codePackage;

import java.util.ArrayList;

public class ArrayListToCheckStrings {

    public static void main(String[] args) {

        ArrayList<String> myArrayList = new ArrayList<>();
        /*
        ** Adding Values In An Array List 
         */
        myArrayList.add("Shunjid Rahman Showrov");
        myArrayList.add("Zubayer Alam");
        myArrayList.add("Satya Nadella");


        for (int x = 0; x < myArrayList.size(); ++x) {
            
            if (ifMyFriendsNameEndsWithAVowel(myArrayList.get(x))) {
                System.out.println(myArrayList.get(x) + " :     Name Ends with a Vowel\n");
            } else {
                System.out.println(myArrayList.get(x) + " :     Name Does Not End with a Vowel\n");
            }
            
        }

    }

    private static boolean ifMyFriendsNameEndsWithAVowel(String Name) {
        return Name.endsWith("a") || Name.endsWith("e")
                || Name.endsWith("i") || Name.endsWith("o") || Name.endsWith("u");
    }
}
