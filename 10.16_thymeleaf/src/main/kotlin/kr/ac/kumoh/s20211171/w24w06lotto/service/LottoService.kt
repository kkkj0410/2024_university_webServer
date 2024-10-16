package kr.ac.kumoh.s20211171.w24w06lotto.service

import org.springframework.stereotype.Service
import kotlin.random.Random


@Service
class LottoService {
    fun getLuckyNumbers() : Array<Int>{
        val numbers = arrayOf(0,0,0,0,0,0)

        var n = 0
        //indices : 인덱스 크기
        for(i in numbers.indices){
            do {
                n = Random.nextInt(0,45) + 1
            }while(numbers.contains(n))
                numbers[i] = n
        }

        numbers.sort()


        return numbers
    }
}