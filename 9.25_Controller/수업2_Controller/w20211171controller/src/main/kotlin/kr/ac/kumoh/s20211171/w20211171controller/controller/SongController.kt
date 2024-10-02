package kr.ac.kumoh.s20211171.w20211171controller.controller

import kr.ac.kumoh.s20211171.w20211171controller.model.Song
import kr.ac.kumoh.s20211171.w20211171controller.service.SongService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SongController(val service: SongService) {
//    val title = listOf(
//        "song",
//        "AAA",
//        "bbb")



    @GetMapping("/song/list")
    fun getSongList():List<Song>{
        return service.getAllSongs();
    }
}