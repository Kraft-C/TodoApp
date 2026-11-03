package org.ldv.todoapp.controller.admin

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class TachesControllerController {

    @RequestMapping("/admin/taches")
    fun taches(): String {
        return "admin/tache"
    }

}
