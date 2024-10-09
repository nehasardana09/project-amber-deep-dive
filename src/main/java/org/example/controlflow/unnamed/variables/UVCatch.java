 void validateNumber(String s) {
    try {
        int i = Integer.parseInt(s);
        System.out.println(i + " is valid");
    } catch (NumberFormatException _) {
        System.out.println(s+ " isn't valid");
    }
}

 public void main() {
    validateNumber("12");
    validateNumber("String");
 }