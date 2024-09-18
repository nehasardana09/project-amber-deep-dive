 void validateNumber(String s) {
    try {
        int i = Integer.parseInt(s);
        System.out.println(STR."\{i} is valid");
    } catch (NumberFormatException _) {
        System.out.println(STR."\{s} isn't valid");
    }
}

 public void main() {
    validateNumber("12");
    validateNumber("String");
 }