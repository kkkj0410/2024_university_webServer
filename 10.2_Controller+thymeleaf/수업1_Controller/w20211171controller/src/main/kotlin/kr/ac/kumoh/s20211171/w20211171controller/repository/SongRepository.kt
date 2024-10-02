package kr.ac.kumoh.s20211171.w20211171controller.repository

import kr.ac.kumoh.s20211171.w20211171controller.model.Song
import org.springframework.stereotype.Repository

@Repository
class SongRepository {

    private val songs = listOf(
        Song(1, "a", "b"),
        Song(2, "A", "b"),
        Song(3, "a", "b")
    )

    fun fetch() = songs

    fun getSong(index : Int) = songs[index]
}