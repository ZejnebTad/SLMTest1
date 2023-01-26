package at.fhtw.bic.slmtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RestC {

    public static void main(String[] args) {
        SpringApplication.run(RestC.class, args);
    }

    @GetMapping("/grade/{percentage}")
    public String getGrade(@PathVariable double percentage) {
        if (percentage >= 85) return "A - Sehr gut";
        else if (percentage >= 70) return "B - Gut";
        else if (percentage >= 60) return "C - Befriedigend";
        else if (percentage >= 50) return "D - Bestanden";
        else return " 5 - Nicht Bestanden";
    }
}