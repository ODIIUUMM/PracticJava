package org.example.Dictionary;

import java.util.*;

public class Dictionary {
   private Map<String, List<String>> diction;

   public Dictionary() {
       diction = new HashMap<>();
   }

   public void newWord (String word, String transl) {
       diction.put(word, new ArrayList<String>());
       diction.get(word).add(transl);
   }

   public void addWord(String word) {
       if(!diction.containsKey(word)) {
           diction.put(word, new ArrayList<String>());
       } else {
           System.out.println("Такое слово уже существует");
       }
   }

   public void clearWord (String word) {
       if(diction.containsKey(word)) {
           diction.remove(word);
       }
   }

   public void addTransl(String word, String transl) {
       if(diction.containsKey(word)) {
           diction.get(word).add(transl);
       } else {
           System.out.println("Этого слова еще нет в словаре");
       }

   }

   public void clearTransl(String word) {
       if(diction.containsKey(word)) {
           diction.get(word).clear();
       } else {
           System.out.println("Этого слова еще нет в словаре");
       }
   }

   public void showDict() {
       diction.forEach((key, value) -> {
           System.out.println(key + " " + value);
       });
    }


}
