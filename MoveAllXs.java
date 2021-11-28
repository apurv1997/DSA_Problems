//Move all X's to the end of the String.

public class MoveAllXs {
    public static void moveAllXs(String str, int idx, int count, String newString) {
        if(idx == str.length()){
            for(int i=0; i<count; i++){
                newString += 'x';
            }
            System.out.println(newString);
            return ;
        }

        char currChar = str.charAt(idx);
        if(currChar == 'x'){
            count++;
            moveAllXs(str, idx+1, count, newString);
        } else {
            newString += currChar;  // newString = newString + currChar;
            moveAllXs(str, idx+1, count, newString);
        }
    }

    public static void main(String[] args) {
        String str = "axbcxxd";
        moveAllXs(str, 0, 0, "");    }
}
