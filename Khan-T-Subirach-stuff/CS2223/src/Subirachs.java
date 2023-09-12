


public class Subirachs {

    public static void findCombinations(int[] input) {
        for (int i = 0; i < input.length - 3; i++) {
            for (int j = i + 1; j < input.length - 2; j++) {
                for (int k = j + 1; k < input.length - 1; k++) {
                    for (int l = k + 1; l < input.length; l++) {
                        if (input[i] + input[j] + input[k] + input[l] == 33) {
                            System.out.println("Combination " + input[i] + "," + input[j] + "," + input[k] + "," + input[l]);
                        }
                    }
                }
            }
        }
    }

    public static int findAllCombinations(int[] input) {
        int totalCombinations = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                for (int k = j + 1; k < input.length; k++) {
                    // The smallest possible combination is 3 numbers because no less than that can form the number 33
                    if (input[i] + input[j] + input[k] == 33) {
                        totalCombinations++;
                        System.out.println("Combination " + input[i] + "," + input[j] + "," + input[k]);
                    }
                    for (int l = k + 1; l < input.length; l++) {
                        if (input[i] + input[j] + input[k] + input[l] == 33) {
                            totalCombinations++;
                            System.out.println("Combination " + input[i] + "," + input[j] + "," + input[k] + "," + input[l]);
                        }
                        for (int m = l; m < input.length; m++) {
                            if (input[i] + input[j] + input[k] + input[l] + input[m] == 33) {
                                totalCombinations++;
                                System.out.println("Combination " + input[i] + "," + input[j] + "," + input[k] + "," + input[l] + "," + input[m]);
                            }
                            for (int n = m; n < input.length; n++) {
                                if (input[i] + input[j] + input[k] + input[l] + input[m] + input[n] == 33) {
                                    totalCombinations++;
                                    System.out.println("Combination " + input[i] + "," + input[j] + "," + input[k] + "," + input[l] + "," + input[m] + "," + input[n]);
                                }
                                for (int o = n; o < input.length; o++) {
                                    if (input[i] + input[j] + input[k] + input[l] + input[m] + input[n] + input[o] == 33) {
                                        totalCombinations++;
                                        System.out.println("Combination " + input[i] + "," + input[j] + "," + input[k] + "," + input[l] + "," + input[m] + "," + input[n] + "," + input[o]);
                                    }
                                    for (int p = o; p < input.length; p++) {
                                        if (input[i] + input[j] + input[k] + input[l] + input[m] + input[n] + input[o] + input[p] == 33) {
                                            // I think the longest combination will be of size 8
                                            totalCombinations++;
                                            System.out.println("Combination " + input[i] + "," + input[j] + "," + input[k] + "," + input[l] + "," + input[m] + "," + input[n] + "," + input[o] + "," + input[p]);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Total number of combinations " + totalCombinations);
        return totalCombinations;
    }



    public static void main(String args[]) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 11, 12, 13, 14, 14, 15};
        System.out.println("Part 3a");
        findCombinations(numbers);
        System.out.println("Part 3b");
        findAllCombinations(numbers);


    }
}

