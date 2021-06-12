class ATM {
    public int countBanknotes(int sum) {
        int currentSum = sum;
        int numberNominals = 0, currentNumberNominals = 0;
        int[] nominals = new int[]{500, 200, 100, 50, 20, 10, 5, 2, 1};
        
        int index = 0;
        while (index < nominals.length) {
            if (currentSum >= nominals[index]) {
                currentNumberNominals = currentSum / nominals[index];
                numberNominals += currentNumberNominals;
                currentSum = currentSum - currentNumberNominals * nominals[index];
            }
            index++;
        }
        return numberNominals;
    }
 }
