@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class add {
    @GetMapping("/add/{A}/{B}")
    public String add(@PathVariable("A") int a, @PathVariable("B") int b) {
        return "Addition = " + (a + b);
    }
}