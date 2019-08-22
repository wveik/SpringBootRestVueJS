package letscode.sarafan.controller;

import letscode.sarafan.exceptions.NotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("message")
public class MessageController {

    public List<Map<String, String>> message =
            new ArrayList<Map<String, String>>(){{
                add(new HashMap<String, String>() {{ put("id", "1");put("text", "First message"); }});
                add(new HashMap<String, String>() {{ put("id", "2");put("text", "Second message"); }});
                add(new HashMap<String, String>() {{ put("id", "3");put("text", "Third message"); }});
            }};

    @GetMapping
    public List<Map<String, String>> list() {
        return message;
    }

    @GetMapping("{id}")
    public Map<String, String> getOne(@PathVariable String id) {
        return message.stream()
                .filter(message -> message.get("id").equals(id))
                .findFirst()
                .orElseThrow(NotFoundException::new);
    }
}
