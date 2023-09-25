package com.strings;

public class Program37 {

public static void main(String[] args) {
String[] sentence = { "Strings are an array of characters", "Sentences are an array of words." };
String[] phrases = { "an array of", "sentences are strings", "sentences are strings" };
String concat = "";



for (int i = 0; i < phrases.length; i++) {
for (int j = 0; j < sentence.length; j++) {
if (sentence[j].contains(phrases[i])) {
int add = j + 1;
concat += add + ",";
}
}
int phase = i + 1;
if (concat != "") {
System.out.println(
"Phrase" + phase + " is present in sentences:" + concat.substring(0, concat.length() - 1));
} else
System.out.println("Phrase" + phase + " is present in sentences:None");
concat = "";
}
}



}
