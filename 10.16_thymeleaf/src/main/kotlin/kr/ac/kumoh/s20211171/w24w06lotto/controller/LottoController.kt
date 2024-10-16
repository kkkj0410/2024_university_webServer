package kr.ac.kumoh.s20211171.w24w06lotto.controller

import kr.ac.kumoh.s20211171.w24w06lotto.service.LottoService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping


@Controller
class LottoController(val service : LottoService) {

    @GetMapping("/lotto/numbers")
    fun generateNumbers(model : Model) : String{

        model.addAttribute("numbers", service.getLuckyNumbers());

        return "lotto";
    }

}