package kr.ac.kumoh.s20211171.w24w06lotto.controller

import kr.ac.kumoh.s20211171.w24w06lotto.service.LottoService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody


@Controller
class LottoController(val service : LottoService) {

    @GetMapping("/lotto/numbers")
    fun generateNumbers(model : Model) : String?{
        val lottoNumbers = service.getLuckyNumbers()

        if(lottoNumbers == null){
            return null
        }

        model.addAttribute("numbers", lottoNumbers.numbers);
        return "lotto";
    }


}