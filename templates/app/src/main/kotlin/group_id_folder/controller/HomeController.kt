package {{project_group_id}}.controller

import {{project_group_id}}.service.HomeService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController(private val homeService: HomeService) {

    @GetMapping("/home")
    fun getHome() = homeService.getHomeScreen()
}
