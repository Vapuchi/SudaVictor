package com.example.Futbol.repository

import com.example.Futbol.model.player
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository   //EL JPA al heredar de la clase player puede realizar la acciones del CRUD
interface playerRepository:JpaRepository<player, Long> {


}