package kr.ac.kumoh.ce.s20211171.demo.controller

import kr.ac.kumoh.ce.s20211171.demo.repository.SongRepository
import kr.ac.kumoh.ce.s20211171.demo.service.SongService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@Controller
class SongController(val service: SongService) {
    @GetMapping("/song/random")
    fun getRandomSong(model: Model): String {
        model.addAttribute("song", service.getRandomSong())
        return "random"
    }
}