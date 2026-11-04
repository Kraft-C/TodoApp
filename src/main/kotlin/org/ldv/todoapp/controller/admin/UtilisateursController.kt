package org.ldv.todoapp.controller.admin

import org.ldv.todoapp.model.repository.TacheRepository
import org.ldv.todoapp.model.repository.UtilisateurRepository
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class UtilisateursControllerController (
    private val utilisateurRepository: UtilisateurRepository
){

    @RequestMapping("/admin/utilisateurs")
    fun utilisateurs(mode: Model): String {
        mode.addAttribute("listeUtilisateurs", utilisateurRepository.findAll())
        return "admin/utilisateurs"
    }
}

