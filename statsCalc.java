public class statsCalc extends calculator{
    private int[] arr = new int[5];

    statsCalc(int[] arr){
        this.arr = arr;
    }

    public static double median(int arr []){
        double mid = arr.length /2;
       return arr[mid];
    }

    public static void mode(int arr[]){
        int element =0;
        int count = 0;
        for(int i =0; i < arr.length - 1; i++){
            int tempElement = arr[i]; 
            int tempCount = 0;
            for(int j = 0; j < arr.length - 1; j++){
                if(arr[j] == element){
                    tempCount++;
                }
                if(tempCount > count){
                    element = tempElement;
                    count = tempCount;
                }
            }
        }
        System.out.println("The most frequent element is: " + element + " and it's frequency was: " + count);
    }

    public static double mean (int[] arr){
        int sum = 0;
        for(double num : arr){
            sum += num;
        }
        return sum / arr.length;
    }


    public static double stanDeviation( int[] arr){
        double avg = mean(arr);
        double n = arr.length; 
        double numerator = 0;
        for(int i = 0; i < arr.length; i ++){
           numerator += Math.pow((arr [i] - avg), 2);
        }
        double solution = Math.sqrt(numerator / (n - 1));

        return solution;
    }
}
