public class mathFunctions{

static int variables[] = new int[2];
static int var_pos = 0;
static int new_num;
static char symbol;

    //Stores 2 variables in an array
    public static void insert_variable(String number1){
        int stringNum = Integer.parseInt(number1);
        variables[var_pos] = stringNum;
        var_pos = 1;
    }

    //Sets the symbol for what arithmetic will be performed
    public static void setSign(char sign){
        symbol = sign;
    }

    //Computes the Arithmetic based on the symbol and the two values in the array
    public static String solve(String number2){
        int stringNum = Integer.parseInt(number2);
        System.out.print(stringNum);
        variables[var_pos] = stringNum;

        if(symbol == '+'){
           new_num = variables[0] + variables[1];
        }else if(symbol == '-'){
            new_num = variables[0] - variables[1];
        }else if(symbol == '/'){
            new_num = variables[0] / variables[1];
        }else if(symbol =='*'){
            new_num = variables[0] * variables[1];
        }
        var_pos = 0;
        String numString =Integer.toString(new_num);
        return numString;
}

}