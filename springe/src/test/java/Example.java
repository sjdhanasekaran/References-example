
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;
@RestController
@EnableAutoConfiguration
public class Example {
    int a = 10;
    int b = 5;

    @RequestMapping("/")
    Integer add() {
        return a + b;
    }f
/*
    @RequestMapping("/")
    Integer sub() {
        return a - b;

    }

    @RequestMapping("/")
    Integer mul() {
        return a * b;
    }

    @RequestMapping("/")
    Integer div() {
        return a / b;
    }
    */
    public static void main(String[] args) throws Exception {

        SpringApplication.run(Example.class, args);
        /*SpringApplication.run(e.sub(), args);
        SpringApplication.run(e.mul(), args);
        SpringApplication.run(e.div(), args);*/

    }
}
