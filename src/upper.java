
import java.io.IOException;
import java.nio.file.*;
import java.util.stream.Stream;

public class upper {


        public static void main(String[] args) throws IOException {
            Path p = Paths.get("C:\\Users\\hp\\OneDrive\\Documents\\c2.txt");
            Stream<String> str= Files.lines(p);
            str.map(line -> {

                return  line.toUpperCase();

            }).forEach( line -> System.out.println(line));
        }
    }


