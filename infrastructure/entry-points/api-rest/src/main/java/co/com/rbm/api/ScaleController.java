package co.com.rbm.api;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@NoArgsConstructor
public class ScaleController {

    @GetMapping("/fill-memory")
    @ResponseStatus(HttpStatus.OK)
    public String fillMemory(long gigas) {
        log.info("GET /jobs is used");
        List<byte[]> memoryFillers = new ArrayList<>();
        long totalMemoryFilled = 0;
        long maxMemoryToFill =  gigas * 1024 * 1024 * 1024; // 8 GB

        try {
            while (totalMemoryFilled < maxMemoryToFill) {
                byte[] byteArray = new byte[1024 * 1024]; // 1 MB
                memoryFillers.add(byteArray);
                totalMemoryFilled += byteArray.length;
                System.out.println("Total memory filled: " + (totalMemoryFilled / (1024 * 1024)) + " MB");
            }
        } catch (OutOfMemoryError e) {
            System.out.println("Out of memory after filling " + (totalMemoryFilled / (1024 * 1024)) + " MB");
            return "BAD";
        }
        return "OK";
    }
}


