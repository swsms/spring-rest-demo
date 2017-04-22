package net.art.pof.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class HistoryRestController {

    @Autowired
    private HistoryRepository repos;

    @GetMapping("/remember/{val}")
    public String rememberRequest(
            @PathVariable String val,
            @RequestHeader(value = "User-Agent") String agent
    ) {
        try {
            final HistoryEntry entry = new HistoryEntry(new Date(), agent, val);
            repos.saveAndFlush(entry);
            return String.format("Remembered: %s", val);
        } catch (Exception e) {
            return "Server error";
        }
    }

    @GetMapping("/history")
    public List<HistoryEntry> history() {
        return repos.findAll().stream()
                .sorted((h1, h2) -> h2.getRequested().compareTo(h1.getRequested()))
                .collect(Collectors.toList());
    }

}
