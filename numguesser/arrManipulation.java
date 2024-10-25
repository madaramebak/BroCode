public class arrManipulation{
    public static void sort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n - 1; i++ ){
            int min = i;
            for(int j = i + 1; j < n ; j++){
                if(arr[min] > arr[j]){
                    min = j; 
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

    }

     public static int findMax(int[] arr){
        sort(arr);
        return arr[arr.length-1];
    }

    public static int findMin(int[] arr){
        sort(arr);
        return arr[0];
    }

    public static int findAverage(int[] arr){
        int sum = 0;
        for(int num: arr){
            sum += num;
        }
        int average = sum / (arr.length);
        return average;
    }

    public static void reverseArr(int[] arr){
        int point1 = 0;
        int point2 = arr.length - 1;
        while(point1 <= point2){
            int temp = arr[point1];
            arr[point1] = arr[point2];
            arr[point2] = temp;
            point1++;
            point2--;
        }

    }

    
    public static void main(String[] args) {
        int[] arr = {64, 75, 12, 6, 11}; 
        System.out.println("Original array:");
        printArray(arr); 
        
        int max = findMax(arr); 
        int avg = findAverage(arr);

        System.out.println("Here is the max: " + max);
        System.out.println("Here is the average " + avg);

        reverseArr(arr);
        System.out.println("Reversed array: ");
        printArray(arr); 
    }

    
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println(); 
    }

}