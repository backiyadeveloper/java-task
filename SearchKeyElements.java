import java .util.Arrays;
class SearchKeyElements{
public static void main(String [] args){
int arr[]={3,5,7,8,1,34,78};
System.out.println("assending order:");
Arrays.sort(arr);
for(int i:arr){
System.out.print(i +" ");
}
int search=7,start=arr[0],end=arr.length-1;
System.out.println((start+end)/2);
while(start<=r){
int mid=start+end/2;
if(arr[mid]==search){
System.out.println(mid);
}
else if(arr[mid]>search){
end=mid+1;
}
}
}
}