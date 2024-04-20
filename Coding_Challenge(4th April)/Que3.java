
class Que3{
    public static void main(String[] args){ 
        int arr[]=new int[] {2, 7, 11, 15};
        int sum=9;
        int x=0;
    for (int i=0;i<arr.length-1;i++){
        for (int j=i+1; j<arr.length;j++){
            x=arr[i]+arr[j];
            if(x==sum)
            System.out.print("["+i+","+j+"]");
            } 
        }
    }
}