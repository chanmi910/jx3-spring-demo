package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello there, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
<<<<<<< HEAD
	System.out.println("aaaaaaabbbbbbbbbaccccc");
=======
	System.out.println("aaaaaaabbbbbbbbcccccba");
>>>>>>> e32fe99ff3172e48599680b25d992023f68a3c80
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }

    @RequestMapping("/")
    public String defaultEndpoint(@RequestParam(value="name", defaultValue="World") String name) {
        return String.format(template, name);
    }
}
