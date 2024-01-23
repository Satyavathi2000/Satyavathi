package Strings;

public class Rotation {

            static boolean isRotation(String str1, String str2) {
            if (str1.length() != str2.length() || str1.isEmpty() || str2.isEmpty()) {
                return false;
            }

            String concatenatedStr = str1 + str1;

            return concatenatedStr.contains(str2);
        }
        public static void main(String[] args) {
            String str1 = "JavaJ2eeStrutsHibernate";
            String str2 = "StrutsHibernateJavaJ2ee";

            if (isRotation(str1, str2)) {
                System.out.println("Output: true");
            } else {
                System.out.println("Output: false");
            }
        }
    }


