package kr.ac.kumoh.s20211171.w20211171controller.service

import kr.ac.kumoh.s20211171.w20211171controller.model.Song
import kr.ac.kumoh.s20211171.w20211171controller.repository.SongRepository
import org.springframework.stereotype.Service

@Service
class SongService(val songRepository : SongRepository) {

    fun getAllSongs():List<Song>{
        return listOf(
            Song(1,"a","b")
        )
    }

}