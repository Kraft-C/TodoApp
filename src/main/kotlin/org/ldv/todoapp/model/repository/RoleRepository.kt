package org.ldv.todoapp.model.repository

import org.ldv.todoapp.model.entity.Role
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface RoleRepository : JpaRepository<Role, Long> {
    fun findByNom(nom: String): Role?

    @Query("""
        SELECT r
        FROM Role r
    """)
    fun findAllAvecRole(): List<Role>
}