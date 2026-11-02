package org.ldv.todoapp.model.repository

import org.ldv.todoapp.model.entity.Utilisateur
import org.springframework.data.jpa.repository.JpaRepository

interface UtilisateurRepository : JpaRepository<Utilisateur, Long> {
}