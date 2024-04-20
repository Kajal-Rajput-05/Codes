class Que5 {
 
    static int rept(int arr[], int n){
        for (int i = 0; i < n; i++) {
            int j;
            for (j = 0; j < n; j++)
                if (i != j && arr[i] == arr[j])
                    break;
            if (j == n)
                return arr[i];
        }
 
        return -1;
    }
 
    public static void main(String[] args){
        int arr[] = { 11, 22, 33, 22, 11, 55 };
        int n = arr.length;
        System.out.print(rept(arr, n));
    }
}