public class PatternDetector {

    public PatternDetector(){
        System.out.println("Pattern detector created from " + Thread.currentThread().getStackTrace()[2].getClassName() + ">>" + Thread.currentThread().getStackTrace()[2].getMethodName());
    }

    public boolean isIsogram(String string){
        if(string.matches(".*\\d.*")){
            throw new IllegalArgumentException();
        }

        return string.length() == (this.removeDuplicatedCharacters(string)).length();
    }

    public boolean isPalindrome(String string){
        return this.reverseString(string).equals(string);
    }

    public String removeDuplicatedCharacters(String string) {
        final StringBuilder output = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            String character = string.substring(i, i + 1);
            if (output.indexOf(character) < 0) // if not contained
                output.append(character);
        }
        return output.toString();
    }

    public String reverseString(String string){
            byte [] strAsByteArray = string.getBytes();
            byte [] result = new byte [strAsByteArray.length];
            for (int i = 0; i < strAsByteArray.length; i++){
                result[i] = strAsByteArray[strAsByteArray.length-i-1];
            }
           return new String(result);

    }
}
