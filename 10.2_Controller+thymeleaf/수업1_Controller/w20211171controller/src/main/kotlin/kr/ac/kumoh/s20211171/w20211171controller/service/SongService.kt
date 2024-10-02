package kr.ac.kumoh.s20211171.w20211171controller.service

import kr.ac.kumoh.s20211171.w20211171controller.model.Song
import kr.ac.kumoh.s20211171.w20211171controller.repository.SongRepository
import org.springframework.stereotype.Service
import kotlin.random.Random

@Service
class SongService(val repository : SongRepository) {

    fun getAllSongs():List<Song>{
        return listOf(
            Song(1,"a","b")
        )
    }

    fun getRandomSong():Song{
        return repository.getSong(Random.nextInt(repository.songs.size));
    }

}