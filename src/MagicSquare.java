public class MagicSquare {

    /**
     *
     * @param array2d
     * @return the sum of the first row in array2d.
     */
    public static int calculateCheckSum(int[][] array2d) {
        int sum = 0;
        for(int i = 0; i < array2d.length;){
            for(int k = 0; k < array2d[i].length; k++){
                sum += array2d[i][k];
            }
        }
        return sum;
    }

    /**
     *
     * @param array2d
     * @param checkSum
     * @return whether the sum of each row in array2d is equal to checkSum or not.
     *         Because we have already determined the sum of the first row
     *         via the method 'calculateCheckSum', this method can begin
     *         iterating from the second row.
     */
    public static boolean magicRows(int[][] array2d, int checkSum) {
        int sumRow = 0;
        int count = 0;
        checkSum = calculateCheckSum(array2d);
        boolean determine = false;
        for(int i = 1; i < array2d.length;){
            for(int k = 0; k < array2d[i].length; k++){
                sumRow += array2d[i][k];
                i++;
                if (sumRow == checkSum){
                    count++;

                }
            }
            if (count == array2d[i].length){
                determine = true;
            }
        }

       return determine;
    }

    /**
     *
     * @param array2d
     * @param checkSum
     * @return whether the sum of each column in array2d is equal to checkSum or not.
     */
    public static boolean magicColumns(int[][] array2d, int checkSum) {
        int sumCol = 0;
        int count = 0;
        checkSum = calculateCheckSum(array2d);
        boolean determine = false;
        for(int i = 0; i < array2d.length;){
            for(int k = 0; k < array2d[i].length; k++){
                sumCol += array2d[i][k];
                k++;
                if (sumCol == checkSum){
                    count++;

                }
                if (count == array2d[k].length){
                    determine = true;
                }
            }

        }

        return determine;

    }

    /**
     *
     * @param array2d
     * @param checkSum
     * @return whether the sum of each of the two main diagonals is equal to checkSum or not.
     */
    public static boolean magicDiagonals(int[][] array2d, int checkSum) {
        int sumDiag = 0;

        checkSum = calculateCheckSum(array2d);
        int determine = 0;
        boolean check = false;
        for(int i = array2d.length; i <= array2d.length;){
            for(int k = array2d[i].length; k <= array2d[i].length;){
                sumDiag += array2d[i][k];
            k--;
            i--;
            }
            if (sumDiag == checkSum){
                determine++;
            }
        }
        for(int i = 0; i <= array2d.length;){
            for(int k = 0; k <= array2d[i].length;){
                sumDiag += array2d[i][k];
                i++;
                k--;
            }
            if (sumDiag == checkSum){
                determine++;
            }
        }

        if (determine == 2){
            check = true;
        }

        return check;
    }

    /**
     *
     * @param array2d
     * @return whether array2d is magic or not.
     */
    public static boolean isMagic(int[][] array2d) {
        boolean isMagic = false;
        if (magicRows() && magicColumns() && magicDiagonals() = calculateCheckSum()){
            isMagic = true;
        }
        return isMagic;
    }
}
