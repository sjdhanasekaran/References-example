import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        String[] a=new String[]{"a","b","c","d"};
        List<String> x= Arrays.asList(a);
        x.forEach(System.out::println);
	}
}