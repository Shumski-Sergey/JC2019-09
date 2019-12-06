package tereshko.File;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test1 {
    public static void main(String[] args) throws IOException {
        byte[] bytes = Files.readAllBytes(Paths.get("src/tereshko/Collection/Text6.txt"));
        Map<Integer, Long> collect = IntStream.range(0, bytes.length).map(i -> bytes[i]).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}