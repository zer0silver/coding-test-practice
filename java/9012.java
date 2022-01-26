import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
	public static String search(String s) {
		
		Stack<Character> stack = new Stack<Character>();
		
		for(int i =0; i<s.length(); i++) {
			char c = s.charAt(i);
			
			if(c=='(') {
				stack.push(c);
			}
			else if(stack.empty()){
				return "NO";
			}
			else {
				stack.pop();
			}
		}
		
		if(stack.empty()) {
			return "YES";
		}else {
			return "NO";
		}
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<n; i++) {
			sb.append(search(br.readLine())).append('\n');
		}
		
		System.out.println(sb);
		
	}
}
