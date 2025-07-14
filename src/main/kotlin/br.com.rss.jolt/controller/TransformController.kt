package br.com.rss.jolt.controller

import com.bazaarvoice.jolt.Chainr
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import org.springframework.web.bind.annotation.*

@RestController
class TransformController {

    private val mapper = jacksonObjectMapper()

    @PostMapping("/transform")
    fun transform(
        @RequestParam inputJson: String,
        @RequestParam joltSpec: String
    ): Any {
        val inputMap: Any = mapper.readValue(inputJson)
        val specList: List<Any> = mapper.readValue(joltSpec)
        val chainr = Chainr.fromSpec(specList)
        return chainr.transform(inputMap)
    }
}
