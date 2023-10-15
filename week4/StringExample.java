class StringExample {
public static void main(String[] args) {
String st = new String("Wipro Technologies");

StringBuffer sb = new StringBuffer("rajalakshmi engineering");

String result1 = st.substring(6,12);
String result2 = st.substring(6);
String result3 = sb.substring(6,12);
System.out.println(st.length());
System.out.println("Substring of String st : "+result1);
System.out.println("Substring of StringBuffer sb (with singleargument): "+result2);
System.out.println("Substring of StringBuffer sb (with twoarguments) : "+result3); 
  }
}