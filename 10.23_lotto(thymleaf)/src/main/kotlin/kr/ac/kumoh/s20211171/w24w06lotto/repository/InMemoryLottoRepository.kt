package kr.ac.kumoh.s20211171.w24w06lotto.repository

import kr.ac.kumoh.s20211171.w24w06lotto.model.LottoNumber
import org.springframework.stereotype.Repository

@Repository
class InMemoryLottoRepository : LottoRepository{
    private var storedLottoNumber : LottoNumber? = null

    override fun save(lottoNumber : LottoNumber) : LottoNumber?{
        this.storedLottoNumber = lottoNumber

        return this.storedLottoNumber
    }
    override fun find() : LottoNumber?{
        return this.storedLottoNumber
    }
}