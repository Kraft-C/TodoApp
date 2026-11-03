package org.ldv.todoapp.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class MesTachesControllerController {

    @RequestMapping("/mes-taches")
    fun mesTaches(): String {
        return "mes-taches"
    }

}

