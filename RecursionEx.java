class RecursionEx{
public int sum(int num){
if(num==1){
return 1;
}
else{
return sum(num-1)+num;
}
}
public static void main(String [] args){
RecursionEx obj=new RecursionEx();
System.out.println(obj.sum(4));
}
}