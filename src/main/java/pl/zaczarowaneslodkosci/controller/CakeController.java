package pl.zaczarowaneslodkosci.controller;

import org.springframework.web.bind.annotation.*;
import pl.zaczarowaneslodkosci.dto.CakeDtoRequest;
import pl.zaczarowaneslodkosci.dto.CakeDtoResponse;
import pl.zaczarowaneslodkosci.service.CakeService;

import java.util.List;

@RestController
public class CakeController {

    private final CakeService cakeService;

    public CakeController(CakeService cakeService) {
        this.cakeService = cakeService;
    }

    @GetMapping("/{id}")
    public CakeDtoResponse get(@PathVariable Long id) {
        return cakeService.get(id);
    }

    @PostMapping
    public CakeDtoResponse add(@RequestBody CakeDtoRequest cakeDtoRequest) {
        return cakeService.add(cakeDtoRequest);
    }

    @GetMapping
    public List<CakeDtoResponse> search(String name) {
        return cakeService.search(name);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        cakeService.delete(id);
    }
}