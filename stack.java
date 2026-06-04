// import java.util.Stack;

import java.util.*;
public class stack{
public static void main(String[] args) {
    Stack<Integer>s=new Stack<>();
    s.push(10);
    s.push(20);
    s.push(30);
    s.push(40);
    s.push(50);
//     System.out.println("originl satck is : "+s);
//  Stack<Integer>temp=new Stack<>();
//  temp.addAll(s);
//  System.out.println("temp : "+temp);


int target=30;
boolean found=false;
for(int i=0;i<s.size();i++){
    if(s.get(i)==target){
        found=true;
        break;
    }
}
if(found){
    System.out.println("target is present");
}
    else{
        System.out.println("not present");
    }



// System.out.println("original stack : "+s);
//  Stack<Integer>temp=new Stack<>();
//  while(!s.isEmpty()){
//     temp.push(s.pop());
//  }
//  System.out.println(temp);


// int count=0;
// while(!s.isEmpty()){
//     s.pop();
//     count++;
// }
// System.out.println("count is : " +count);



//      Stack<Integer>temp=new Stack<>();
// while(!s.isEmpty()){
//     temp.push(s.pop());
// }
// System.out.println(temp);
// if(s==temp){
//     System.out.println("string is palindrome");
// }
// else{
//     System.out.println("Not palindrome");
// }


// System.out.println(s);
// System.out.println("rempoved val : "+s.pop());
// System.out.println(s.peek());
// System.out.println(s.isEmpty());
// System.out.println(s.size());
// while(!s.isEmpty()){
//     System.out.println(s.pop());
// }

//  Stack<Integer>temp=new Stack<>();
// while(!s.isEmpty()){
//     temp.push(s.pop());
// }



// String str="hello";
// Stack<Character> st=new Stack<>();
// for(char ch:str.toCharArray()){
//     st.push(ch);
// }
// while(!st.isEmpty()){
//     System.out.println(st.pop());
// }


// String str="mam";
//  Stack<Character> st=new Stack<>();
//  for(char ch:str.toCharArray()){
//     st.push(ch);
// }
// String rev="";
// while(!st.isEmpty()){
//     rev+=st.pop();
// }
//  if(str.equals(rev)){
//     System.out.println("palindrome");
//  }
//  else{
//     System.out.println("Not palindrome");
//  }



}
}