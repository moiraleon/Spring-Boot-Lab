@RestController
class ThisWillActuallyRun {

    @GetMapping("/")
    String home() {
        return "Hello, World!"
    }

}
//when running moleon@MacBook-Pro-2 ~ % curl localhost:8080
//Hello, World!%       //functioning
