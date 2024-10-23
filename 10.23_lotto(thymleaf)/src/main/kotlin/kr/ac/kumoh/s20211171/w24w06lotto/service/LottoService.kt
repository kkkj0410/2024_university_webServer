package kr.ac.kumoh.s20211171.w24w06lotto.service

import kr.ac.kumoh.s20211171.w24w06lotto.model.LottoNumber
import kr.ac.kumoh.s20211171.w24w06lotto.repository.InMemoryLottoRepository
import org.springframework.stereotype.Service
import kotlin.random.Random


@Service
class LottoService(val lottoRepository : InMemoryLottoRepository) {
    fun getLuckyNumbers() : LottoNumber? {
        val numbers = mutableSetOf<Int>()

        while(numbers.size < 6){
            numbers.add(Random.nextInt(1,46))
        }
        val lottoNumbers = LottoNumber(numbers.toSortedSet().toIntArray())
        return lottoRepository.save(lottoNumbers)
    }


}