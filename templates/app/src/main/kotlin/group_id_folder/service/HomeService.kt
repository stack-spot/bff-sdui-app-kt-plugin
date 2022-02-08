package {{project_group_id}}.service

import {{project_group_id}}.beagle.HomeScreen
import org.springframework.stereotype.Service

@Service
class HomeService {

    fun getHomeScreen() = HomeScreen
}
