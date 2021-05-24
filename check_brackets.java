import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

class Bracket {
    Bracket(char type, int position) {
        this.type = type;
        this.position = position;
    }

    boolean Match(char c) {
        if (this.type == '[' && c == ']')
            return true;
        if (this.type == '{' && c == '}')
            return true;
        if (this.type == '(' && c == ')')
            return true;
        return false;
    }

    char type;
    int position;
}

class check_brackets {
	public static void main(String[] args) throws IOException {
        InputStreamReader input_stream = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input_stream);
        String text = reader.readLine();

        Stack<Bracket> opening_brackets_stack = new Stack<Bracket>();
        for (int position = 0; position < text.length(); ++position) {
            char next = text.charAt(position);

            if (next == '(' || next == '[' || next == '{') {
                // Process opening bracket, write your code here
                opening_brackets_stack.push(new Bracket(next, position));
            }

            if (next == ')' || next == ']' || next == '}') {
                // Process closing bracket, write your code here
            	if (opening_brackets_stack.isEmpty()) {
                    // either does not have ( before it
                    System.out.println(position + 1);
                    return;
                    }

        // Printing answer, write your code here
            System.out.println(opening_brackets_stack.isEmpty() ? "Brackets are balanced" :
            	opening_brackets_stack.peek().position + 1);
            }
        }
    }
public static void main(String[] args) throws IOException {
File folder = new File(C:\Users\seaso\Downloads\BracketChecker");
        if (! folder.exists()) {
        	InputStreamReader input_stream = new InputStreamReader(System.in);
        	BufferedReader reader = new BufferedReader(input_stream);
        	String text = reader.readLine();
        	checkBrackets(text);
        	reader.close();
        	return;
        }
        File[] files = folder.listFiles();
        Arrays.sort(files, new Comparator<File>(){
        	@Override
        	public int compare (File f1, File f2) {
        		return f1.getName().compareTo(f2.getName());
        	}
        }
        )
        ;
        for (File testfile : files) {
        	if (testfile.getName().equals("report")) continue;
        		System.out.print(testfile.getName() + ": ");
        		FileReader input_stream = new FileReader(testfile);
        		BufferedReader reader = new BufferedReader(input_stream);
        		String text = reader.readLine();
        			checkBrackets(text);
        	reader.close();
        }
	}
}