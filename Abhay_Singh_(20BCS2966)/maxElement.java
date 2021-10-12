import java.util.*;

class NishuArrayInput
{
  NishuArrayInput(int num,int arr[]){
    Scanner input = new Scanner(System.in);
    for(int i=0;i<num;i++){
      System.out.print("Drop the "+i+" element:\n");
      arr[i]=input.nextInt();
    }
  }
  void outputMax(int num,int arr[]){
    int max = Arrays.stream(arr).max().getAsInt();
    System.out.print("Max of element in the given Array is :\n"+max);
  }
}

public class maxElement {
  static public void main(String[] agrs){
    Scanner input = new Scanner(System.in);
    System.out.print("Drop Total Number Of Elements in Array:\n");
    int num;
    num=input.nextInt();
    int[] arr = new int[num];
    NishuArrayInput MansaviObject = new NishuArrayInput(num,arr);
    MansaviObject.outputMax(num,arr);
  }
}