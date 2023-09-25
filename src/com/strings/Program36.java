package com.strings;

import java.util.HashMap;
import java.util.Map;

public class Program36
{
public static void main(String[] args)
{
String[] arr= {"ax","bx","ay","by","ai","aj","bx","by"};
String[] result=new String[arr.length];
Map<Character,Integer> map=new HashMap<>();
for(int i=0;i<arr.length;i++) {
char firstChar = arr[i].charAt(0);
if(map.containsKey(firstChar)&&map.get(firstChar)>=0)
{
Integer p = map.get(firstChar);
map.put(firstChar,-1);
result[i]=result[p];
result[p]=arr[i];
}
else {
result[i]=arr[i];
map.put(firstChar,i);
}



}
for(int i=0;i<arr.length;i++)
{
System.out.print(result[i]+" ");
}
}
}
