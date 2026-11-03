package org.ldv.todoapp.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class MesInfosControllerController {

    @GetMapping("/mes-infos")
    fun mesInfos(): String {
        return "mes-infos"
    }

}
