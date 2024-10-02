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
        return service.getAllSongs()
    }

    @GetMapping("/song/random")
    fun getRandomSong():String{
        val song = service.getRandomSong();
        return """
            <!DOCTYPE HTML>
            <html>
                <head>
                    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
                </head>
            <body>
            <div class="card text-center">
            
              <div class="card-header">
                추천 노래
              </div>
              <div class="card-body">
                <h5 class="card-title">${song.title}</h5>
                <p class="card-text">${song.singer}</p>
                <a 
                    href="https://www.youtube.com/results?search_query=노래방+${song.title}" 
                    class="btn btn-primary">
                    노래방
                </a>
              </div>
              <a 
                href="https://www.youtube.com/results?search_query=${song.title}" 
                class="btn btn-secondary">
                뮤직 비디오
              </a>
            </div>
            </body>
            </html>
            """.trimIndent()
    }
}