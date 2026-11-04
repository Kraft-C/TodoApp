package org.ldv.todoapp.controller.admin

import org.ldv.todoapp.model.repository.TacheRepository
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class TachesControllerController (
    private val tacheRepository: TacheRepository
){

    @RequestMapping("/admin/taches")
    fun taches(mode: Model): String {
        mode.addAttribute("listeTaches", tacheRepository.findAll())
        return "admin/tache"
    }

}
