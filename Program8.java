package string_programs;
//Finding duplicate characters in a given string
public class Program8 {
	public static void main(String[] args) {
		String text = "pushpavalli";
		int count=0;
		char [] ch=text.toCharArray();
		for(int i=0; i<ch.length; i++) {
			for(int j=i+1; j<ch.length; j++) {
				if(ch[i]==ch[j]) {
					System.out.println("The duplicate characters in a given string is:" + ch[j]);
				count++;

			}

		}
		}
		System.out.println("The duplicate characters in a given string is: " + count);

	}

}
