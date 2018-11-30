package springfive.twittertracked.domain.resource

import org.springframework.web.bind.annotation.*
import springfive.twittertracked.domain.TrackedHashTag
import springfive.twittertracked.domain.service.TrackedHashTagService

@RestController
@RequestMapping("/api/tracked-hash-tag")
class TrackedHashTagResource(private val service: TrackedHashTagService) {
    
    @GetMapping
    fun all() = this.service.all()

    @PostMapping
    fun save(@RequestBody hasTag: TrackedHashTag) = this.save(hasTag)
}