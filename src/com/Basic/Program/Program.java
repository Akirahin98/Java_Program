package com.Basic.Program;

public class Program {

	public static void main(String[] args) {
        String s="testengineer";
        for(int i=0;i<s.length();i++){
            int count=1;
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
            System.out.println(s.charAt(i)+" occurance is "+ count);
            s=s.replaceAll(""+s.charAt(i), " ");
//            i--;
        }
    }
}
