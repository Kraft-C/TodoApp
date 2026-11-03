package org.ldv.todoapp.controller.admin

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class UtilisateursControllerController {

    @RequestMapping("/admin/utilisateurs")
    fun utilisateurs(): String {
        return "admin/utilisateurs"
    }
}

