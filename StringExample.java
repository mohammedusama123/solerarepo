package daytwo;

public class StringExample {
	public static void main(String[] args) {
		char[]c= {'h','e','l','l','o'};
		String s=new String(c);//takes array of characters as args
		String str="Hello";//will get dereferred and is collected by garbage collector
		String str1="   hi";
		System.out.println(str1);
		System.out.println(s);
		System.out.println(s.length());
        System.out.println(s.indexOf('e'));
        System.out.println(s.lastIndexOf('l'));
        System.out.println(s.substring(1));
        System.out.println(s.substring(1, 3));
        System.out.println(str1.trim());//removes leading and trailing spaces
        int num=1235;
        String s1=String.valueOf(num);//converts num value to string
        Integer i=Integer.parseInt(s1);//converts string s1 to integer class
        System.out.println(i);
        System.out.println(s1);
        String emptyString="";
        System.out.println(emptyString.isEmpty());//returns null pointer exception
        System.out.println(str.hashCode());
        String stripSpace=" hey ";
        System.out.println(stripSpace.stripLeading());
        String word=" hello world ";
        System.out.println(word.replaceAll("\\s",""));
        String paragraph="hello everyone, how are you.Hope you all are fine.hello";
        String[]stringParagraph=paragraph.split("[.]",2);
        for(String sentence:stringParagraph) {
        	System.out.println(sentence);
        }
	}

}
