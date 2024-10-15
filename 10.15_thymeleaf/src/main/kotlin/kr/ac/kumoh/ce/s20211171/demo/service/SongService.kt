package kr.ac.kumoh.ce.s20211171.demo.service

import kr.ac.kumoh.ce.s20211171.demo.repository.SongRepository
import org.springframework.stereotype.Service
import kotlin.random.Random


@Service
class SongService(val repository: SongRepository) {
    fun getRandomSong() = repository.getSong(Random.nextInt(repository.songsSize))
    fun getAllSongs() = repository.fetchSong()
}