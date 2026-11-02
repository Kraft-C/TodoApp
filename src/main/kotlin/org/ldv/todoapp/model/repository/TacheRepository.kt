package org.ldv.todoapp.model.repository

import org.ldv.todoapp.model.entity.Tache
import org.springframework.data.jpa.repository.JpaRepository

interface TacheRepository : JpaRepository<Tache, Long> {
}