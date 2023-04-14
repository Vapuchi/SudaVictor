package com.example.Futbol.service

import com.example.Futbol.model.player
import com.example.Futbol.repository.playerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service //avisar al compilador que vamos a iyectar un servicio y un servicio inyecta un controller
class playerService {
    @Autowired //
    lateinit var playerRepository: playerRepository

    fun list ():List<player>{
        return playerRepository.findAll() //llama al metodo del metodo del repositorio y llama a cada uno de los metodos
    }
    fun save (player: player):player{
        return playerRepository.save(player)
    }

}