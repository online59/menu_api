package ku.menu.controller;

import ku.menu.entity.Menu;
import ku.menu.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private MenuService service;

    @GetMapping
    public List<Menu> getAllMenus() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Menu getOneById(@PathVariable UUID id) {
        return service.getById(id);
    }

    @GetMapping("/name/{name}")
    public Menu getMenuByName(@PathVariable String name) {
        return service.getMenuByName(name);
    }

    @GetMapping("/category/{category}")
    public List<Menu> getMenuByCategory(@PathVariable String category) {
        return service.getMenuByCategory(category);
    }


    @PostMapping
    public Menu create(@RequestBody Menu menu) {
        return service.create(menu);
    }

    @PutMapping
    public Menu update(@RequestBody Menu menu) {
        return service.update(menu);
    }

    @DeleteMapping("/{id}")
    public Menu delete(@PathVariable UUID id) {
        return service.delete(id);
    }
}
