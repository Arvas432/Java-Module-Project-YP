public class FormatChecker {
    public static double parseInput(String input){
        int counter = 0;
        boolean pastDecimal = false;
        for(int i = 0; i<input.length(); i++){
            if(input.charAt(i) == '.'){
                pastDecimal = true;

            }
            if (pastDecimal){
                counter++;
            }
        }
        if(counter == 3){
            double d;
            try {
                d = Double.parseDouble(input);
            }
            catch (NumberFormatException e) {

                d = -1.0;
            }
            return d;
        }
        else {
            return -1.0;
        }
    }
    public static String getRubleFormat(double input){
        String result = null;
        int parsedInput = (int)Math.floor(input);
        if(parsedInput % 100 > 4 && parsedInput % 100 < 21){
            result = "рублей";
        }
        else if (parsedInput % 10 == 1) {
            result = "рубль";
        }
        else if(parsedInput % 10 > 1 && parsedInput % 10 < 5){
            result = "рубля";
        }
        else {
            result = "рублей";
        }
        return result;
    }
}




