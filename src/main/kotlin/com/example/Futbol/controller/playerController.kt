package com.example.Futbol.controller

import com.example.Futbol.model.player
import com.example.Futbol.service.playerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/player")
class playerController {
    @Autowired  //inyectar un service
    lateinit var playerService: playerService

    @GetMapping
    fun list():List<player>{
        return playerService.list()
    }

    @PostMapping
    fun save(@RequestBody player: player):player{
        return playerService.save(player)
    }
}