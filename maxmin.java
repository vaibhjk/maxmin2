public final class Array{
  public static void main(String args[])
  {
    int arr[]={2,1,3,4};
    search(arr);
  }
  
  static void search(int arr[])
  {
    if(arr==null){ return;}
    int min=arr[0];
    int max=arr[0];
    for(int i=0;i<arr.length;i++){
      if(arr[i]<min){
        min=arr[i]:}
      if(arr[i]>max){
        max=arr[i];}
    }
    System.out.println("maximum:"+max);
    System.out.println("minimum:"+min);
  }
