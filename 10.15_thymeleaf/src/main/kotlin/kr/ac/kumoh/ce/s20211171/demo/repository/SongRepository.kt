package kr.ac.kumoh.ce.s20211171.demo.repository

import kr.ac.kumoh.ce.s20211171.demo.domain.Song
import org.springframework.stereotype.Repository


@Repository
class SongRepository {
    protected val songs = listOf(
        Song(1, "사랑에 연습이 있었다면", "임재현"),
        Song(2, "테스형", "나훈아"),
        Song(3, "소주 한 잔", "임창정"),
    )

    val songsSize: Int
        get() = songs.size

    fun getSong(index: Int) = songs[index]

    fun fetchSong() = songs
}