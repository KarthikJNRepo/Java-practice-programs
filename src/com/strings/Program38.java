package com.strings;



public class Program38{
public static void main(String[] args) {
// For example, ab2ccccd -> ab24cd
String word = "ab2ccccdcdcc", encoding = "";
char ch[] = word.toCharArray(); for (int i = 0; i < ch.length; i++) {
int count = 1;
for (int j = i + 1; j < ch.length; j++) {
if (ch[i] == ch[j]) {
count++;
}
else
break;
}
if (count > 1) {
encoding += "" + count + ch[i];
}
else
encoding += ch[i];
i += count - 1;
}
System.out.println(encoding);
}
}

