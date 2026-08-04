class max_min{
  public static void main(String[] args){
  int[] arr={10,12,45,78,14,23,48,77};
  int max=Integer.MIN_VALUE;
  int min=Integer.MAX_VALUE;
  for(int i=0;i<arr.length;i++){
    if(arr[i]>max){
      max=arr[i];
    }
    if(arr[i]<min){
      min=arr[i];
    }
  }
  System.out.println(max+" "+min);
}
}
