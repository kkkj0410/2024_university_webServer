package kr.ac.kumoh.s20211171.w24w05thymleaf.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping


@Controller
class SongController {

    @GetMapping("/song/random")
    fun getRandomSong(model : Model):String{
        model.addAttribute("songTitle", "테스형")
        return "random"
    }
}