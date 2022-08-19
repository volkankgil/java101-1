package java101.src.finalproject;

public class MineSweeperr {
    int rowNumber;
    int colNumber;
    int mineNumber = (rowNumber*colNumber) / 4;
    int userPointChoiseRow ;
    int userPointChoiseCol ;


    MineSweeperr(int rowNumber, int colNumber){
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.mineNumber = (rowNumber*colNumber) / 4;
    }

    String[][] table(){
        String[][] table = new String[this.rowNumber][this.colNumber];

        for (int row = 0; row < table.length ;row ++){
            for (int col = 0; col < table[row].length ;col++){
                table[row][col] = "-";
            }
        }
        for (int i = 0; i< mineNumber ; i++) {
            int a = (int)(Math.random() * (rowNumber-1));
            int b =(int)(Math.random() * (colNumber-1));
            if (table[a][b] != "*"){
                table[a][b] = "*";
            }else {
                i--;
            }
        }
        return table;
    }

    void printTable(String[][] arg){

        System.out.println("=================\n");
        for (int row = 0; row < arg.length ;row ++){
            for (int col = 0; col < arg[row].length ;col++){
                System.out.print(" " + arg[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
        System.out.println("=================\n");
    }

    boolean isMine(String[][] arg, int userPointChoiseRow, int userPointChoiseCol){
        if (arg[userPointChoiseRow][userPointChoiseCol].equals("*")){
            return true;
        } else {
            return false;
        }
    }

    String[][] isEmpty(String[][] arg, int userPointChoiseRow, int userPointChoiseCol){
        int count = 0;
        if (userPointChoiseRow == 0 && userPointChoiseCol == 0) {
            if (arg[userPointChoiseRow][userPointChoiseCol+1].equals("*")){
                count+=1;
            }if (arg[userPointChoiseRow+1][userPointChoiseCol+1].equals("*")) {
                count+=1;
            }if (arg[userPointChoiseRow+1][userPointChoiseCol].equals("*")) {
                count+=1;
            }

            String countValue = String.valueOf(count);
            arg[userPointChoiseRow][userPointChoiseCol] = countValue ;
            return arg;

        }else if (userPointChoiseRow == 0 && userPointChoiseCol < colNumber-1) {
            if (arg[userPointChoiseRow][userPointChoiseCol+1].equals("*")){
                count+=1;
            }if (arg[userPointChoiseRow+1][userPointChoiseCol+1].equals("*")) {
                count+=1;
            }if (arg[userPointChoiseRow+1][userPointChoiseCol].equals("*")) {
                count+=1;
            }if (arg[userPointChoiseRow+1][userPointChoiseCol-1].equals("*")) {
                count+=1;
            }if (arg[userPointChoiseRow][userPointChoiseCol-1].equals("*")) {
                count+=1;
            }

            String countValue = String.valueOf(count);
            arg[userPointChoiseRow][userPointChoiseCol] = countValue ;
            return arg;

        }else if (userPointChoiseRow == 0 && userPointChoiseCol == colNumber-1) {
            if (arg[userPointChoiseRow+1][userPointChoiseCol].equals("*")) {
                count+=1;
            }if (arg[userPointChoiseRow+1][userPointChoiseCol-1].equals("*")) {
                count+=1;
            }if (arg[userPointChoiseRow][userPointChoiseCol-1].equals("*")) {
                count+=1;
            }

            String countValue = String.valueOf(count);
            arg[userPointChoiseRow][userPointChoiseCol] = countValue ;
            return arg;

        }else if (userPointChoiseRow <  rowNumber-1 && userPointChoiseCol == 0) {
            if (arg[userPointChoiseRow][userPointChoiseCol+1].equals("*")){
                count+=1;
            }if (arg[userPointChoiseRow+1][userPointChoiseCol+1].equals("*")) {
                count+=1;
            }if (arg[userPointChoiseRow+1][userPointChoiseCol].equals("*")) {
                count+=1;
            }if (arg[userPointChoiseRow-1][userPointChoiseCol].equals("*")) {
                count+=1;
            }if (arg[userPointChoiseRow-1][userPointChoiseCol+1].equals("*")) {
                count+=1;
            }

            String countValue = String.valueOf(count);
            arg[userPointChoiseRow][userPointChoiseCol] = countValue ;
            return arg;

        }else if (userPointChoiseRow <  rowNumber-1 && userPointChoiseCol == colNumber-1 ) {
            if (arg[userPointChoiseRow+1][userPointChoiseCol].equals("*")) {
                count+=1;
            }if (arg[userPointChoiseRow+1][userPointChoiseCol-1].equals("*")) {
                count+=1;
            }if (arg[userPointChoiseRow][userPointChoiseCol-1].equals("*")) {
                count+=1;
            }if (arg[userPointChoiseRow-1][userPointChoiseCol-1].equals("*")) {
                count+=1;
            }if (arg[userPointChoiseRow-1][userPointChoiseCol].equals("*")) {
                count+=1;
            }

            String countValue = String.valueOf(count);
            arg[userPointChoiseRow][userPointChoiseCol] = countValue ;
            return arg;

        }else if (userPointChoiseRow ==  (rowNumber-1) && userPointChoiseCol == 0) {
            if (arg[userPointChoiseRow][userPointChoiseCol+1].equals("*")){
                count+=1;
            }if (arg[userPointChoiseRow-1][userPointChoiseCol].equals("*")) {
                count+=1;
            }if (arg[userPointChoiseRow-1][userPointChoiseCol+1].equals("*")) {
                count+=1;
            }

            String countValue = String.valueOf(count);
            arg[userPointChoiseRow][userPointChoiseCol] = countValue ;
            return arg;

        }else if (userPointChoiseRow ==  (rowNumber-1) && userPointChoiseCol < colNumber-1) {
            if (arg[userPointChoiseRow][userPointChoiseCol+1].equals("*")){
                count+=1;
            }if (arg[userPointChoiseRow][userPointChoiseCol-1].equals("*")) {
                count+=1;
            }if (arg[userPointChoiseRow-1][userPointChoiseCol-1].equals("*")) {
                count+=1;
            }if (arg[userPointChoiseRow-1][userPointChoiseCol].equals("*")) {
                count+=1;
            }if (arg[userPointChoiseRow-1][userPointChoiseCol+1].equals("*")) {
                count+=1;
            }

            String countValue = String.valueOf(count);
            arg[userPointChoiseRow][userPointChoiseCol] = countValue ;
            return arg;

        }else if (userPointChoiseRow ==  (rowNumber-1) && userPointChoiseCol == colNumber-1) {
            if (arg[userPointChoiseRow][userPointChoiseCol-1].equals("*")) {
                count+=1;
            }if (arg[userPointChoiseRow-1][userPointChoiseCol-1].equals("*")) {
                count+=1;
            }if (arg[userPointChoiseRow-1][userPointChoiseCol].equals("*")) {
                count+=1;
            }

            String countValue = String.valueOf(count);
            arg[userPointChoiseRow][userPointChoiseCol] = countValue ;
            return arg;

        }else {
            if (arg[userPointChoiseRow][userPointChoiseCol+1].equals("*")){
                count+=1;
            }if (arg[userPointChoiseRow+1][userPointChoiseCol+1].equals("*")) {
                count+=1;
            }if (arg[userPointChoiseRow+1][userPointChoiseCol].equals("*")) {
                count+=1;
            }if (arg[userPointChoiseRow+1][userPointChoiseCol-1].equals("*")) {
                count+=1;
            }if (arg[userPointChoiseRow][userPointChoiseCol-1].equals("*")) {
                count+=1;
            }if (arg[userPointChoiseRow-1][userPointChoiseCol-1].equals("*")) {
                count+=1;
            }if (arg[userPointChoiseRow-1][userPointChoiseCol].equals("*")) {
                count+=1;
            }if (arg[userPointChoiseRow-1][userPointChoiseCol+1].equals("*")) {
                count+=1;
            }

            String countValue = String.valueOf(count);
            arg[userPointChoiseRow][userPointChoiseCol] = countValue ;
            return arg;

        }
    }
}